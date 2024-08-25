import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class MinTenValue {

    @Test
    public void testJsonArraySize() {
        given().
                when().
                get("https://jsonplaceholder.typicode.com/posts").
                then().
                assertThat().
                statusCode(200). // Durum kodunun 200 olduğunu doğrulamak
                body("$.size()", greaterThanOrEqualTo(10)). // JSON dizisinin en az 10 öğe içerdiğini doğrulamak
                log().all(); // Yanıtı konsola yazdırmak için
    }
}
