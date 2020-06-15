package in.kamlesh.OnlinebookstoreAng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.kamlesh.OnlinebookstoreAng.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategories", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

}
