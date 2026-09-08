package com.Library.CIT.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.CIT.Repo.model;
import com.Library.CIT.Repo.repo;

@Service
public class Services {

    @Autowired
    public repo Repo;

    public model addData(model m) {
        return Repo.save(m);
    }

    public Boolean getData(Long id) {
        return Repo.existsById(id);
    }
}
