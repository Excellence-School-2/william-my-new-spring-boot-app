package it.ntt.hellowscodeinitializ.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import it.ntt.hellowscodeinitializ.model.*;
import it.ntt.hellowscodeinitializ.repository.*;

@Component
public class BootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String ... args) throws Exception {
        Author author1 = new Author("Carlo", "Centofanti");
        Book book1 = new Book("Il mio primo libro", "123ABC");
        book1.setAuthor(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);



    }
    
}
