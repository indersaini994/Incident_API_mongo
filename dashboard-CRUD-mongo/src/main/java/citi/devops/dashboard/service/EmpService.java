package citi.devops.dashboard.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import citi.devops.dashboard.model.Emp;
import citi.devops.dashboard.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo repo;

	public Emp add(Emp emp) {
		return repo.insert(emp);
	}

	public List<Emp> getAll() {
		return repo.findAll();
	}

	public Emp update(Emp emp) {
		return repo.save(emp);
	}

	public void delete(Emp emp) {
		repo.delete(emp);
	}

	public Emp findByName(String n) {
		return repo.findByname(n);
	}

}
