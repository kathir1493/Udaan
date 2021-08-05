package com.udaan.covid.service;

import com.udaan.covid.entity.TestResult;
import com.udaan.covid.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    ResultRepository resultRepository;

    String updateResult(TestResult result){

        resultRepository.save(result);

        return "{\"updated\":true}";
    }


}
