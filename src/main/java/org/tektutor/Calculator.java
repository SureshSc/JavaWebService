package org.tektutor;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/calculator")
public class Calculator {

	@GET
	public String sayWelcome() {
		return "<h1>Welcome to calculator</h1>";
	}
}
