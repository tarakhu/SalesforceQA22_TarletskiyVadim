package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement {

    private final static String DROPDOWN_LOCATOR = "//label[text()='%s']/following-sibling::div/lightning-base-combobox";
    private final static String DROPDOWN_BUTTON_LOCATOR = ".//button";
    private final static String OPTION_DROPDOWN_LOCATOR = ".//lightning-base-combobox-item//span[text()='%s']";

    public Dropdown(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setDropdownValue(String value) {
        WebElement dropdown = driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, this.label)));
        scrollIntoView(dropdown);
        dropdown.findElement(By.xpath(DROPDOWN_BUTTON_LOCATOR)).click();
        dropdown.findElement(By.xpath(String.format(OPTION_DROPDOWN_LOCATOR, value))).click();
    }

}
