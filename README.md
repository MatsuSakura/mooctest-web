---
链接：https://pan.baidu.com/s/1zFRXAIKUIW_eoVrNlRl1Cw?pwd=xyfy 
提取码：xyfy
Github：https://github.com/MatsuSakura/mooctest-web
---

## 全国大学生软件测试大赛（慕测）参赛指南

#### 1.写在开头

很早就从本校老师那边听说了软件测试大赛的名字，很多人参赛，但是真正参加比赛的应该比较少。我认为主要还是软件适配的问题，chrome的版本一直在更新，想要找到一个好的driver版本比较难。所以一定要选择一个比较稳定的版本，最好是关闭chrome的自动更新

#### 2.功能测试

功能测试使用的是安装了mooctest插件的版本，我把我使用的chrome和driver版本上传了网盘，后续也会附上练习题以及比赛题的源文件，如有需要可以查看。

首先慕测是不能使用Action和JS代码的，只能使用xpath等定位，然后使用click和sendkey操作方法。主要是页面切换和iframe的切换操作，这些都是必考的操作，我把一个详细简介网站发出来

[selenium 使用教程详解-java版本 - 小葛师兄 - 博客园 (cnblogs.com)](https://www.cnblogs.com/tester-ggf/p/12602211.html)

主要是切换句柄，在打开新页面的时候会用到

    public static void switchWindow(String title,WebDriver driver){ 
    Set<String> handles = driver.getWindowHandles();
     // 切换窗口的方式--循环遍历handles集合
     for (String handle : handles) {
       //判断是哪一个页面的句柄--根据title来进行判断
       if(driver.getTitle().equals(title)){
       break;
     }else{
       //切换窗口--根据窗口标识来切换
       driver.switchTo().window(handle);
       }
      } 
     }
     //test方法中调用切换句柄
     switchWindow("xxx",driver);
还有就是sleep的时间，一定要设置合理

#### 3.性能测试

性能测试是使用jmeter2.11进行，不是最新版的jmeter，使用badboy来进行脚本录制

badboy是使用IE内核进行访问录制的一款软件，很久之前就已经停止维护了。所以一定要学会手搓脚本，其中今年预选赛的ikea宜家就是这样的一个例子，具体的代码已经放在github上，到时欢迎下载进行学习

性能测试一般是比较简单的，基本上都能拿到80分以上，如果没有拿到这个分数的话，一定要学习一下

[web应用测试、移动测试赛前培训_ 哔哩哔哩_ bilibili](https://www.bilibili.com/video/BV1rK4y1h7CR/?spm_id_from=333.999.0.0)

很模块化的一个，主要还是看功能测试

#### 4.学习方法

功能测试和性能测试在大四的自动化测试中都有涉猎，但是我今年学习的是通过python版本来进行。

如果是使用python进行的话，我个人推荐的还是Edge来进行测试，Edge的版本比较稳定

[Microsoft Edge WebDriver - Microsoft Edge Developer](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)

本次预选赛我是拿了双百进入的省赛，省赛功能测试95.45分，性能测试80（参数化设置问题，修了很久不行还是放弃了）

我个人的selenium使用也比较匮乏，还是得继续学习。

刚比赛完有感而发，感谢各位看到这里，谢谢
