import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class OpenApiTestCase {
    @Test
    public void testGetRequest(){
        given().
        when().get("https://jsonplaceholder.typicode.com/todos/1").
                then().assertThat().body("userId", equalTo(1));
    }
}
