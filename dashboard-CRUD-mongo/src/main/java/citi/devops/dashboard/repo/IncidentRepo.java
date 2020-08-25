package citi.devops.dashboard.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import citi.devops.dashboard.model.IncManager;

public interface IncidentRepo extends MongoRepository<IncManager, String> {

}
