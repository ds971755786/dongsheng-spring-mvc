package com.ds.api.impl;

import java.util.GregorianCalendar;

import com.ds.api.HealthCheck;
import com.ds.domain.Status;

public class HealthCheckImpl implements HealthCheck{
	public Status status(){
		Status status = new Status();
		status.setCharacter('d');
		status.setId(1988L);
		status.setTime(new GregorianCalendar());
		status.setVersion("0.0.1");
		return status;
	}
}
