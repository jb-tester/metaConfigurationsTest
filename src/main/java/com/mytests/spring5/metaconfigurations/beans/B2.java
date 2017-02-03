package com.mytests.spring5.metaconfigurations.beans;

import com.mytests.spring5.metaconfigurations.components1.C11;
import com.mytests.spring5.metaconfigurations.components2.C21;
import com.mytests.spring5.metaconfigurations.components3.C31;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/3/2017.
 * Project: untitled
 * *******************************
 */
public class B2 {
    private String id;
    @Autowired
    private C11 c11;
    @Autowired
    private C21 c21;
    @Autowired
    private C31 c31;
    public String getId() {
        return id+" can access "+c11.getId()+ " and "+c21.getId()+" and "+c31.getId();
    }

    public B2(String id) {

        this.id = id;
    }
}
