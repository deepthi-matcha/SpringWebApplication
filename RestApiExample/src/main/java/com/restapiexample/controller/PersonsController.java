package com.restapiexample.controller;

import com.restapiexample.entity.Persons;
import com.restapiexample.payload.PersonDto;
import com.restapiexample.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class PersonsController {

    @Autowired
    private PersonsService personsService;

    //add user to DB
    @PostMapping("/register")
    public ResponseEntity<PersonDto> addPerson(@RequestBody PersonDto personDto){
        return new ResponseEntity<>(personsService.addPerson(personDto), HttpStatus.CREATED);


    }


}
