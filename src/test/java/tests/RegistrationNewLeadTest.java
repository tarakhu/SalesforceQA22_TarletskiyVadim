package tests;

import models.Lead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationNewLeadTest extends BaseTest {

    @Test
    public void registrationNewLeadTest() {

        loginPage.setUsername(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();

        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        leadsPage.waitForSaveButtonIsDisplayed();

//        String firstName = "sfdgdfh";
//        String lastName = "dfgdfg";
//        String company = "dfggfdfg";
//        String city = "Minsk";
//        int postalCode = 23455;
//        String province = "dfgdf";
//        String country = "dfgdf";
//        int numberOfEmployees = 123;
//        int annualRevenue = 444;
//        int phone = 12345556;
//        String email = "sdghg@gmail.com";
//        String website = "sdfgfdgh.com";
//        String industry = "Banking";
//        Lead testLead = new Lead("sfdgdfh", "dfgdfg", "dfggfdfg", "Minsk" , 23455,
//                "dfgdf", "dfgdf", 123, 444, 12345556, "sdghg@gmail.com",
//                "sdfgfdgh.com", "Banking", "Dr.", "New", "Warm", "Other",
//                "Marshala Losika, 6", "dfgdgfh");

        Lead lead = new Lead.LeadBuilder("Tarletskiy", "Epam", "New")
                .setFirstName("Vadim")
                .setLeadSource("On Site")
                .setAnnualRevenue(50000)
                .setCity("Minsk")
                .setCountry("Belarus")
                .setDescription("It's a really good guy!")
                .setEmail("membrana11@gmail.com")
                .setIndustry("Banking")
                .setPostalCode(12345)
                .setNumberOfEmployees(5)
                .setPhone(372552525)
                .setRating("Hot")
                .setStreet("Timiryzeva, 67")
                .setWebsite("opaopaopapa@bumbum.bom")
                .setSalutation("Prof.")
                .setProvince("Marokko")
                .build();

        newLeadModal.fillForm(lead);
        newLeadModal.clickSaveButton();

//        Assert.assertEquals(leadDetailsPage.getCompany(company), company);





    }
}
