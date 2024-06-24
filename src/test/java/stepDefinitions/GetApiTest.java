package stepDefinitions;

import static io.restassured.RestAssured.given;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetApiTest {

	int statuscode;
	Response response;
	
	@Given("^the valid endpoint to fetch users v(\\d+)$")
	public void the_valid_endpoint_to_fetch_users_v(int arg1) throws Throwable {
		 RestAssured.baseURI="https://reqres.in/";
		    RestAssured.basePath="/api/users";
	}

	@When("^the request is send to server$")
	public void the_request_is_send_to_server() throws Throwable {
		 response = given().
				    when().
				    get().
				    then().
				    contentType(ContentType.JSON).
				    extract().response();  
	}

	@Then("^status code is (\\d+)$")
	public void status_code_is(int statuscode) throws Throwable {
	    this.statuscode = statuscode;
	    int statuscodefromresponse = response.getStatusCode();
	    System.out.println(statuscodefromresponse);
	    Assert.assertEquals(statuscodefromresponse, 200);  
	}
	
}
