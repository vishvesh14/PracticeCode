import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FindBrokenLinks {
    //()
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\AutomationTools\\Chrome_Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);

        Set<String> brokenLinkURL = new HashSet<String>();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of Links on webpage: "+links.size());

        for (WebElement link : links) {
            String linkURL = link.getAttribute("href");

            URL url = new URL(linkURL);

            URLConnection urlConnection = url.openConnection();

            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

            httpURLConnection.setConnectTimeout(50000);

            //establish connection
            httpURLConnection.connect();

            int value = httpURLConnection.getResponseCode();
            if (value >=400){
                System.out.println(linkURL + " - " + "is broken link");
            }
            else
                System.out.println(linkURL + " - " + "is valid link");
        }
        driver.quit();
    }
}
