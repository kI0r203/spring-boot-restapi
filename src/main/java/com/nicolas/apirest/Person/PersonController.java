package com.nicolas.apirest.Person;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/create")
    public void postPerson(@RequestBody Person persona) {
        personService.CreatePerson(persona);
    }

    @GetMapping("/getAll")
    public List<Person> getAllPerson() {
        return personService.GetPersons();
    }
    
    @GetMapping("/get/{id}")
    public Optional<Person> getPerson(@PathVariable(name="id") Integer id) {
        return personService.GetPerson(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable(name="id") Integer id) {
        personService.DeletePerson(id);
    }

    @PutMapping("/update/{id}")
    public Person putMethodName(@PathVariable(name="id") Integer id, @RequestBody Person persona) {
        return personService.UpdatePerson(id, persona);
    }
}
