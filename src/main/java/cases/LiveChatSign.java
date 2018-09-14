package cases;

import helper.ActionResult;
import helper.Element;
import helper.LiveChatElement;
import io.appium.java_client.AppiumDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class LiveChatSign {
    public static Logger logger = LoggerFactory.getLogger(LiveChatSign.class);
    public static AppiumDriver driver;
    public static LiveChatElement element = new LiveChatElement();

    public LiveChatSign(AppiumDriver driver){
        this.driver = driver;
    }
    public void loginWithEmail(Map config){
        Element more = element.new SignMoreOptionButton(driver);
        more.click();
        Element login_email = element.new LoginWithEmailButton(driver);
        login_email.click();
        Element login_email_input = element.new LoginEmailInput(driver);
        login_email_input.inputText("zz054@163.com");
        Element login_email_password = element.new LoginPasswordInput(driver);
        login_email_password.inputText("111111");
        Element login_confirm = element.new LoginWithEmailConfirm(driver);
        login_confirm.click();

        Element ele = element.new MatchHomeElement(driver);

        ActionResult.actionResult(ele.isFound(),"login email");
    }
}
