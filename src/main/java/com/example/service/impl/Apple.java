package com.example.service.impl;

import com.example.constant.FruitesConstant;
import com.example.service.FruitesFeatures;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Qualifier(FruitesConstant.APPLE)
public class Apple implements FruitesFeatures {
    @Override
    public void color() {
        System.out.println("apple color red");
    }

    @Override
    public void weigth() {

        System.out.println("apple weight 1.5 kg");
    }
}
