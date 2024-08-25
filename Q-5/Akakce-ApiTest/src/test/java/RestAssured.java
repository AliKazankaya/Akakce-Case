import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class RestAssured {

    @Test
    public void testGetPostsStatusCode() {
        given().
                when().
                get("https://jsonplaceholder.typicode.com/posts").
                then().
                assertThat().
                statusCode(200).
                log().all(); // Yanıtı konsola yazdırmak için
    }
}