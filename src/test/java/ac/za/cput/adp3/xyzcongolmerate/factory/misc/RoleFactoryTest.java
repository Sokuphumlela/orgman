package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
     Role role=RoleFactory.buildRole("Sd");
     Assert.assertNotNull(role);
     System.out.println(role.toString());
    }
}
