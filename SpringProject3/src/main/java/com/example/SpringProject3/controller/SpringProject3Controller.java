package com.example.SpringProject3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProject3.model.SpringProject3;
import com.example.SpringProject3.repository.SpringProject3Repository;

@RestController
@RequestMapping("/api")
public class SpringProject3Controller {
    @Autowired
    SpringProject3 project3Repository;

    @GetMapping("/show_all/{id}")
    public Optional<SpringProject3> getAllValues(@PathVariable Long id) {
        return (Optional<SpringProject3>) project3Repository.findById(id);
    }


     @DeleteMapping("/delete_all/{id}")
    public List<SpringProject3> deleteAllmapping(@PathVariable Long id) {
        mappingRepository.deleteById(id);
        return (List<SpringProject3>) project3Repository.findAll();
    }




}
