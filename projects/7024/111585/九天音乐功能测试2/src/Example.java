import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Example {

    // <!> Check if selenium-standalone.jar is added to build path.
	public static void switchWindow(String title,WebDriver driver){
	    
		Set<String> handles = driver.getWindowHandles();
	    // 切换窗口的方式--循环遍历handles集合
	    for (String handle : handles) {
	        //判断是哪一个页面的句柄？？--根据什么来判断？？？title
	        if(driver.getTitle().equals(title)){
	        break;
	    }else{
	        //切换窗口--根据窗口标识来切换
	        driver.switchTo().window(handle);
	    	}
	    }
	}

    public static void test(WebDriver driver) throws InterruptedException {
        
    	
    	driver.get("http://new.9sky.com/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//div[@id=\'content\']/div[6]/a/i")).click();
    	Thread.sleep(2000);
    	
        switchWindow("发现好音乐-九天音乐-免费高品质原创音乐平台", driver);
    	Thread.sleep(20000);
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/dl[1]/dd[10]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/dl[2]/dd[3]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/dl[3]/dd[2]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/dl[1]/dd[1]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/dl[2]/dd[2]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/dl[3]/dd[1]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"morep\"]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"recordboxdiv\"]/dl[1]/a/dt/img")).click();
    	Thread.sleep(4000);
    	
    	switchWindow("New Year's Eve!-唱片-九天音乐", driver);
    	
    	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/ul[2]/li[1]/a")).click();
    	Thread.sleep(3000);
    	switchWindow("正在播放-Beyond The Horizon", driver);
    	
    	driver.findElement(By.xpath("//*[@id=\"jp_container_1\"]/div[2]/div[1]/div[3]/img")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"jp_container_1\"]/div[2]/div[3]/img")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"jp_container_1\"]/div[2]/div[1]/div[4]/img")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"playimg\"]")).click();
    	Thread.sleep(3000);
    	
    	
    	switchWindow("New Year's Eve!-唱片-九天音乐", driver);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[3]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]/a")).click();
    	Thread.sleep(3000);
    	
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
