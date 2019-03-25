package com.schoolbus.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.schoolbus.model.Attendant;
import com.schoolbus.repository.AttendantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AttendantResources {
    
    @Autowired
    private AttendantRepository repository;

    @GetMapping("/attendants")
    public List<Attendant> getAllAttendants() {
        
        List<Attendant> attendants = repository.findAll();

        return attendants;
    }

    @PostMapping("/attendants")
    public ResponseEntity<?> saveAttendant(@RequestBody Attendant attendant) {
        
        Attendant savedAttendant = repository.save(attendant);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedAttendant.getId()).
            toUri();
        
        return ResponseEntity.created(uri).body("Nome e id do novo Atendente: " + 
            savedAttendant.getName() + " - " + savedAttendant.getId());
    }

    @PutMapping("/attendants/{id}")
    public ResponseEntity<?> updateAttendant(@RequestBody Attendant attendant, @PathVariable int id) {

        Optional<Attendant> attendantFound = repository.findById(id);

        if (!attendantFound.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        attendant.setId(id);
        repository.save(attendant);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/attendants/{id}")
    public void deleteAttendant(@PathVariable int id) {
        
        Optional<Attendant> attendantFound = repository.findById(id);

        if (attendantFound.isPresent()) {
            repository.deleteById(id);
        }
    }
}
