package com.cztv.framework.exception;

/**
 * Project Name:
 * 
 * Description:
 * 
 * File Name: BaseException.java
 * 
 * Copyright: Copyright (C) 2014 All Rights Reserved.
 * 
 * Company: cztv.com
 * 
 * Author: ct Create Time：2014-12-9 上午11:00:44 Version: v1.0
 * 
 * History:
 * 
 * Date Author Version Description
 * --------------------------------------------------------------------------
 * |v1.0 |Create       异常处理基类
 */	
public class BaseException extends Exception{
	
	private static final long serialVersionUID = -4399860410385382692L;

	/** 
     *   
     */  
    public BaseException() {  
        super();  
    }  
  
    /** 
     * @param arg0 
     */  
    public BaseException(String arg0) {  
        super(arg0);  
    }  
  
    /** 
     * @param arg0 
     * @param arg1 
     */  
    public BaseException(String arg0, Throwable arg1) {  
        super(arg0, arg1);  
    }  
  
    /** 
     * @param arg0 
     */  
    public BaseException(Throwable arg0) {  
        super(arg0);  
    }  
}
