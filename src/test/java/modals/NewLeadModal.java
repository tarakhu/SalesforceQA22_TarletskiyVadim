package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal{

    private final static By FIRSTNAME_INPUT = By.xpath("//input[@class='slds-input' and @name='firstName']");
    private final static By LASTNAME_INPUT = By.xpath("//input[@class='slds-input' and @name='lastName']");
    private final static By COMPANY_INPUT = By.xpath("//input[@class='slds-input' and @name='Company']");
    private final static By CITY_INPUT = By.xpath("//input[@class='slds-input' and @name='city']");
    private final static By POSTAL_CODE_INPUT = By.xpath("//input[@class='slds-input' and @name='postalCode']");
    private final static By PROVINCE_INPUT = By.xpath("//input[@class='slds-input' and @name='province']");
    private final static By COUNTRY_INPUT = By.xpath("//input[@class='slds-input' and @name='country']");
    private final static By NUMBER_OF_EMPLOYEES_INPUT = By.xpath("//input[@class='slds-input' and @name='NumberOfEmployees']");
    private final static By ANNUAL_REVENUE_INPUT = By.xpath("//input[@class='slds-input' and @name='AnnualRevenue']");
    private final static By PHONE_INPUT = By.xpath("//input[@class='slds-input' and @name='Phone']");
    private final static By EMAIL_INPUT = By.xpath("//input[@class='slds-input' and @name='Email']");
    private final static By WEBSITE_INPUT = By.xpath("//input[@class='slds-input' and @name='Website']");
    private final static By PHONE_INPUT = By.xpath("//input[@class='slds-input' and @name='Phone']");
    private final static By PHONE_INPUT = By.xpath("//input[@class='slds-input' and @name='Phone']");
    private final static By PHONE_INPUT = By.xpath("//input[@class='slds-input' and @name='Phone']");
    private final static By PHONE_INPUT = By.xpath("//input[@class='slds-input' and @name='Phone']");

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void setFirstnameInput(String value) {
        driver.findElement(FIRSTNAME_INPUT).sendKeys(value);
    }

    public void setLastnameInput(String value) {
        driver.findElement(LASTNAME_INPUT).sendKeys(value);
    }

    public void setCompanyInput(String value) {
        driver.findElement(COMPANY_INPUT).sendKeys(value);
    }

    public void setCityInput(String value) {
        driver.findElement(CITY_INPUT).sendKeys(value);
    }

    public void setPostalCodeInput(String value) {
        driver.findElement(POSTAL_CODE_INPUT).sendKeys(value);
    }

    public void setProvinceInput(String value) {
        driver.findElement(PROVINCE_INPUT).sendKeys(value);
    }

    public void setCountryInput(String value) {
        driver.findElement(COUNTRY_INPUT).sendKeys(value);
    }

    public void setNumberOfEmployeesInput(String value) {
        driver.findElement(NUMBER_OF_EMPLOYEES_INPUT).sendKeys(value);
    }

    public void setAnnualRevenueInput(String value) {
        driver.findElement(ANNUAL_REVENUE_INPUT).sendKeys(value);
    }

    public void setPhoneInput(String value) {
        driver.findElement(PHONE_INPUT).sendKeys(value);
    }

    public void setEmailInput(String value) {
        driver.findElement(EMAIL_INPUT).sendKeys(value);
    }

    public void setWebsiteInput(String value) {
        driver.findElement(WEBSITE_INPUT).sendKeys(value);
    }

    public void setFirstnameInputValue(String value) {
        driver.findElement(FIRSTNAME_INPUT).sendKeys(value);
    }

}
