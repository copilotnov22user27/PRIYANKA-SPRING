package com.springapi.apidemo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@RestController
public class homecontroller {
    // create a list of employees to test the api
    private final Employee[] employees = new Employee[] {
        new Employee(1, "John", "Manager"),
        new Employee(2, "Peter", "Developer"),
        new Employee(3, "Sam", "Developer"),
    };

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
    // Add a method to use the employees array
    @GetMapping("/employees")
    public Employee[] getEmployees() {
        return employees;
    }
}
