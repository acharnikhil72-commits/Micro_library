package com.LibraryBooks.CIT_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryBooks.CIT_2.repo.Repo;
import com.LibraryBooks.CIT_2.repo.model;

@Service
public class BookService {

    @Autowired
    public Repo repo;

    public model addData(model m) {
        return repo.save(m);
    }

    public boolean getData(Long id) {
        return repo.existsById(id);
    }

}
