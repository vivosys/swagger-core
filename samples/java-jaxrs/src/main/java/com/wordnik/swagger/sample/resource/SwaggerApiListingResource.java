package com.wordnik.swagger.sample.resource;

import com.wordnik.swagger.core.Api;
import com.wordnik.swagger.jaxrs.JavaApiListing;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * This is the mechanism that produces '/resources.json' which is produced by the swagger library.
 */
@Path("/resources.json")
@Api("/resources")
@Produces({"application/json"})
public class SwaggerApiListingResource extends JavaApiListing {}


