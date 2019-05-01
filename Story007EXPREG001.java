package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Story007EXPREG001 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://thawing-shelf-73260.herokuapp.com/index.jsp"";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testStory007EXPREG001() throws Exception {
    driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
    driver.findElement(By.linkText("Register new user")).click();
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("TestUID_1");
    driver.findElement(By.id("password1")).clear();
    driver.findElement(By.id("password1")).sendKeys("qwerty");
    driver.findElement(By.id("password1")).click();
    driver.findElement(By.id("password1")).clear();
    driver.findElement(By.id("password1")).sendKeys("123456");
    driver.findElement(By.id("password2")).click();
    driver.findElement(By.id("password2")).clear();
    driver.findElement(By.id("password2")).sendKeys("123456");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Repeat Password'])[1]/following::div[3]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Repeat Password'])[1]/following::div[3]")).getText(), "password1 wasn't equal to password2");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("reset")).click();
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("qwerty");
    driver.findElement(By.id("password1")).click();
    driver.findElement(By.id("password1")).clear();
    driver.findElement(By.id("password1")).sendKeys("123456");
    driver.findElement(By.id("password2")).click();
    driver.findElement(By.id("password2")).clear();
    driver.findElement(By.id("password2")).sendKeys("123456");
    driver.findElement(By.id("submit")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::font[2]")).getText(), "qwerty");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::font[2]")).getText(), "qwerty");
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
