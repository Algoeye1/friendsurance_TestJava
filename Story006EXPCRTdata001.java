package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Story006EXPCRTdata001 {
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
  public void testStory006EXPCRTdata001() throws Exception {
    driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::div[5]")).click();
    try {
      assertEquals(driver.findElement(By.linkText("Register new user")).getText(), "Register new user");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals(driver.findElement(By.linkText("Register new user")).getText(), "Register new user");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::div[2]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::label[1]")).getText(), "Username");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[1]/following::div[3]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[1]/following::label[1]")).getText(), "Password");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).getText(), "Login");
    driver.findElement(By.id("go_add_expense")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::div[1]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).getText(), "Login");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("go_list_expenses")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).getText(), "Login");
    driver.findElement(By.id("go_list_categories")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::div[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).getText(), "Login");
    driver.findElement(By.id("go_show_statistics")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Statistics'])[1]/following::h3[1]")).getText(), "Login");
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
