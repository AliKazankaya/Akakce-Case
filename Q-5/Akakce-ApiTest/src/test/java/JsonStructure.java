import org.testng.annotations.Test;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


public class JsonStructure {

    @Test
    public void testGetPostsJsonStructure() {
        given().
                when().
                get("https://jsonplaceholder.typicode.com/posts").
                then().
                assertThat().
                statusCode(200). // Durum kodunun 200 olduğunu doğrula
                body("$", isA(List.class)). // JSON çıktısının bir dizi olduğunu doğrula
                body("userId", everyItem(notNullValue())). // Her gönderinin `userId` alanına sahip olduğunu doğrulamak
                body("id", everyItem(notNullValue())). // Her gönderinin `id` alanına sahip olduğunu doğrulamak
                body("title", everyItem(notNullValue())). // Her gönderinin `title` alanına sahip olduğunu doğrulamak
                body("body", everyItem(notNullValue())). // Her gönderinin `body` alanına sahip olduğunu doğrulamak
                log().all(); // Yanıtı konsola yazdırmak için
    }
}
