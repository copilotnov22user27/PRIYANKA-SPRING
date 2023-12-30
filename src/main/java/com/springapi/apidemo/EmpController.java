package com.springapi.apidemo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList; // Add this import statement
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class EmpController {
    @Autowired
    EmpRepository empRepository;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        Collection<Employee> employees = empRepository.getAllEmployees().values();
        return new ArrayList<>(employees);
        
    }
}
