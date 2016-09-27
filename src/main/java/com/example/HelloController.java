package com.example;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

import java.util.Hashtable;

/**
 * Created by trina on 9/27/2016.
 */



@RestController
public class HelloController {


    @Autowired
    PersonService personService;




    @RequestMapping("/")
    public String displaySomething(){
        return  "Hello!!";
    }

    @RequestMapping("{id}")
    public Person getStudentId(@PathVariable("id") String id) {
        return personService.getPersonById(id);

    }



    @RequestMapping("/persons")
    public Hashtable<String, Person> getAll() {
        return personService.getPersonsData();

    }
}

