package ro.ima.kb.hello;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import ro.ima.kb.module.a.spi.HelloModule;

public class ModuleADemo {
	public static void main(String[] args) {
		ServiceLoader<HelloModule> loader = ServiceLoader.load(HelloModule.class);
		try {
			Iterator<HelloModule> serviceIterator = loader.iterator();
			while (serviceIterator.hasNext()) {
				HelloModule helloModule = serviceIterator.next();
				helloModule.sayHello("ima");
			}
		} catch (ServiceConfigurationError serviceError) {
			serviceError.printStackTrace();

		}

		// System.out.println( "Hello World!" );
		// HelloService helloService = HelloService.getInstance();
		// helloService.sayHello("aaa");
	}
}
