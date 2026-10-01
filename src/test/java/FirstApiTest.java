import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FirstApiTest {

    @Test
    void getUser(){

        given()
                .when()
                    .get("https://jsonplaceholder.typicode.com/users/1")
                .then()
                    .statusCode(200);
    }
}
