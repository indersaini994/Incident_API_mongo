package citi.devops.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import citi.devops.dashboard.model.IncManager;
import citi.devops.dashboard.service.IncidentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/inc")
public class IncidentController {
	
	@Autowired
	private IncidentService service;
	
	
	@PostMapping("/")
	public IncManager add(@RequestBody IncManager Inc) {
		return service.add(Inc);	
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello there!";
	}
	
		
	@GetMapping("/")
	public List<IncManager> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/")
	public IncManager update(@RequestBody IncManager inc){
		return service.update(inc);
	}
	
	@DeleteMapping("/")
	public void delete(@RequestBody IncManager inc)
	{
		service.delete(inc);
	}

}
