package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        User user=UserFactory.buildUser("as@ghj.vom","name","soweto");
        Assert.assertNotNull(user);
    }
}
