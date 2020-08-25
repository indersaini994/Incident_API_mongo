package citi.devops.dashboard.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import citi.devops.dashboard.model.Emp;
import citi.devops.dashboard.service.EmpService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService service;
	
	@PostMapping("/")
	public Emp add(@RequestBody Emp emp) {
		return service.add(emp);	
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello there!";
	}
	
	@GetMapping("/find/{name}")
	public Emp findByName(@PathVariable String name)
	{
		return service.findByName(name);
	}
	
	@GetMapping("/")
	public List<Emp> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/")
	public Emp update(@RequestBody Emp emp){
		return service.update(emp);
	}
	
	@DeleteMapping("/")
	public void delete(@RequestBody Emp emp)
	{
		service.delete(emp);
	}
}

