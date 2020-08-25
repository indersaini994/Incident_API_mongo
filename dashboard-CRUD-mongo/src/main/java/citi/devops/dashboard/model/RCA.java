package citi.devops.dashboard.model;

public class RCA {
	
	private String mor;
	private String rca;
	
	public RCA() {
		// TODO Auto-generated constructor stub
	}

	public RCA(String mor, String rca) {
		super();
		this.mor = mor;
		this.rca = rca;
	}

	public String getMor() {
		return mor;
	}

	public void setMor(String mor) {
		this.mor = mor;
	}

	public String getRca() {
		return rca;
	}

	public void setRca(String rca) {
		this.rca = rca;
	}
	

}
