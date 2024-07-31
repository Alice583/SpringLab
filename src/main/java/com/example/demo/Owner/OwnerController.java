package com.example.demo.Owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    OwnerRepository ownerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<OwnerModel> getOwnerById(@PathVariable("id") int id) {
        Optional<OwnerModel> ownerData = ownerRepository.findById(id);
        if (ownerData.isPresent()) {
            return new ResponseEntity<>(ownerData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
