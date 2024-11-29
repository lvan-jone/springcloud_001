package com.consumer.service.impl;

import com.consumer.service.U;
import org.springframework.stereotype.Service;

@Service
public class UImpl implements U {

    @Override
    public void test() {

    }

    private String ss(String s) {
        return s;
    }
}
