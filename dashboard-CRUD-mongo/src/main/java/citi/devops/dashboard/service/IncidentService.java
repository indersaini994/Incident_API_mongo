package citi.devops.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import citi.devops.dashboard.model.IncManager;
import citi.devops.dashboard.repo.IncidentRepo;

@Service
public class IncidentService {
	
	@Autowired
	IncidentRepo repo;

	public IncManager add(IncManager inc) {
		return repo.insert(inc);
	}

	public List<IncManager> getAll() {
		return repo.findAll();
	}

	public IncManager update(IncManager inc) {
		return repo.save(inc);
	}

	public void delete(IncManager inc) {
		repo.delete(inc);
	}



}
