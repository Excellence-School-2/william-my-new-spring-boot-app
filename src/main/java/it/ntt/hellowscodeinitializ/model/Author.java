package it.ntt.hellowscodeinitializ.model;

import java.util.Set;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;

    @OneToMany(mappedBy="author")
    private Set<Book> bookSet = new HashSet<>();

    public Author(){}

    public Author(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public Long getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Set<Book> getBookSet(){
       return bookSet;
   }

    public void setID(Long id){
        this.id=id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurame(String surname){
        this.surname = surname;
    }

    public void setBookSet(Set<Book> bookSet){
        this.bookSet = bookSet;
    }
    
}
