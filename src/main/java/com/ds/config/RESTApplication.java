package com.ds.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ds.api.impl.HealthCheckImpl;
import com.ds.api.impl.TestImpl;

public class RESTApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();
	
	public RESTApplication(){
		singletons.add(new TestImpl());
		singletons.add(new HealthCheckImpl());
	}
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}
}
