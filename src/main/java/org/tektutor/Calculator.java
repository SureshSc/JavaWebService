package org.tektutor;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/calculator")
public class Calculator {

	@GET
	public String sayWelcome() {
		return "Welcome to calculator";
	}
}
