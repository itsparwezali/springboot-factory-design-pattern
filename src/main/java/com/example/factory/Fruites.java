package com.example.factory;

import com.example.constant.FruitesConstant;
import com.example.service.FruitesFeatures;
import com.example.service.impl.Apple;
import com.example.service.impl.Mango;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Fruites {


    @Autowired
    @Qualifier(FruitesConstant.APPLE)
    private Apple apple;


    @Autowired
    @Qualifier(FruitesConstant.MANGO)
    private Mango mango;

    public FruitesFeatures getFruitesName(String fruites){

        if (fruites.equalsIgnoreCase(FruitesConstant.APPLE)){
            return apple;
        }else if (fruites.equalsIgnoreCase(FruitesConstant.MANGO)){
            return mango;
        }else {
            return null;
        }
    }

}
