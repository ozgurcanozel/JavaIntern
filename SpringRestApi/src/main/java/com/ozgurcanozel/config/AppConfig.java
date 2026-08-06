package com.ozgurcanozel.config;

import com.ozgurcanozel.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
public List<Employee> employeeList(){
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee("1", "Ozgurcan", "Ozel"));
    employeeList.add(new Employee("2", "Derya", "Alan"));
    employeeList.add(new Employee("3", "Ugur", "Ozel"));
    employeeList.add(new Employee("4", "Nuray", "Ozel"));
    employeeList.add(new Employee("5", "Berkcan", "Ozel"));

    return employeeList;
}
}
