package com.n2014858052.main.repository;

import com.n2014858052.main.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    List<Profile> findAllById(final String id);
    Profile findFirstById(final String id);
}
