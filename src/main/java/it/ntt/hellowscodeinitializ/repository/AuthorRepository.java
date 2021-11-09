package it.ntt.hellowscodeinitializ.repository;

import it.ntt.hellowscodeinitializ.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
