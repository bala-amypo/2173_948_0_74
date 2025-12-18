package com.example.demo.service;

import com.example.demo.entity.*;

import jakarta.validation.Valid;

import java.util.*;

interface studentService {
    
       List<studentEntity> getAll();

       studentEntity addStudent( studentEntity student );

       studentEntity getbyId(Long id);

       studentEntity updateByTd(Long id,studentEntity newstu);

       

}