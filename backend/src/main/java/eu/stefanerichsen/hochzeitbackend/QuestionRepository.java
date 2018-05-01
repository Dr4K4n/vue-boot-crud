package eu.stefanerichsen.hochzeitbackend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "questions")
public interface QuestionRepository extends CrudRepository<Question, String> {

}
