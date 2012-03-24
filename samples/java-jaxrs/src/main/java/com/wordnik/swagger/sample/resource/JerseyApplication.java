package com.wordnik.swagger.sample.resource;

import com.sun.jersey.api.core.DefaultResourceConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * Work around because jersey ScanningResourceConfig doesn't play nice in osgi
 * http://probemonkey.wordpress.com/2011/03/02/jersey-osgi/
 * http://coderthoughts.blogspot.com/2008/03/using-jersey-jsr311-inside-osgi-with.html
 */
public class JerseyApplication extends DefaultResourceConfig {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();

        s.add(JSONContextResolver.class);

        s.add(PetResource.class);
        s.add(PetResourceJSON.class);
        s.add(PetStoreResource.class);
        s.add(PetStoreResourceJSON.class);
        s.add(SampleExceptionMapper.class);
        s.add(UserResource.class);
        s.add(UserResourceJSON.class);

        s.add(SwaggerApiListingResource.class);

        return s;
    }

}
