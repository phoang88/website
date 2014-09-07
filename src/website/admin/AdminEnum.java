package website.admin;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Link;
import com.google.appengine.api.datastore.Text;

public enum AdminEnum {
	ADD_SONG ("html/admin/addSong.html") {
		@Override
		public void doOperation( HttpServletRequest req ) {
			String title = req.getParameter("title");
	        String artist =req.getParameter("artist");
	        Link url = new Link( req.getParameter("url") );
	        String playlist = req.getParameter("playlist");
	        Text lyrics = new Text( req.getParameter("lyrics") );
	        
	        Entity song = new Entity("Song", title + artist + playlist);
	        song.setProperty("title", title);
	        song.setProperty("artist", artist);
	        song.setProperty("url", url);
	        song.setProperty("playlist", playlist);
	        song.setProperty("lyrics", lyrics);

	        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	        datastore.put(song);
		}
	},
	DELETE_SONG ("html/admin/deleteSong.html") {
		@Override
		public void doOperation(HttpServletRequest req) {
			String title = req.getParameter("title");
	        String artist =req.getParameter("artist");
	        String playlist = req.getParameter("playlist");

	        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	        datastore.delete(KeyFactory.createKey("Song", title + artist + playlist));
		}
	};
	
	public static Map<String, AdminEnum> lookup = new HashMap<String, AdminEnum>();
	protected String html;
	
	static {
		for( AdminEnum e : AdminEnum.values() ){
			lookup.put(e.name(), e);
		}
	}
	
	AdminEnum( String html ){
		this.html = html;
	}
	
	public abstract void doOperation( HttpServletRequest req );
}
