/*
author: cloud
time: 2018.09.06
 */
import cases.LiveChatSign;
import helper.Element;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import helper.LiveChatElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    public static Logger logger = LoggerFactory.getLogger(MainClass.class);
    public static LiveChatElement element = new LiveChatElement();
    public static LiveChatSign sign;
    public static void main(String arg[]){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","af7996a2");
        capabilities.setCapability("udid","af7996a2");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage","com.rcplatform.livechat");
        capabilities.setCapability("appActivity","com.rcplatform.livechat.ui.MainActivity");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("automationName","uiautomator2");

        try {
            URL server_url = new URL("http://127.0.0.1:4723/wd/hub");
            AppiumDriver driver = new AppiumDriver(server_url, capabilities);
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
             sign = new LiveChatSign(driver);
            Thread.sleep(3000);
            sign.loginWithEmail(new HashMap());
            Element ele2 = element.new MessageHomeElement(driver);
            logger.info("=============");
            logger.info("element is found: "+ele2.isFound());
            logger.info("click element result: "+ele2.click());
            logger.error("ppppp");
            ele2.click();

            Thread.sleep(3000);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
