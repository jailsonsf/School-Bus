package com.schoolbus.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.schoolbus.model.Driver;
import com.schoolbus.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DriverResources {

    @Autowired
    private DriverRepository repository;

    @GetMapping("/drivers")
    public List<Driver> getAllDrivers() {
        
        List<Driver> drivers = repository.findAll();

        return drivers;
    }

    @PostMapping("/drivers")
    public ResponseEntity<?> saveDrivers(@RequestBody Driver driver) {
        
        Driver savedDriver = repository.save(driver);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedDriver.getId()).
            toUri();
        
        return ResponseEntity.created(uri).body("Nome e id do novo Motorista: " + 
            savedDriver.getName() + " - " + savedDriver.getId());
    }

    @PutMapping("/drivers/{id}")
    public ResponseEntity<?> updateDriver(@RequestBody Driver driver, @PathVariable int id) {

        Optional<Driver> driverFound = repository.findById(id);

        if (!driverFound.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        driver.setId(id);
        repository.save(driver);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/drivers/{id}")
    public void deleteDriver(@PathVariable int id) {
        
        Optional<Driver> driverFound = repository.findById(id);

        if (driverFound.isPresent()) {
            repository.deleteById(id);
        }
    }
}