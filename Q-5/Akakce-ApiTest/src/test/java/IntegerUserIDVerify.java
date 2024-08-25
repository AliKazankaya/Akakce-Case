
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class IntegerUserIDVerify {

    @Test
    public void testUserIdIsPositiveInteger() {
        given().
                when().
                get("https://jsonplaceholder.typicode.com/posts").
                then().
                assertThat().
                statusCode(200). // Durum kodunun 200 olduğunu doğrulamak
                body("userId", everyItem(greaterThan(0))). // Her `userId` alanının pozitif olduğunu doğrulamak
                log().all(); // Yanıtı konsola yazdırmak için
    }
}
