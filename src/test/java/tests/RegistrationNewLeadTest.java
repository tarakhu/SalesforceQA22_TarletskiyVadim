package tests;

import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationNewLeadTest extends BaseTest {

    @Test
    public void registrationNewLeadTest() throws InterruptedException {

        loginPage.setUsername(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();

        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        leadsPage.waitForSaveButtonIsDisplayed();

        Lead lead = new Lead.LeadBuilder("Tarletskiy", "Epam", LeadStatus.NEW)
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
                .build();

        newLeadModal.fillForm(lead);
        newLeadModal.clickSaveButton();

        Thread.sleep(5000);


        Assert.assertEquals(leadDetailsPage.getLeadDetails(), lead);





    }
}
