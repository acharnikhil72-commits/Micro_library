package com.LibraryBooks.CIT_2.service;

import java.util.List;

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

    public List<model> Book_user_owned(Long id) {
        return repo.findByUserId(id);
    }

}
