package com.LibraryBooks.CIT_2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<model, Long> {

    @Query("SELECT b FROM model b WHERE b.userId = :userId")
    java.util.List<model> findByUserId(Long userId);
}
