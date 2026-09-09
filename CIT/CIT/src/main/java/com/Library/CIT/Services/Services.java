package com.Library.CIT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import com.Library.CIT.Repo.model;
import com.Library.CIT.Repo.repo;

@Service
public class Services {

    private final RestTemplate restTemplate;

    public Services(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    public repo Repo;

    public model addData(model m) {
        return Repo.save(m);
    }

    public Boolean getData(Long id) {
        return Repo.existsById(id);
    }

    public List<model> Book_user_owned() {
        return restTemplate.getForObject("http://localhost:8082/inventery/userid/{id}/getAll", List.class);
    }
}
