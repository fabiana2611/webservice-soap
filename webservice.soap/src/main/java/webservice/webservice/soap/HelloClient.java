package webservice.webservice.soap;

import javax.xml.ws.WebServiceRef;

public class HelloClient {

	@WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/WebServiceProject/Hello.wsdl")
	private static Hello service;

	public static void main(String[] args) {
		System.out.println(sayHello("Malta"));
	}

	private static String sayHello(java.lang.String arg0) {
		Hello port = new Hello();
		return port.sayHello(arg0);
	}

}
