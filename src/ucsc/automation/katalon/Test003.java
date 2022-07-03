package ucsc.automation.katalon;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class Test003 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SudharaD\\eclipse-workspace\\autocourse1\\libraries\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://demo.guru99.com/test/newtours/index.php");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("submit")).click();
    driver.get("https://demo.guru99.com/test/newtours/login_sucess.php");
    driver.findElement(By.linkText("Flights")).click();
    driver.get("https://demo.guru99.com/test/newtours/reservation.php");
    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("New York");
    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("San Francisco");
    new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("August");
    new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
    driver.findElement(By.name("findFlights")).click();
    driver.get("https://demo.guru99.com/test/newtours/reservation2.php");
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::font[2]")).getText(), "After flight finder - No Seats Avaialble");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
