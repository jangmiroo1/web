package com.n2014858052.main.controller;

import com.n2014858052.main.domain.Profile;
import com.n2014858052.main.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {
    private ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile/{idx}")
    public String read(@PathVariable Long idx, Model model) {
        model.addAttribute("profile", profileService.findProfileByIdx(idx));
        return "pitem";
    }

    @PostMapping("/profile/add")
    public String add(Profile profile, Model model) {
        profile.setTime(LocalDateTime.now());
        Profile saveProfile = profileService.saveProfile(profile);
        model.addAttribute("profile", profileService.findProfileByIdx(saveProfile.getIdx()));
        return "pitem";
    }

    @GetMapping("/profile/new")
    public String form(Profile profile) {
        return "pnew";
    }

}
