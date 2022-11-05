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
    	driver.get("http://114.215.176.95:60509/girl-bbs/index.jsp");
        Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/a/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/font/form/table/tbody/tr[3]/td/a/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/a/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("ljh1");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("123456");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("123456");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[5]/td[2]/select")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[5]/td[2]/select/option[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")).sendKeys("15962851850");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("test@test.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/input[1]")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("/html/body/center[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/center/a[1]/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/center[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/center/a[4]/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/center[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/center/a[2]/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/center[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/center/a[3]/font")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/center[2]/form/input[1]")).sendKeys("test");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/center[2]/form/input[2]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/center/center[2]/a[2]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/center[2]/a[2]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td/input")).sendKeys("hello");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[3]/td/textarea")).sendKeys("hello,world");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td/input")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/center[2]/a[1]")).click();
    	Thread.sleep(5000);
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
