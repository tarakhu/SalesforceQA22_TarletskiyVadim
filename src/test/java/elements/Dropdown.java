package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement {

    private String name;
    private final static String DROPDOWN_LOCATOR = "//button[@class='slds-combobox__input slds-input_faux" +
            " slds-combobox__input-value' and @name='%s']";

    public Dropdown(WebDriver driver) {
        super(driver);
    }

    public void setValue(String value) {
        WebElement dropdown = driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, this.name)));
        scrollIntoView(dropdown);
        dropdown.sendKeys(value);
    }

}
