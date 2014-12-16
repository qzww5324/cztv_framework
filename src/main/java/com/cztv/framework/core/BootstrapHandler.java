package com.cztv.framework.core;

import javax.servlet.ServletContextEvent;

import net.rubyeye.xmemcached.XMemcachedClient;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cztv.framework.exception.service.CacheServerException;

/**
 * Project Name:
 * 
 * Description:
 * 
 * File Name: BootstrapHandler.java
 * 
 * Copyright: Copyright (C) 2014 All Rights Reserved.
 * 
 * Company: cztv.com
 * 
 * Author: ct Create Time：2014-12-9 下午4:58:51 Version: v1.0
 * 
 * History:
 * 
 * Date Author Version Description
 * --------------------------------------------------------------------------
 * |v1.0 |Create	服务启动初始化
 */	

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
