package citi.devops.dashboard.model;

public class Details {
	
	private String csi;
	private String release;
	
	public Details() {
		// TODO Auto-generated constructor stub
	}

	public Details(String csi, String release) {
		super();
		this.csi = csi;
		this.release = release;
	}

	public String getCsi() {
		return csi;
	}

	public void setCsi(String csi) {
		this.csi = csi;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}
	
	

}
