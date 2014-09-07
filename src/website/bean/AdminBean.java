package website.bean;

public class AdminBean {

	public final String ADD_SONG = "html/admin/addSong.html";
	public final String DELETE_SONG = "html/admin/DeleteSong.html";

	private String rightDivSource;
	
	public String getRightDivSource() {
		return rightDivSource;
	}
	public void setRightDivSource(String rightDivSource) {
		this.rightDivSource = rightDivSource;
	}
}
