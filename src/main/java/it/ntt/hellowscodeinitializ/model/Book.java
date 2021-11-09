package it.ntt.hellowscodeinitializ.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String ISBN;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;
    
    public Book(){}

    public Book(String title, String ISBN){
        this.title=title;
        this.ISBN=ISBN;
    }
    
    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return ISBN;
    }

    public Author getAuthor(){
        return author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIsbn(String ISBN){
        this.ISBN = ISBN;
    }

    public void setAuthor(Author author){
        this.author = author;
    }
}
