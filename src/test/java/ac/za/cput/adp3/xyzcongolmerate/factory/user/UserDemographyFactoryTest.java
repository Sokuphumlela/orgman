package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        Date date= new Date();
        UserDemography userDemography=UserDomegraphyFactory.buildUserDemography("@fdds","Das","male");
        Assert.assertNotNull(userDemography);
    }
}
