package com.mytests.spring5.metaconfigurations.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
public class B0 {


    @Autowired
    private B1 b1;
    @Autowired
    private B2 b2;
    @Autowired
    private B3 b3;


    public void display() {
        System.out.println(b1.getId()+"; "+b2.getId());
    }
}
