import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) throws InterruptedException {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	driver.get("http://114.215.176.95:60503/goodmanage/index.jsp");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#userName")).sendKeys("zhangsan");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#password")).sendKeys("123456");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
    	Thread.sleep(6000);
    	driver.switchTo().frame("leftFrame");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"menuTree\"]/div/div[4]/div[1]/span[2]/a")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"menuTree\"]/div/div[4]/div[2]/div/span[2]/a")).click();
    	Thread.sleep(3000);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("mainFrame");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#productName")).sendKeys("test-ljh");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#productPrice")).sendKeys("1000");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#description")).sendKeys("test");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#productNumber")).sendKeys("100");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[5]/td/input[1]")).click();
    	Thread.sleep(1000);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("leftFrame");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"menuTree\"]/div/div[4]/div[3]/div/span[2]/a")).click();
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("mainFrame");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td/input[1]")).sendKeys("2");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td/input[3]")).click();
    	Thread.sleep(1000);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("topFrame");
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("#HyperLink3")).click();
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
