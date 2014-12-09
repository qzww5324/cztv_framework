package com.cztv.framework.core;

import javax.servlet.ServletContextEvent;

import net.rubyeye.xmemcached.XMemcachedClient;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cztv.framework.exception.service.CacheServerException;


public class BootstrapHandler extends ContextLoaderListener {
	private XMemcachedClient memcachedClient;

	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(event.getServletContext());
		memcachedClient = (XMemcachedClient) applicationContext
				.getBean("memcachedClient");
		
		try {
			memcachedClient.set("test", 0, 1);
		} catch (Exception e) {
			new CacheServerException(CacheServerException.CACHE_FAULT,e);
		} 
	}
	
}
