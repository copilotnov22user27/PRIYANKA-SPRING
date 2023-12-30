package com.springapi.apidemo;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
@Repository
public class EmpRepository {
    // hashmap to store the employees
    private static Map<Long, Employee> empRepo = new HashMap<>();
    static{
        empRepo.put(1L, new Employee(1, "John", "Manager"));
        empRepo.put(2L, new Employee(2, "Peter", "Developer"));
        empRepo.put(3L, new Employee(3, "Sam", "Developer"));  
        empRepo.put(4L, new Employee(4, "Mary", "Developer"));
        empRepo.put(5L, new Employee(5, "David", "Developer"));

    }
   
    public Map<Long, Employee> getAllEmployees() {
        return empRepo;
    }
}
