package com.Library.CIT.Services;

import java.util.List;

// import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Library.CIT.Config.FiegnClintConfig;
// import org.springframework.web.client.RestClient;
// import org.springframework.web.client.RestTemplate;
import com.Library.CIT.Repo.model;
import com.Library.CIT.Repo.repo;

@Service
public class Services {

    // private final DiscoveryClient discoveryClient;
    // private final RestClient restClient;

    // @Autowired
    // private RestTemplate restTemplate;

    private final FiegnClintConfig feignClientConfig;

    public Services(FiegnClintConfig feignClientConfig) {

        this.feignClientConfig = feignClientConfig;
    }

    @Autowired
    public repo Repo;

    public model addData(model m) {
        return Repo.save(m);
    }

    public Boolean getData(Long id) {
        return Repo.existsById(id);
    }

    // public List<model> Book_user_owned(Long id) {
    // return discoveryClient.getInstances("LIB_BOOKS").stream()
    // .flatMap(instance -> {
    // String url = instance.getUri() + "/inventory/userid/" + id + "/getAll";
    // List result = restTemplate.getForObject(url, List.class);
    // return result.stream();
    // })
    // .toList();
    // }

    // # RestClient implementation
    // public List<String> Book_user_owned(Long id) {
    // ResponseEntity<String> result = restClient.get()
    // .uri("http://Lib-books/inventory/userid/{id}/getAll", id)
    // .retrieve()
    // .toEntity(String.class);

    // return List.of(result.getBody());
    // }
    public List<String> Book_user_owned(Long id) {

        return feignClientConfig.getAllData(id).stream()
                .map(model -> model.getBookName())
                .toList();
    }

}
