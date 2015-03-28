package ru.st.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest extends ru.st.selenium.pages.TestBase {
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void testUntitled() throws Exception {

        driver.get("http://vk.com/");
        driver.findElement(By.cssSelector("#quick_email")).clear();
        driver.findElement(By.cssSelector("#quick_email")).sendKeys("renat-g@rap.ru");
        driver.findElement(By.cssSelector("#quick_pass")).clear();
        driver.findElement(By.cssSelector("#quick_pass")).sendKeys("Renat5a40");
        driver.findElement(By.cssSelector("#quick_login_button")).click();

    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
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

