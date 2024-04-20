import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver;
    private String path = "F:\\ISJ\\Inge4\\Semestre2\\Test Logiciel\\automatisation_selennium\\src\\test\\resources\\driver\\chromedriver.exe";

    private By avatar_click = By.id("style_avatar_wrapper__pEGIQ");
    private By avav = By.className("css-80nwu0");
    private By email_login = By.id("email_login");
    private By password_login = By.id("password_login");
    private By btn_login = By.id("btn_login");
    private By logOut = By.className(".style_ant_menu_item__Aqa9N");
    private By section_Register = By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)");
    private By email_register = By.id("email_register");
    private By password_register = By.id("password_register");
    private By confirm_password = By.id("confirm_password_register");
    private By btn_register = By.id("btn_register");

    @BeforeTest()
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", this.path);
        this.driver = new ChromeDriver();
    }

    @Test()
    public void loginLogOut() throws InterruptedException {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(avatar_click).click();
        this.driver.findElement(email_login).sendKeys("testeur@gmail.com");
        this.driver.findElement(password_login).sendKeys("12345678");
        this.driver.findElement(btn_login).click();
        Thread.sleep(5000);
        Assert.assertTrue(this.driver.findElement(By.className("ant-badge-status-green")).isDisplayed(), "vous etes connecté");
//        this.driver.findElement(avav).click();
//        this.driver.findElement(avatar_click).click();
//        this.driver.findElement(logOut).click();
    }

    @Test()
    public void register() {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(avatar_click).click();
        this.driver.findElement(section_Register).click();
        this.driver.findElement(email_register).sendKeys("testeur2@gmail.com");
        this.driver.findElement(password_register).sendKeys("123456789");
        this.driver.findElement(confirm_password).sendKeys("123456789");
        this.driver.findElement(btn_register).click();
    }

    @Test()
    public void logOut() {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(btn_login).click();
        this.driver.findElement(avatar_click).click();
        this.driver.findElement(logOut).click();
    }

//    @Test()
//    public void assertionDispo() {
//        this.driver.get("https://ztrain-web.vercel.app/home");
//
//
//    }

//    @AfterTest()
//    public void closeDriver() {
//        this.driver.quit();
//    }
}

