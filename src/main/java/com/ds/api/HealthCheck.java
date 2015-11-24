package com.ds.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ds.domain.Status;

@Path("/rest/health-check")
public interface HealthCheck {
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Status status();
}
