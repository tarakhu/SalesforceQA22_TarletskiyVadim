package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.NewLeadModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {
    protected final static String BASE_URL = "https://login.salesforce.com/";
    protected final static String USER_NAME = "membrana11-n6l0@force.com";
    protected final static String PASSWORD = "P@ssword1";

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected NewLeadModal newLeadModal;
    protected LeadDetailsPage leadDetailsPage;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        leadDetailsPage = new LeadDetailsPage(driver);


    }

    @BeforeMethod(alwaysRun = true)
    public void navigate()  {
        driver.get(BASE_URL);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown()  {
        driver.quit();
    }
}
