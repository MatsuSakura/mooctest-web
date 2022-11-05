import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
    	driver.get("https://nj.zu.anjuke.com/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
    	Thread.sleep(1000);
    	WebElement nj=driver.findElement(By.xpath("//*[@id=\"switch_apf_id_5\"]/i"));
    	nj.click();
//    	driver.findElement(By.xpath("//*[@id=\"switch_apf_id_5\"]/i")).click();
    	driver.findElement(By.xpath("//*[@id=\"city_list\"]/dl[2]/dd/a[4]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/span[2]/div/a[3]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/span[2]/div/div/a[24]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"from-price\"]")).sendKeys("5000");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"to-price\"]")).sendKeys("8000");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"pricerange_search\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[4]/span[2]/a[2]")).click();
    	driver.findElement(By.xpath("//*[@id=\"condhouseage_txt_id\"]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"condmenu\"]/ul/li[2]/ul/li[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"search-rent\"]")).sendKeys("¾­ÌìÂ·");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"list-content\"]/div[1]/a[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"list-content\"]/div[2]/div/a[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"list-content\"]/div[2]/div/a[3]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"list-content\"]/div[3]")).click();
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
