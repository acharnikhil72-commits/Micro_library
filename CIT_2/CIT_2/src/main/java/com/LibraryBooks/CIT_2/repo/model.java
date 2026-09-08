package com.LibraryBooks.CIT_2.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Book_id;
    private Integer BookPrice;
    private Integer BookQuantity;
}
