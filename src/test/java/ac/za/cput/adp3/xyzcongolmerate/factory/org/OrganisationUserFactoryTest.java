package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUse=OrganisationUserFactory.buildOrganisationUser("23", "lun@gh.com");
        Assert.assertNotNull(organisationUse);
    }
}
