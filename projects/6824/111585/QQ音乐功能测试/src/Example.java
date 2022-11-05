import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Example {
	static JavascriptExecutor js;
    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) throws InterruptedException{
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	driver.get("https://y.qq.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div/div/ul/li/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div/div/ul[2]/li/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'content\']/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'content\']/div[2]/div[2]/a/i[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'content\']/div[2]/div/a/i[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'content\']/div/div[3]/ul/li[2]/div/h4/span/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div/div/div[3]/a/span")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div/div/div[3]/a/span")).click();
        Thread.sleep(8000);
//        WebElement search_setting = driver.findElement(By.className("songlist__songname"));
//        // 创建actions对象
//        Actions action = new Actions(driver);
//        // 模拟鼠标悬停
//        action.clickAndHold(search_setting).perform();
        driver.findElement(By.className("songlist__songname")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("播放")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div/div[2]/div/div/ul[2]/li[1]/div/div[3]/div/a[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[2]/div/div[2]/div/div/ul[2]/li/div/div[3]/div/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[2]/div/div[2]/div/div/ul[2]/li/div/div[3]/div/a[2]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'fav_pop\']/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\'new_playlist\']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\'new_playlist\']")).sendKeys("测试大赛全国总决赛");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\'checkbox\'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[2]/div/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[2]/div/div/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[3]/a[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[3]/a[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[3]/a[8]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div/div/div[3]/a[4]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'comment_box\']/div[2]/div/div/div")).click();
        Thread.sleep(2000);
        {
          WebElement element = driver.findElement(By.xpath("//div[@id=\'comment_box\']/div[2]/div/div/div[2]"));
          js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '好听'}", element);
        }
        driver.findElement(By.xpath("//div[@id=\'comment_box\']/div[2]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'comment_box\']/div[2]/div[3]/div/div/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'comment_box\']/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'comment_box\']/div[2]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/a")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[2]/div/div/a[4]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div/div/ul[2]/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[3]/div/div/a[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[3]/div/div[2]/a[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[3]/div/div[3]/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[3]/div/div[4]/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[3]/ul/li/a")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div/div/div[3]/a[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div/div/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/ul/li/div/h3/a")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id=\'mvplayer\']/div/div/div[7]/a[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'mvplayer\']/div/div/div[7]/div[5]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div/div/ul[2]/li[4]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div/dl[3]/dd/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div[2]/div[2]/div[3]/ul[2]/li/div/div[3]/div/a/i")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[3]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div[4]/div[3]/a[7]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div/div/ul/li/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'app\']/div/div/div/ul[2]")).click();
        Thread.sleep(4000);
      }
    	

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
