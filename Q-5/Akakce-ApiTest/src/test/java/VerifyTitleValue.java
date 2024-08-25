import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class VerifyTitleValue {

    @Test
    public void testGetPostWithId1Title() {
        given().
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").
                then().
                assertThat().
                statusCode(200). // Durum kodunun 200 olduğunu doğrula
                body("id", equalTo(1)). // Gönderinin `id` değeri 1 yapıldı.
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")). // Belirtilen `title` değerini doğrula
                log().all(); // Yanıtı konsola yazdırmak için
    }


}
