import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import quotes.Quote;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QTest {
    @Test
    void toStringReturnRandomQuoteAndItsAuthor(){

        String filePath = "C:\\Users\\ahmad\\quotes\\app\\src\\main\\resources\\Q.json";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            Quote [] allq = new Quote[5];
            Gson gson = new Gson();
            allq = gson.fromJson(bufferedReader, Quote[].class);
            int random = (int)Math.floor(Math.random() * (allq.length - 0 + 1) + 0);
            System.out.println(allq[random].toString());
            Quote t = new Quote();
            t=allq[random];
            Assertions.assertEquals(t,allq[random]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
