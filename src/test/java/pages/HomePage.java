package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final static By USER_ICON = By.cssSelector(".slds-avatar_profile-image-small");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON).isDisplayed();
    }

    public void waitForUserAvatarIsDisplayed() {
        waitForElementDisplayed(USER_ICON);
    }


}
