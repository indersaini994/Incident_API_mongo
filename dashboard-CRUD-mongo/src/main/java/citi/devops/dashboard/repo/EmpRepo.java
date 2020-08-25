package citi.devops.dashboard.repo;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import citi.devops.dashboard.model.Emp;

@Repository
public interface EmpRepo extends MongoRepository<Emp, String>{
	
	@Query("{'Name' : ?0}")
	Emp findByname(String name);

}
