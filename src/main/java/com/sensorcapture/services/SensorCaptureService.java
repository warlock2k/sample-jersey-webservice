package com.sensorcapture.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.annotation.JacksonFeatures;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.SerializationFeature;

@Path("/status")
public class SensorCaptureService {
    @SuppressWarnings("unchecked")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @JacksonFeatures(serializationEnable =  { SerializationFeature.INDENT_OUTPUT })
    public Response getStatus() {
        JSONObject obj=new JSONObject();
        obj.put("System","OK"); 
        obj.put("# of Sensors", 4); 
        return Response.ok(obj, MediaType.APPLICATION_JSON).build();
    }
}
