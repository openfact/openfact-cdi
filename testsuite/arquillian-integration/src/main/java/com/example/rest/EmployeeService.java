package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeService {

    public List<String> findAll() {
        return new ArrayList<String>() {
            {
                add("sd");
                add("asdas");
            }
        };
    }

}
