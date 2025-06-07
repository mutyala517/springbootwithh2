package com.example.demo.config;

import com.example.demo.entity.Address;
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
        System.out.println("Loading initial data into the database...");
        // Example: Load some default employees or other entities

        Employee employee1 = new Employee(new Address("1222 Hidden Ridge", "Irving", "75038", "Texas"), 6000.00, "IT", "Dharmendra Mutyala");
        employeeRepository.save(employee1);
    }
}
