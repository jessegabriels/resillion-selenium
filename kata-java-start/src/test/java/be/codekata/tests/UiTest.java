package be.codekata.tests;
import be.codekata.pages.GoogleHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UiTest {
    @Test
    public void checkUI(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jesse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String pageTitle = driver.getTitle();

        assertEquals("Google", pageTitle);

        driver.close();
    }

    @Test
    public void checkFirstSportsArticle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jesse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement popUp = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
        popUp.click();


        // Search for a term and press enter
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBox.sendKeys("gva");
        searchBox.submit();

        // Get the text of the first returned webpage
        WebElement hln = driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        hln.click();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement coockies = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/button[2]"));
        coockies.click();

        WebElement sports = driver.findElement(By.xpath("/html/body/div[4]/div[1]/header/div[1]/nav/ul[1]/li[3]/a/div"));
        sports.click();

        WebElement firstArticle = driver.findElement(By.xpath("/html/body/div[5]/div/div/main/div/div[2]/div/div/div[1]/div/div/div/a/div/div/div/h1"));
        String firstArticleText = firstArticle.getText();

        assertEquals("KVM-coach Defour rekent zich nog niet rijk tegen Zulte Waregem: “Maar wel logisch dat we aan de bekerfinale denken”", firstArticleText);


        // Close the browser
        driver.close();
    }

    @Test
    public void checkFirstSportsArticleHLN(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jesse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement popUp = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
        popUp.click();


        // Search for a term and press enter
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBox.sendKeys("hln");
        searchBox.submit();

        // Get the text of the first returned webpage
        WebElement hln = driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        hln.click();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement iframe = driver.findElement(By.cssSelector("#sp_message_iframe_767683"));
        driver.switchTo().frame(iframe);

        WebElement coockies = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/button[1]"));
        coockies.click();

        driver.switchTo().defaultContent();

        WebElement sports = driver.findElement(By.xpath("/html/body/header/section[3]/div[1]/div/nav/div[1]/ul/li[2]/a"));
        sports.click();

        WebElement firstArticle = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div/section/div[1]/div/article/a/div[2]/header/h2"));
        String firstArticleText = firstArticle.getText();

        assertEquals("WUYTS & VLAEMINCK. “Misschien zit Wout van Aert nu wel in de moeilijk\u00ADste positie bij Jum\u00ADbo-Vis\u00ADma”", firstArticleText);


        // Close the browser
        driver.close();
    }

}
