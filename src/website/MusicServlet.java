package website;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import website.bean.MusicBean;
import website.bean.Song;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Link;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Text;

public class MusicServlet extends HttpServlet {

	private static final long serialVersionUID = -99632442535524157L;
	private RequestDispatcher musicJsp;
	private MusicBean musicBean;
    
    public void init(ServletConfig config) throws ServletException {
            ServletContext context = config.getServletContext();
            musicJsp = context.getRequestDispatcher("/WEB-INF/jsp/music.jsp");
    }
     
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    	       throws ServletException, IOException {
  
    	setPlaylists();
    	req.setAttribute("musicBean", musicBean);
    	musicJsp.forward(req, resp);
    }
    
    private void setPlaylists()
    {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query query = new Query("Song");
        PreparedQuery pq = datastore.prepare(query);

        musicBean = new MusicBean();
        Hashtable<String, ArrayList<Song>> playlists = new Hashtable<String, ArrayList<Song>>();
        Hashtable<String, Song> musicLibrary = new Hashtable<String, Song>();
        
        for (Entity result : pq.asIterable()) {
	          Song song = new Song();         
	          song.setTitle((String) result.getProperty("title"));
	          song.setArtist((String) result.getProperty("artist"));
	          song.setUrl((Link) result.getProperty("url"));
	          song.setPlaylist((String) result.getProperty("playlist"));
	          song.setLyrics( ( (Text) result.getProperty("lyrics") ).getValue() );
	          
	          if(playlists.containsKey(song.getPlaylist()))
	          {
	        	  playlists.get(song.getPlaylist()).add(song);
	          }
	          else
	          {	   
	        	  ArrayList<Song> songs = new ArrayList<Song>();
	        	  songs.add(song);
	        	  playlists.put(song.getPlaylist(), songs);
	          }
	          musicLibrary.put(song.getUrl().getValue(), song);
        }
        
        musicBean.setPlaylists(playlists);
    }
}
