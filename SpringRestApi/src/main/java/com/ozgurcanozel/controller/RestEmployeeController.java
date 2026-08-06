package com.ozgurcanozel.controller;

import com.ozgurcanozel.model.Employee;
import com.ozgurcanozel.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api") // disaridan bana localhost8080 den bana biri rest/api/em yazarsa asagidaki calisir
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

// postmanden istek atildiginda karsilayacak method

    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeeList(){

        return employeeService.getAllEmployeeList();
    }
}
