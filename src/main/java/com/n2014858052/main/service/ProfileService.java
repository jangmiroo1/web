package com.n2014858052.main.service;

import com.n2014858052.main.domain.Profile;
import com.n2014858052.main.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
    public Profile findProfileByIdx (Long idx) {
        return profileRepository.findById(idx).orElse(new Profile());
    }

    public Profile saveProfile (Profile profile) {
        return profileRepository.save(profile);
    }
    public List<Profile> findProfileList() {
        return profileRepository.findAll();
    }

}
