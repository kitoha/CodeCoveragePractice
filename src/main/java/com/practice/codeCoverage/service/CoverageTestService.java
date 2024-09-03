package com.practice.codeCoverage.service;

import org.springframework.stereotype.Service;

@Service
public class CoverageTestService {

    public String test(int value){
        int a= 1+value;

        if(a==2){
            return "Good!";
        }else{
            return "Failed";
        }

    }
}
