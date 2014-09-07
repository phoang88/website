package website.bean;

import java.util.ArrayList;
import java.util.Hashtable;

public class MusicBean {
	
	private Hashtable<String, ArrayList<Song>> playlists = new Hashtable<String, ArrayList<Song>>();
	private Hashtable<String, Song> musicLibrary = new Hashtable<String, Song>();

	public Hashtable<String, Song> getMusicLibrary() {
		return musicLibrary;
	}

	public void setMusicLibrary(Hashtable<String, Song> musicLibrary) {
		this.musicLibrary = musicLibrary;
	}

	public Hashtable<String, ArrayList<Song>> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(Hashtable<String, ArrayList<Song>> playlists) {
		this.playlists = playlists;
	}
	
	public Song getSong(String url)
	{
		return musicLibrary.get(url);
	}
	
}
