package com.wordnik.swagger.sample.util;

import com.wordnik.swagger.core.SwaggerContext;

public class OsgiClassLoader {

    public void start() throws Exception{

        SwaggerContext.registerClassLoader(this.getClass().getClassLoader());

    }

}
