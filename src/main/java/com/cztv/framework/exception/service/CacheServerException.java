package com.cztv.framework.exception.service;

import com.cztv.framework.exception.BaseException;

public class CacheServerException extends BaseException{
	private static final long serialVersionUID = -4740452625692187532L;
	
	public final static String CACHE_FAULT="缓存服务异常";

	public CacheServerException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public CacheServerException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	

}
