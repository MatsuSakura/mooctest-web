import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import org.openqa.selenium.By;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.
	public static void switchWindow(String title,WebDriver driver) {
		Set<String> handles=driver.getWindowHandles();
		for(String handle : handles) {
			if(driver.getTitle().equals(title)) {
				break;
			}else {
				driver.switchTo().window(handle);
			}
		}
	}
	
	
	
    public static void test(WebDriver driver) throws InterruptedException {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	driver.get("https://www.qyer.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/header/div/div[1]/ul/li[2]/a/span")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/header/div/div[1]/ul/li[3]/a/span")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"idxRootWrap\"]/div[1]/div/div[1]/ul/li[4]/a/span")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[5]/a/span[1]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[6]/a/span")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/header/div/div[1]/ul/li[7]/a/span[1]")).click();
    	Thread.sleep(2000);
    	//���Ŀ�ĵ�
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/header/div/div[1]/ul/li[1]/a/span")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"js-search\"]/div[1]/div[1]/input")).sendKeys("�Ͼ�");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"js-search\"]/div[1]/div[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div[3]/a[3]")).click();
    	Thread.sleep(2000);
    	
    	switchWindow("�Ͼ�ȫ�����е�_�Ͼ��������е�_�Ͼ����е��Ƽ� - ������", driver);
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"poiSort\"]/a[4]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"poiSortLabels\"]/a[4]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"poiSort\"]/a[1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"poiLists\"]/li[1]/div/h3/a")).click();
    	Thread.sleep(2000);
    	
    	switchWindow("ţ��ɽ�Ļ����������ι���_ţ��ɽ�Ļ���������ַ_ţ��ɽ�Ļ���������Ʊ�۸�Ԥ�� - ������", driver);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/input")).click();
    	Thread.sleep(20000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/input")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[4]/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/span[3]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[4]/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/textarea")).sendKeys("Web Test!");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[4]/div/div[1]/div[1]/div[2]/div/div/div/div/div[3]/input[1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/header/div/div[1]/div/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/section/div/div[1]/div[2]/span")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/section/div/div[1]/div[3]/span")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[4]/div/h2/a/span")).click();
    	Thread.sleep(2000);
    	
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
