package com.cztv.framework.rmi.httpInvoker;

public class BaseHttpInvokeImpl implements IBaseHttpInvoke{

	@Override
	public String info(long id) {
		return new StringBuilder("Server info : test rmi(http invoke) - ").append(id).toString();
	}

}
