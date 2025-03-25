package Api;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;

public class HttpRequest {
    int id;
   @Test(priority = 1)
   // int id;
    public void User(){
    given()
    .when()
            .get("https://reqres.in/api/users?page=2")
            .then()
            .statusCode(200)
            .body("page",equalTo(2))
            .log().all();
    
    }



}
