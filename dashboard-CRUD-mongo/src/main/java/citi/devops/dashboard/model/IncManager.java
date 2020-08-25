package citi.devops.dashboard.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Incident")
public class IncManager {
	
	@Id
	private String incident;
	private String application;
	private Date createdDate;
	private int num;
	private RCA rca;
	private Details details;
	
	public IncManager() {
		// TODO Auto-generated constructor stub
	}

	public IncManager(String incident, String application, Date createdDate, RCA rca, Details details, int num) {
		super();
		this.incident = incident;
		this.application = application;
		this.createdDate = createdDate;
		this.rca = rca;
		this.details = details;
		this.num = num;
	}

	public String getIncident() {
		return incident;
	}

	public void setIncident(String incident) {
		this.incident = incident;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public RCA getRca() {
		return rca;
	}

	public void setRca(RCA rca) {
		this.rca = rca;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}
	
	

}
