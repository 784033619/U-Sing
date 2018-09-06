import org.junit.Test;

import java.util.Random;

public class VerifyCode {
    @Test
    public void test(){
        String verifyCode = String
                .valueOf(new Random().nextInt(899999) + 100000);
        System.out.println(verifyCode);
    }
}
