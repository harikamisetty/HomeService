package com.hari.serviceapp.serviceProvider.resource;

import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hari.serviceapp.serviceProvider.service.ServiceProviderService;

@RestController
public class ServiceProviderResourceImpl implements ServiceProviderResource{

	
	@Autowired
	private ServiceProviderService serviceProviderService;
	
	@Override
	public Response getServiceProviders(String location, String service) {
		
		if(StringUtils.isNotEmpty(location) && StringUtils.isNotEmpty(service)) {
			
			serviceProviderService.getServiceProviderDetails();
			
		}
		return null;
	}

}
