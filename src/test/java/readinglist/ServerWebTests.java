package readinglist;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

/**
 * Created by guoruirui on 2017/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ReadingListApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServerWebTests {

    private static InternetExplorerDriver browser;
    //private static ChromeDriver browser;

    @Value("${local.server.port}")
    private int port;

    @BeforeClass
    public static void openBrowser(){
        //System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");
        browser = new InternetExplorerDriver();
        //browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeBrowser(){
        browser.close();
        browser.quit();
    }

    @Test
    public void login(){
        //String baseUrl = "http://localhost:" + port;

        String baseUrl = "http://www.baidu.com";
        System.out.println("start");
        browser.get(baseUrl);
        System.out.println("end");

//        browser.findElementByTagName("username").sendKeys("craig");
//        browser.findElementByTagName("password").sendKeys("password");
//        browser.findElementByTagName("submit").submit();

//        assertEquals("You have no books in your book list", browser.findElementByTagName("div").getText());
//
//        browser.findElementByTagName("title").sendKeys("BOOK TITLE");
//        browser.findElementByTagName("author").sendKeys("BOOK AUTHOR");
//        browser.findElementByTagName("isbn").sendKeys("1234567890");
//        browser.findElementByTagName("description").sendKeys("DESCRIPTION");
//        browser.findElementByTagName("form").submit();
//
//        WebElement dl= browser.findElementByCssSelector("dt.bookHeadline");
//        assertEquals("BOOK TITLE by BOOK AUTHOR (ISBN: 1234567890)", dl.getText());
//        WebElement dt= browser.findElementByCssSelector("dd.bookDescription");
//        assertEquals("DESCRIPTION", dt.getText());
    }

//    @Test
//    public void addBookToEmptyList(){
//        String baseUrl = "http://localhost:" + port;
//
//        browser.get(baseUrl);
//
//
//
//        assertEquals("You have no books in your book list", browser.findElementByTagName("div").getText());
//
//        browser.findElementByTagName("title").sendKeys("BOOK TITLE");
//        browser.findElementByTagName("author").sendKeys("BOOK AUTHOR");
//        browser.findElementByTagName("isbn").sendKeys("1234567890");
//        browser.findElementByTagName("description").sendKeys("DESCRIPTION");
//        browser.findElementByTagName("form").submit();
//
//        WebElement dl= browser.findElementByCssSelector("dt.bookHeadline");
//        assertEquals("BOOK TITLE by BOOK AUTHOR (ISBN: 1234567890)", dl.getText());
//        WebElement dt= browser.findElementByCssSelector("dd.bookDescription");
//        assertEquals("DESCRIPTION", dt.getText());
//    }
}
