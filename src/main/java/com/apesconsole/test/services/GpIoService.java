package com.apesconsole.test.services;

public interface GpIoService {
	public String readCurrentState(final String deviceId);
	public String trigger(final String deviceId);

}
