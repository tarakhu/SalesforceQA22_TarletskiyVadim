package tests;

import com.github.javafaker.Faker;
import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

public class RegistrationNewLeadTest extends BaseTest {

    @DataProvider(name = "new Lead")
    public Object[][] newTestLeadsData() {
        Faker faker = new Faker();
        return new Object[][] {
                {new  Lead.LeadBuilder("Tarletskiy", "Epam", LeadStatus.NEW)
                        .setFirstName("Vadim")
                        .setLeadSource(LeadSource.ADVERTISEMENT)
                        .setAnnualRevenue("500")
                        .setCity("Minsk")
                        .setCountry("Belarus")
                        .setDescription("It's a really good guy!")
                        .setEmail("membrana11@gmail.com")
                        .setIndustry(Industry.BANKING)
                        .setPostalCode(12345)
                        .setNumberOfEmployees(5)
                        .setPhone(372552525)
                        .setRating(Rating.HOT)
                        .setStreet("Timiryzeva, 67")
                        .setWebsite("opaopaopapa@bumbum.bom")
                        .setSalutation(Salutations.MR)
                        .setProvince("Marokko")
                        .build()},
                {new  Lead.LeadBuilder(faker.name().lastName(), faker.company().name(), LeadStatus.WORKING)
                        .setFirstName(faker.name().firstName())
                        .setLeadSource(LeadSource.EMPLOYEE_REFERRAL)
                        .setAnnualRevenue("777")
                        .setCity(faker.address().city())
                        .setCountry(faker.address().country())
                        .setDescription("kopio")
                        .setEmail("sdfsd@gmail.com")
                        .setIndustry(Industry.APPAREL)
                        .setPostalCode(44645)
                        .setNumberOfEmployees(55)
                        .setPhone(37245675)
                        .setRating(Rating.COLD)
                        .setStreet("Tim, 67")
                        .setWebsite("opapa@bumbum.bom")
                        .setSalutation(Salutations.PROF)
                        .setProvince("Marokko")
                        .build()},
                {new  Lead.LeadBuilder("Tarlyrjj", "Epa", LeadStatus.WORKING)
                        .setFirstName("Vad")
                        .setLeadSource(LeadSource.EMPLOYEE_REFERRAL)
                        .setAnnualRevenue("777")
                        .setCity("Mik")
                        .setCountry("Bela")
                        .setDescription("kopio")
                        .setEmail("mna11@gmail.com")
                        .setIndustry(Industry.NONE)
                        .setPostalCode(14334)
                        .setNumberOfEmployees(555)
                        .setPhone(3343434)
                        .setRating(Rating.WARM)
                        .setStreet("XAXAXAXAX")
                        .setWebsite("pa@bum.bom")
                        .setSalutation(Salutations.NONE)
                        .setProvince("trgggho")
                        .build()},
                {new  Lead.LeadBuilder("Tarlyff", "Epafdfd", LeadStatus.UNQUALIFIED)
                        .setFirstName("Vfgvg")
                        .setLeadSource(LeadSource.ADVERTISEMENT)
                        .setAnnualRevenue("444")
                        .setCity("Mik")
                        .setCountry("Bela")
                        .setDescription("kopio")
                        .setEmail("mna11@gmail.com")
                        .setIndustry(Industry.APPAREL)
                        .setPostalCode(14564)
                        .setNumberOfEmployees(55)
                        .setPhone(37245675)
                        .setRating(Rating.COLD)
                        .setStreet("Tim, 67")
                        .setWebsite("opapa@bumbum.bom")
                        .setSalutation(Salutations.PROF)
                        .setProvince("Marokko")
                        .build()}
        };
    }

    @Test(dataProvider = "new Lead")
    public void registrationNewLeadTest(Lead lead) {

        loginPage.setUsername(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();

        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        leadsPage.waitForSaveButtonIsDisplayed();

        newLeadModal.fillForm(lead);
        newLeadModal.clickSaveButton();
        leadDetailsPage.waitForLeadOwnerIsDisplayed();
        Assert.assertTrue(leadDetailsPage.leadCreatedMessage());


        Assert.assertEquals(leadDetailsPage.getLeadDetails(), lead);





    }
}
