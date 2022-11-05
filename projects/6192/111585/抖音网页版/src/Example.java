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
    	//点击主屏幕进行暂停
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/div")).click();
    	Thread.sleep(1000);
    	//选择自动播放模式
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[8]/div/div/button")).click();
    	Thread.sleep(2000);
    	//关闭声音
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[3]")).click();
    	Thread.sleep(1000);
    	//点赞
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[2]/div[2]/div")).click();
    	Thread.sleep(9000);
    	//请预留充分时间，手动登录。（建议使用扫码形式，方便快捷）
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[2]/div[3]")).click();
    	Thread.sleep(8000);
    	//点击评论
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/div/span[2]")).click();
    	Thread.sleep(1000);
    	//添加表情[呲牙] 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[3]/div[1]/div/span[17]")).click();
    	Thread.sleep(1000);
    	//添加文本“精彩”
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/span")).sendKeys("精彩");
    	Thread.sleep(1000);
    	// 点击发送 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/div/span[3]")).click();
    	Thread.sleep(1000);
    	// 点击下一个 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/div/div/div[2]")).click();
    	Thread.sleep(1000);
    	//对左侧菜单下半部分的所有控件进行点击操作（即直播下的所有控件）
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[7]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[9]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[10]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[11]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[12]/a")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[13]/a")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[13]/a/div[1]/svg")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[14]/a/div[1]/svg")).click();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[15]/a/div[1]/svg")).click();
    	//点击首页 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[1]/a/div[1]/svg")).click();
    	Thread.sleep(1000);
    	//点击进入第一个视频
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/div/a[1]/div/div[2]")).click();
    	Thread.sleep(1000);
    	//点击主屏幕修改视频状态（若开启为播放状态则转变为暂停状态；若开启为暂停状态则转变为播放状态）
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/xg-start/xg-start-inner/svg[1]")).click();
    	Thread.sleep(1000);
    	// 修改自动播放状态 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[7]/div/div/button")).click();
    	Thread.sleep(1000);
    	//点击头像 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/a/div/img")).click();
    	Thread.sleep(1000);
    	//点击关注
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
    	Thread.sleep(1000);
    	//点击抖音图标
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]")).click();
    	Thread.sleep(1000);
    	//在文本框中输入“央视”
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[1]/div/div[2]/div/form/input[1]")).sendKeys("央视");
    	Thread.sleep(1000);
    	//点击搜索
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[1]/div/div[2]/div/button")).click();
    	Thread.sleep(1000);
    	//筛选“最新发布”、“一周内”
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div/div[2]/span[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div/div[3]/span[3]")).click();
    	Thread.sleep(1000);
    	//点击第三个视频的文本进入视频详情页
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/ul/li[3]/div/a[2]/p/span/span/span/span/span")).click();
    	Thread.sleep(1000);
    	// 点击跳转到右侧第二个视频 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[3]/ul/li[2]/div/div[1]/a/div[1]/div[3]")).click();
    	Thread.sleep(1000);
    	// 点击抖音
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]")).click();
    	Thread.sleep(1000);
    	//点击关注
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]/a/div[2]/svg")).click();
    	Thread.sleep(1000);
    	//点击头像查看作者视频
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div[2]/div[1]/a/div/img")).click();
    	Thread.sleep(1000);
    	//点击进入详情 
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[1]/a/div[1]")).click();
    	Thread.sleep(1000);
    	// 在详情页中点击取消关注
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
