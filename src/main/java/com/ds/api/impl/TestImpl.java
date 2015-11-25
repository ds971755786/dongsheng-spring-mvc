package com.ds.api.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestImpl {
	@GET
	public Response test(){
	    return Response.status(200).entity("Dongsheng").build();
	}
	

}
