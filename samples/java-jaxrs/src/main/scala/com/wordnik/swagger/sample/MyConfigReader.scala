package com.wordnik.swagger.sample

import javax.servlet.ServletConfig
import com.wordnik.swagger.jaxrs.ConfigReader
import com.wordnik.swagger.core.SwaggerSpec

class MyConfigReader(sc: ServletConfig) extends ConfigReader(sc: ServletConfig) {

  override def getBasePath(): String = {
    // some fancy logic to determine base path
    val basePath = "http://localhost:8181/rest"
    basePath
  }

  override def getSwaggerVersion(): String = {
    //SwaggerSpec.version
    "1.02-SNAPSHOT"
  }

  override def getApiVersion(): String = {
    //if (sc != null) sc.getInitParameter("api.version") else null
    "1.0"
  }

  override def getApiFilterClassName(): String = {
    if (sc != null) sc.getInitParameter("swagger.security.filter") else null
  }

}


