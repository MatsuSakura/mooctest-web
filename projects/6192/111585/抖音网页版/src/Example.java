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
    	driver.get("https://www.douyin.com/");
    	Thread.sleep(8000);
    	//Thread.sleep(200000);
    	driver.findElement(By.xpath("//*[@id=\"login-guide\"]/i")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div[1]")).click();
    	Thread.sleep(1000);
    	//�������Ļ������ͣ
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/div")).click();
    	Thread.sleep(1000);
    	//ѡ���Զ�����ģʽ
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[8]/div/div/button")).click();
    	Thread.sleep(2000);
    	//�ر�����
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[3]")).click();
    	Thread.sleep(1000);
    	//����
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[2]/div[2]/div")).click();
    	Thread.sleep(9000);
    	//��Ԥ�����ʱ�䣬�ֶ���¼��������ʹ��ɨ����ʽ�������ݣ�
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[2]/div[3]")).click();
    	Thread.sleep(8000);
    	//�������
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/div/span[2]")).click();
    	Thread.sleep(1000);
    	//��ӱ���[����] 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[3]/div[1]/div/span[17]")).click();
    	Thread.sleep(1000);
    	//����ı������ʡ�
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/span")).sendKeys("����");
    	Thread.sleep(1000);
    	// ������� 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/div/span[3]")).click();
    	Thread.sleep(1000);
    	// �����һ�� 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/div/div/div[2]")).click();
    	Thread.sleep(1000);
    	//�����˵��°벿�ֵ����пؼ����е����������ֱ���µ����пؼ���
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[7]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[9]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[10]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[11]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[12]/a")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[13]/a")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[13]/a/div[1]/svg")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[14]/a/div[1]/svg")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[15]/a/div[1]/svg")).click();
    	//�����ҳ 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[1]/a/div[1]/svg")).click();
    	Thread.sleep(1000);
    	//��������һ����Ƶ
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/div/a[1]/div/div[2]")).click();
    	Thread.sleep(1000);
    	//�������Ļ�޸���Ƶ״̬��������Ϊ����״̬��ת��Ϊ��ͣ״̬��������Ϊ��ͣ״̬��ת��Ϊ����״̬��
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/xg-start/xg-start-inner/svg[1]")).click();
    	Thread.sleep(1000);
    	// �޸��Զ�����״̬ 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[7]/div/div/button")).click();
    	Thread.sleep(1000);
    	//���ͷ�� 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/a/div/img")).click();
    	Thread.sleep(1000);
    	//�����ע
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
    	Thread.sleep(1000);
    	//�������ͼ��
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]")).click();
    	Thread.sleep(1000);
    	//���ı��������롰���ӡ�
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[1]/div/div[2]/div/form/input[1]")).sendKeys("����");
    	Thread.sleep(1000);
    	//�������
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[1]/div/div[2]/div/button")).click();
    	Thread.sleep(1000);
    	//ɸѡ�����·���������һ���ڡ�
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div/div[2]/span[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div/div[3]/span[3]")).click();
    	Thread.sleep(1000);
    	//�����������Ƶ���ı�������Ƶ����ҳ
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/ul/li[3]/div/a[2]/p/span/span/span/span/span")).click();
    	Thread.sleep(1000);
    	// �����ת���Ҳ�ڶ�����Ƶ 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[3]/ul/li[2]/div/div[1]/a/div[1]/div[3]")).click();
    	Thread.sleep(1000);
    	// �������
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]")).click();
    	Thread.sleep(1000);
    	//�����ע
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]/a/div[2]/svg")).click();
    	Thread.sleep(1000);
    	//���ͷ��鿴������Ƶ
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[2]/div[1]/a/div/img")).click();
    	Thread.sleep(1000);
    	//����������� 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[1]/a/div[1]")).click();
    	Thread.sleep(1000);
    	// ������ҳ�е��ȡ����ע
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
    	Thread.sleep(1000);
    
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
