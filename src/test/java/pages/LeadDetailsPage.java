package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends HomePage {

    private final static By NAME = By.xpath("//lightning-formatted-name[@data-output-element-id='output-field']");
    private final static By COMPANY = By.xpath("(//lightning-formatted-text[@data-output-element-id='output-field'])[2]");
    private final static By LEAD_STATUS = By.xpath("(//lightning-formatted-text[@data-output-element-id='output-field'])[1]");
    private final static By TITLE = By.xpath("(//lightning-formatted-text[@data-output-element-id='output-field'])[3]");
    private final static By ANNUAL_REVENUE = By.xpath("(//lightning-formatted-text[@data-output-element-id='output-field'])[6]");
    private final static By FIRST_NAME = By.xpath("//lightning-formatted-name[@data-output-element-id='output-field']");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getName() {
        String getName = driver.findElement(NAME).getText();
        return getName;
    }

    public String getLeadStatus() {
        String getLeadStatus = driver.findElement(LEAD_STATUS).getText();
        return getLeadStatus;
    }

    public String getCompany() {
        String getCompany = driver.findElement(COMPANY).getText();
        return getCompany;
    }

    public String getAnnualRevenue() {
        String getAnnualRevenue = driver.findElement(ANNUAL_REVENUE).getText();
        return getAnnualRevenue;
    }

    public String getTitle() {
        String getTitle = driver.findElement(TITLE).getText();
        return getTitle;
    }
}
