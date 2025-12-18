package com.example.demo.service.impl;

import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import com.example.demo.exception.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class studentServiceImpl implements studentService{

    @Autowired
    studentRepo repo;

    public List<studentEntity> getAll(){
        return repo.findAll();
    }

    public studentEntity addStudent(studentEntity student){
        return repo.save(student);
    }

    public studentEntity getbyId(Long id){
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException(errMsg:"Student ID not Found"));
    }
    public studentEntity updateById(Long id,StudentEntity newstu){
        studentEntity existing = getId(id);
        repo.save(newstu);
    }
}