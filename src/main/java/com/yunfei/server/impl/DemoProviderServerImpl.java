package com.yunfei.server.impl;

import com.yunfei.server.DemoProviderServer;

public class DemoProviderServerImpl implements DemoProviderServer{

	@Override
	public String sayHello(String name) {
		
		return "����001----"+name;
	}

}
