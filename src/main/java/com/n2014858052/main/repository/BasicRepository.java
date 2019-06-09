package com.n2014858052.main.repository;

import com.n2014858052.main.domain.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicRepository extends JpaRepository<Basic, Long> {
    List<Basic> findAllByTitle(final String title);
    Basic findFirstByTitle(final String title);
}
