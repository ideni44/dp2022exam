package BackEnd.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import BackEnd.l.now;

@RepositoryRestResource
@CrossOrigin(origins = "*")

public interface nowRepository extends JpaRepository<now, Integer> {

 
}

