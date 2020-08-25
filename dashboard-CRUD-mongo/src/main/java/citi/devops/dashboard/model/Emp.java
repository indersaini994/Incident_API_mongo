package citi.devops.dashboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Emp {
	
	@Id
	private String id;
	private String Name;
	private String City;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(String id, String name, String city) {
		super();
		this.id = id;
		this.Name = name;
		this.City = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}
	

}
