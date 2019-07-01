package org.tektutor;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

@Path("/calculator")
public class Calculator {

	@GET
	public String sayWelcome() {
		return "<h1>Welcome to calculator v2</h1>";
	}
	
	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String doAddition(String input)  {
		String output = "<h1>";
	    JSONObject recoData = new JSONObject(input);
	    int variable1 = recoData.getInt("number_one");
	    int variable2 = recoData.getInt("number_two");
		output += "Sum of " + variable1 + " and " + variable2 + " is ";
		output += variable1 + variable2;
		output += "</h1>";
		return output;
	}
	
	@Path("/sub")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String doSubtraction(String input)  {
		String output = "<h1>";
	    JSONObject recoData = new JSONObject(input);
	    int variable1 = recoData.getInt("number_one");
	    int variable2 = recoData.getInt("number_two");
		output += "Subtraction of " + variable1 + " and " + variable2 + " is ";
		output += variable1 - variable2;
		output += "</h1>";
		return output;
	}
	
	@Path("/mul")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String doMultiplication(String input)  {
		String output = "<h1>";
	    JSONObject recoData = new JSONObject(input);
	    int variable1 = recoData.getInt("number_one");
	    int variable2 = recoData.getInt("number_two");
		output += "Multiplication of " + variable1 + " and " + variable2 + " is ";
		output += variable1 * variable2;
		output += "</h1>";
		return output;
	}
	
	@Path("/div")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String doDivision(String input)  {
		String output = "<h1>";
	    JSONObject recoData = new JSONObject(input);
	    int variable1 = recoData.getInt("number_one");
	    int variable2 = recoData.getInt("number_two");
		output += "Division of " + variable1 + " and " + variable2 + " is ";
		output += variable1 / variable2;
		output += "</h1>";
		return output;
	}
}
