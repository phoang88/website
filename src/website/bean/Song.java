package website.bean;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.api.datastore.Text;

public class Song {
	private String title;
	private String artist;
	private Link url;
	private String playlist;
	private String lyrics;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Link getUrl() {
		return url;
	}
	public void setUrl(Link url) {
		this.url = url;
	}
	public String getPlaylist() {
		return playlist;
	}
	public void setPlaylist(String playlist) {
		this.playlist = playlist;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
}
