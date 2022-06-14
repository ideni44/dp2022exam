package BackEnd.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import BackEnd.birds.Birds;

@RepositoryRestResource
@CrossOrigin(origins = "*")
//@RepositoryRestResource(collectionResourceRel = "birds", path = "birds")
public interface birdsRepository extends JpaRepository<Birds, Integer> {

  //List<Birds> findByTitle(@Param("title") String title);
}

