package SOdev1;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deneme {
    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
       driver.get("https://infotechacademy.eu/");
       Thread.sleep(2000);
        Dimension d = new Dimension(300,300);
       driver.manage().window().setSize(d);
        Thread.sleep(2000);

        Point p = new Point(150,150);
       driver.manage().window().setPosition(p);
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

       driver.manage().window().minimize();
        Thread.sleep(2000);

       driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com/search?q=emma+watson&client=ms-android-xiaomi-rvo3&prmd=inv&sxsrf=ALiCzsZiEXKyxZXivX5gzXz_M1OVXlD9LA:1655556094996&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjlmcqHg7f4AhVSh_0HHQrODpwQ_AUoAXoECAIQAQ&biw=393&bih=793&dpr=2.75#imgrc=-x9EaDCN0blfQM");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();
    }
}
