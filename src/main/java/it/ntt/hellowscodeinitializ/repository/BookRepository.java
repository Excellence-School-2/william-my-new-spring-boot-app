package it.ntt.hellowscodeinitializ.repository;

import it.ntt.hellowscodeinitializ.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
