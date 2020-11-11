package com.example.demo.controller;

import com.example.demo.mapper.mapper2;
import com.example.demo.mapper.modelMapper;
import com.example.demo.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deptController {
    @Autowired
    modelMapper a;

    @Autowired
    mapper2 b;

    @GetMapping("/hello/{id}")
    public TestModel getModel(@PathVariable("id") Integer id){
        return a.getmodelById(id);
    }

    @GetMapping("/helloworld/{id}")
    public TestModel getModel_(@PathVariable("id") Integer id){

        return b.getmodelById(id);
    }
}
