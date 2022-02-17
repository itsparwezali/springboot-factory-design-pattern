package com.example.service.impl;

import com.example.constant.FruitesConstant;
import com.example.service.FruitesFeatures;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Qualifier(FruitesConstant.MANGO)
public class Mango implements FruitesFeatures {
    @Override
    public void color() {

        System.out.println("mango color yellow");
    }

    @Override
    public void weigth() {

        System.out.println("mango weight 2 kg");
    }
}
