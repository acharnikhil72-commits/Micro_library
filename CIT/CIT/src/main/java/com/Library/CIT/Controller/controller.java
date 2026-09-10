package com.Library.CIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Library.CIT.Repo.model;
import com.Library.CIT.Services.Services;

@RestController
@RequestMapping("/user")
public class controller {

    @Autowired
    public Services service;

    @PostMapping("/add")
    public model addData(@RequestBody model m) {
        return service.addData(m);
    }

    @GetMapping("/get")
    public Boolean getData(@RequestParam Long id) {
        return service.getData(id);
    }

    @GetMapping("/getAll/{id}")
    public List<String> Book_user_owned(@PathVariable Long id) {
        return service.Book_user_owned(id);
    }
}
