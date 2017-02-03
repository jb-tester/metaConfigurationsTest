package com.mytests.spring5.metaconfigurations.components2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
@Component
public class C21 {
    @Value("c12")
    String id;

    public String getId() {
        return id;
    }
}
