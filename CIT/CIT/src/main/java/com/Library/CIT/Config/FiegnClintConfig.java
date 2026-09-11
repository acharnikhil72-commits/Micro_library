package com.Library.CIT.Config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Library.CIT.Repo.model;

@FeignClient(name = "Lib-books")
public interface FiegnClintConfig {

    @GetMapping("/inventory/userid/{id}/getAll")
    List<model> getAllData(@PathVariable Long id);
}
