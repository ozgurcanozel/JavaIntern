package com.ozgurcanozel.services;

import com.ozgurcanozel.model.Employee;
import com.ozgurcanozel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){

        // 100'lerce satir kontrolu yapacaksiniz
        return employeeRepository.getAllEmployeeList();
    }
    public Employee getEmployeeBuyID(String id){

        return employeeRepository.getEmployeeByID(id);
    }


}
