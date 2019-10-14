package wp_post;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

    public static void main(String args[]) throws InterruptedException, MalformedURLException, IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.alfaromeousa.com");
        List<WebElement> links = driver.findElements(By.tagName("img"));
        // this will display list of all images exist on page
        for (WebElement ele : links) {
            //System.out.print(ele.getAttribute("src"));
            String url = ele.getAttribute("src");
            String fileName = url.substring(url.lastIndexOf('/') + 1);
            if(fileName.length() > 100){
                fileName = fileName.substring(0, 100);
            }
            
            URLConnection urlConnection = new URL(ele.getAttribute("src")).openConnection();
            int size = urlConnection.getContentLength();
            System.out.println(fileName + "    ---->  " + (float) size / 1000 + "KB");
        }

        //Wait for 5 Sec
        Thread.sleep(5);

        // Close the driver
        driver.quit();
    }
}
