package com.injavawetrust;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SystemNameInfoContributor implements InfoContributor {
	@Override
	public void contribute(Builder builder) {
		builder
		.withDetail("system-name", System.getProperty("os.name"))
		.withDetail("java-version", System.getProperty("java.vm.specification.version"))
		;
		
		
	}
}