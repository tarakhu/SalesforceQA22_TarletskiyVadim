package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecordLayoutItem extends BaseElement{

    private final static String LEAD_DETAILS_LOCATOR = "//*[contains(@class, 'slds-show')]//span[text()='%s']" +
            "/ancestor::records-record-layout-item//*[@data-output-element-id='output-field']";
    public RecordLayoutItem(WebDriver driver, String label) {
        super(driver, label);
    }

    public String getValue() {
        WebElement data = driver.findElement(By.xpath(String.format(LEAD_DETAILS_LOCATOR, this.label)));
        scrollIntoView(data);
        return data.getText();
    }
}
