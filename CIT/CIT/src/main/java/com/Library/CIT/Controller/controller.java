package com.Library.CIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Library.CIT.Repo.model;
import com.Library.CIT.Services.Services;

@RestController
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

}
