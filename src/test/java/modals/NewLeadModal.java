package modals;

import elements.Dropdown;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal {

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String firstName, String lastName, String company, String city, int postalCode,
                         String province, String country, int numberOfEmployees, int annualRevenue, int phone, String email,
                         String website/*, String salutation*/) {
        new Input(driver, "firstName").setValue(firstName);
        new Input(driver, "lastName").setValue(lastName);
        new Input(driver, "Company").setValue(company);
        new Input(driver, "city").setValue(city);
        new Input(driver, "postalCode").setValue(String.valueOf(postalCode));
        new Input(driver, "province").setValue(province);
        new Input(driver, "country").setValue(country);
        new Input(driver, "NumberOfEmployees").setValue(String.valueOf(numberOfEmployees));
        new Input(driver, "AnnualRevenue").setValue(String.valueOf(annualRevenue));
        new Input(driver, "Phone").setValue(String.valueOf(phone));
        new Input(driver, "Email").setValue(email);
        new Input(driver, "Website").setValue(website);
//        new Dropdown(driver, "")
    }
}