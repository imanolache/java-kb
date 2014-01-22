package ro.ima.kb.module.a;

import ro.ima.kb.module.a.spi.HelloModule;

public class HelloModuleImpl implements HelloModule {
	public String sayHello(String name) {
		String helloResponse = "Hi " + name + "!";
		System.out.println(helloResponse);
		return helloResponse;
	}
}
