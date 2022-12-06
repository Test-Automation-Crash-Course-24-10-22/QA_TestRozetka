package rozetka;

import com.rozetka.testCaseOne.TestFacade;
import org.junit.Test;
import rozetka.runers.BaseTest;

public class RozetkaTest extends BaseTest {
    @Test
    public void registerNewUser() throws InterruptedException {
        TestFacade.Interface signUp = new TestFacade().new Interface();
        TestFacade newUser = new TestFacade.Builder()
                .fillName("1")
                .fillSurname("1")
                .fillPhone("111")
                .fillEmail("111")
                .fillPassword("1")
                .build();
        signUp.successfulTest();
    }
}
