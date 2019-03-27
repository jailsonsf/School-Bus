package com.schoolbus.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.schoolbus.model.EducationalInstitution;
import com.schoolbus.repository.EducationalInstitutionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EducationalInstitutionResourvces {

    @Autowired
    private EducationalInstitutionRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/institutions")
    public List<EducationalInstitution> getAllInstitutions() {
        
        List<EducationalInstitution> institutions = repository.findAll();

        return institutions;
    }

    @PostMapping("/institutions")
    public ResponseEntity<?> saveInstitution(@RequestBody EducationalInstitution institution) {
        
        EducationalInstitution savedInstitution = repository.save(institution);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedInstitution.getId()).
            toUri();
        
        return ResponseEntity.created(uri).body("Nome e id do novo Instituição: " + 
            savedInstitution.getName() + " - " + savedInstitution.getId());
    }

    @PutMapping("/institutions/{id}")
    public ResponseEntity<?> updateInstitution(@RequestBody EducationalInstitution institution, @PathVariable int id) {

        Optional<EducationalInstitution> institutionFound = repository.findById(id);

        if (!institutionFound.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        institution.setId(id);
        repository.save(institution);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/institutions/{id}")
    public void deleteInstitution(@PathVariable int id) {
        
        Optional<EducationalInstitution> institutionFound = repository.findById(id);

        if (institutionFound.isPresent()) {
            repository.deleteById(id);
        }
    }
}
