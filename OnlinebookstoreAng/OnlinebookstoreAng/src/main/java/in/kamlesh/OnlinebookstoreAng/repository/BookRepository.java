package in.kamlesh.OnlinebookstoreAng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.kamlesh.OnlinebookstoreAng.entity.Book;


@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book,Long> 
{

}
