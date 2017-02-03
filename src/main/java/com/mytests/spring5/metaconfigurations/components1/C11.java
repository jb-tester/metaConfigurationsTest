package com.mytests.spring5.metaconfigurations.components1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
@Component
public class C11 {
    @Value("c11")
    String id;

    public String getId() {
        return id;
    }
}
