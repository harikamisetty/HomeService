package com.hari.serviceapp.serviceProvider.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/v1")
public interface ServiceProviderResource {
	@Path("/getServiceProviders")
	@GET
	@Produces("application/json")
	public Response getServiceProviders(String location, String service);

}
