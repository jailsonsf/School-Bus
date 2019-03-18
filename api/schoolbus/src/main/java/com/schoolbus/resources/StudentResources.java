package com.schoolbus.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.schoolbus.model.Student;
import com.schoolbus.repository.StudentRepository;

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
public class StudentResources {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        
        List<Student> students = repository.findAll();

        return students;
    }

    @PostMapping("/students")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        
        Student savedStudent = repository.save(student);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedStudent.getId()).
            toUri();
        
        return ResponseEntity.created(uri).body("Nome e id do novo Aluno: " + 
            savedStudent.getName() + " - " + savedStudent.getId());
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody Student student, @PathVariable int id) {

        Optional<Student> studentFound = repository.findById(id);

        if (!studentFound.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        student.setId(id);
        repository.save(student);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {
        
        Optional<Student> studentFound = repository.findById(id);

        if (studentFound.isPresent()) {
            repository.deleteById(id);
        }
    }
}