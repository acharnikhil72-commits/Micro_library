package com.LibraryBooks.CIT_2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryBooks.CIT_2.repo.model;
import com.LibraryBooks.CIT_2.service.BookService;

@RestController
@RequestMapping("/inventory")
public class Controller {

    @Autowired
    public BookService service;

    @PostMapping("/add")
    public model addData(@RequestBody model m) {
        return service.addData(m);
    }

    @GetMapping("/get")
    public boolean getData(@RequestParam Long id) {
        return service.getData(id);
    }
}
