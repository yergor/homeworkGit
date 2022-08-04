import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest(){
        System.out.println("Hello World!");
    }

    @Test
    void conflict(){
        Assertions.assertFalse(true);
    }
}
