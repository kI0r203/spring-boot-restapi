package com.nicolas.apirest.Person;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    
    
    public void CreatePerson(Person persona) {
        personRepository.save(persona);
    }

    public Optional<Person> GetPerson(Integer id) {
        return personRepository.findById(id);
    }

    public List<Person> GetPersons() {
        return personRepository.findAll();
    }

    public void DeletePerson(Integer id) {
        personRepository.deleteById(id);
    }

    public Person UpdatePerson(Integer id,Person persona) {
        Person currentPerson = GetPerson(id).orElse(null);

        currentPerson.setNombre(persona.getNombre());
        currentPerson.setApellido(persona.getApellido());
        currentPerson.setEmail(persona.getEmail());
        
        return personRepository.save(currentPerson);
    }

}
