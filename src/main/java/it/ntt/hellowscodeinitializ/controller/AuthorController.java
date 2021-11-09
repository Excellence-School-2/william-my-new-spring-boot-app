package it.ntt.hellowscodeinitializ.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ntt.hellowscodeinitializ.repository.AuthorRepository;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("author_list", authorRepository.findAll());
        return "authors";
    }
    
}
