package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntityBasePage extends BasePage {

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By SAVE_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void waitForSaveButtonIsDisplayed() {
        waitForElementDisplayed(SAVE_BUTTON);
    }

    public EntityBasePage(WebDriver driver) {
        super(driver);
    }
}
