package com.example.demo.config;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoadingIntoDB implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataLoadingIntoDB(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // This method will be executed after the application context is loaded
        // You can add code here to load initial data into your database
        System.out.println("Loading initial data into the database...");
        // Example: Load some default employees or other entities

        Employee employee1 = new Employee("Dharmendra Mutyala", "IT", 6000.00);
        employeeRepository.save(employee1);
    }
}
