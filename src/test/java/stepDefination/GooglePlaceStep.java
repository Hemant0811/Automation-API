package stepDefination;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resourses.Endpoint;
import resourses.TestDataPayload;

public class GooglePlaceStep {
	
	RequestSpecification req;
	Response res;
	Response getRes;
	static String PlaceId;
	TestDataPayload p = new TestDataPayload();
	
	//@Given("user prepare a request with Payload")
	//public void user_prepare_a_request_with_payload() {
		//RestAssured.baseURI="https://rahulshettyacademy.com";
		// req = given().log().all().spec(Base.setup());
				//.body(p.dataPayload());
	    
	//}
	
	@Given("user send the {string} request")
	public void user_send_the_request(String method) {
		if (method.equalsIgnoreCase("POST")) {
        res=req.post(Endpoint.addplace);		
	    
	} else if(method.equalsIgnoreCase("GET")) {
		res=req.get(Endpoint.getplace);
	} else if(method.equalsIgnoreCase("PUT")) {
		res=req.get(Endpoint.updateplace);
	}  else if(method.equalsIgnoreCase("DELETE")) {
		res=req.get(Endpoint.deleteplace);
	}
	}

//	@Given("user send the POST request")
//	public void user_send_the_post_request() {
//	    res=req.post("maps/api/place/add/json");
//	}

	@Then("user get status code {string}")
	public void user_get_status_code(String statusCode ) {
		int actualCode= res.getStatusCode();
		Assert.assertEquals(String.valueOf(actualCode), statusCode);
	   
	}

//	@Then("validate status value is OK")
//	public void validate_status_value_is_ok() {
//		String response= res.asString();
//	    JsonPath js = new JsonPath(response);
//	    String ActualStatus=js.getString("status");
//	    Assert.assertEquals(ActualStatus,"OK");    
//	    
//	}
//
//	@Then("validate scope value is APP")
//	public void validate_scope_value_is_app() {
//		String response= res.asString();
//	    JsonPath js = new JsonPath(response);
//	    String ActualScope=js.getString("scope");
//	    Assert.assertEquals(ActualScope,"APP"); 
//	   
//	}
	
	@Then("validate {string} value is {string}")
	public void validate_value_is(String key, String value) {
		String response= res.asString();
	    JsonPath js = new JsonPath(response);
	    String Actual=js.getString(key);
	    Assert.assertEquals(Actual,value);     
	}
	@Given("user prepare a request with Payload {string} {string} {string}")
	public void user_prepare_a_request_with_payload(String name, String phoneNumber, String Address) {
		req = given().log().all().spec(Base.setup())
		.body(p.dataPayload(name,phoneNumber,Address));
	}
	
	@Then("verify Place_Id created maps to {string}")
	public void verify_place_id_created_maps_to(String name) {
		String response = res.asString();
		JsonPath js = new JsonPath(response);
	    PlaceId = js.getString("place_id");
		getRes = given().log().all().spec(Base.setup()).queryParam("place_id", PlaceId).get(Endpoint.getplace);
		
		String getResponse = getRes.asString();
		System.out.println(getResponse);
		JsonPath js1 = new JsonPath(getResponse);
		String Actualname = js1.getString("name");
		 Assert.assertEquals(Actualname,name);
	}

}
