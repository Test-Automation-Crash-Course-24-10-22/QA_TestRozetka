package rozetka;

import com.rozetka.testCaseOne.TestFacade;
import org.junit.Test;
import rozetka.runers.BaseTest;

public class RozetkaTest extends BaseTest {
    @Test
    public void registrationWithValidData() throws InterruptedException {
        TestFacade.Interface signUp = new TestFacade().new Interface();
        TestFacade newUser = new TestFacade.Builder()
                .fillName("Дмитро")
                .fillSurname("Федоров")
                .fillPhone("932348399")
                .fillEmail("qa.testing.fedorov@gmail.com")
                .fillPassword("789ecrEDG9")
                .build();
        signUp.successfulTest();
    }
}
