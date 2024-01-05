package com.nicolas.apirest.Person;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok para crear gets y sets
@AllArgsConstructor //lombok para crear constructor con todos los argumentos
@NoArgsConstructor //lombok para crear un constructor sin argumentos
@Entity
public class Person {
    @Id //especifica que la variable es un identificador (PK)
    @GeneratedValue
    private Integer id;
    @Basic //para los demas parametros
    private String nombre;
    private String apellido;
    private String email;

}
