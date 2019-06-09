package com.n2014858052.main.controller;

import com.n2014858052.main.domain.Basic;
import com.n2014858052.main.service.BasicService;
import com.n2014858052.main.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasicController {
    private BasicService basicService;
    private ProfileService profileService;
    public BasicController( BasicService basicService, ProfileService profileService){
        this.basicService = basicService;
        this.profileService = profileService;
    }

    @GetMapping("/")
    public  String index(Model model){
        model.addAttribute("basicList",basicService.findBasicList());
        model.addAttribute("profileList",profileService.findProfileList());
        return "index";
    }
    @GetMapping("/basic/{idx}")
    public String read(@PathVariable Long idx, Model model){
        model.addAttribute("basic", basicService.findBasicByIdx(idx));
        return "item";
    }
    @PostMapping("/basic/add")
    public String add(Basic basic,Model model){
        Basic saveBasic = basicService.saveBasic(basic);
        model.addAttribute("basic",basicService.findBasicByIdx(saveBasic.getIdx()));
        return "item";
    }
    @GetMapping("/basic/new")
    public String form(Basic basic){
        return "new";
    }


}