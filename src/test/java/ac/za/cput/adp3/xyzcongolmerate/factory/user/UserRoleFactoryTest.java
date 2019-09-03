package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
       UserRole userRole=UserRoleFactory.buildUser("as@ghj.vom","name","12");
        Assert.assertNotNull(userRole);
    }
}
