package com.n2014858052.main.service;

import com.n2014858052.main.domain.Basic;
import com.n2014858052.main.repository.BasicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicService {
    private BasicRepository basicRepository;

    public BasicService(BasicRepository basicRepository) {
        this.basicRepository = basicRepository;
    }
    public Basic findBasicByIdx(Long idx) {
        return basicRepository.findById(idx).orElse(new Basic());
    }

    public Basic saveBasic(Basic basic) { return basicRepository.save(basic); }
    public List<Basic> findBasicList() { return basicRepository.findAll(); }


}
