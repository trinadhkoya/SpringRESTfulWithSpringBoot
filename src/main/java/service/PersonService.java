package service;

import model.Person;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

/**
 * Created by trina on 9/27/2016.
 */


@Service
public class PersonService {

    Hashtable<String, Person> personsData = new Hashtable<String, Person>();


    public PersonService() {


        Person person = new Person();
        person.setId("1");
        person.setFirstName("Trinadh");
        person.setLastName("");
        person.setEmail("");
        personsData.put(person.getId(), person);


        person = new Person();
        person.setId("2");
        person.setFirstName("Steve");
        person.setLastName("Paul");
        person.setEmail("stevenpaul@apple.inc");
        personsData.put(person.getId(), person);

        person = new Person();
        person.setId("3");
        person.setFirstName("Siri");
        person.setLastName("Hey");
        person.setEmail("heysiri@gmail.com");
        personsData.put(person.getId(), person);

        person = new Person();
        person.setId("4");
        person.setFirstName("Trinadh");
        person.setLastName("Koya");
        person.setEmail("trinadhkoya9@gmail.com");
        personsData.put(person.getId(), person);

        person = new Person();
        person.setId("5");
        person.setFirstName("Suchen");
        person.setLastName("Oguri");
        person.setEmail("suchen.o@gmail.com");
        personsData.put(person.getId(), person);


    }



    public Person getPersonById(String id){
        return personsData.get(id);
    }


    public Hashtable<String, Person> getPersonsData() {
        return personsData;
    }
}
