package helper;

import io.appium.java_client.AppiumDriver;
import java.util.ArrayList;

public class LiveChatElement{
    /*
    Login page elements
    */
    public class LoginWithPhoneButton extends BaseElement {
        public LoginWithPhoneButton(AppiumDriver driver) {
            super(driver);
        }

        public LoginWithPhoneButton(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public LoginWithPhoneButton(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/btn_signin_phone");
            return sele;
        }
    }

    public class SignWithEmailButton extends BaseElement {
        public SignWithEmailButton(AppiumDriver driver) {
            super(driver);
        }

        public SignWithEmailButton(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public SignWithEmailButton(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/btn_signup");
            return sele;
        }
    }
    public class SignMoreOptionButton extends BaseElement {
        public SignMoreOptionButton(AppiumDriver driver) {
            super(driver);
        }

        public SignMoreOptionButton(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public SignMoreOptionButton(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/tv_account_more_option");
            return sele;
        }
    }
    public class LoginWithEmailButton extends BaseElement {
        public LoginWithEmailButton(AppiumDriver driver) {
            super(driver);
        }

        public LoginWithEmailButton(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public LoginWithEmailButton(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/btn_signin");
            return sele;
        }
    }

    public class LoginEmailInput extends BaseElement {
        public LoginEmailInput(AppiumDriver driver) {
            super(driver);
        }

        public LoginEmailInput(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public LoginEmailInput(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/et_email");
            return sele;
        }
    }
    public class LoginPasswordInput extends BaseElement {
        public LoginPasswordInput(AppiumDriver driver) {
            super(driver);
        }

        public LoginPasswordInput(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public LoginPasswordInput(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/et_password");
            return sele;
        }
    }
    public class LoginWithEmailConfirm extends BaseElement {
        public LoginWithEmailConfirm(AppiumDriver driver) {
            super(driver);
        }

        public LoginWithEmailConfirm(AppiumDriver driver, Integer searchtimes) {
            super(driver, searchtimes);
        }

        public LoginWithEmailConfirm(AppiumDriver driver, Integer searchtimes, Integer spacingtime) {
            super(driver, searchtimes, spacingtime);
        }

        @Override
        public ArrayList<String> selector() {
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/btn_signin");
            return sele;
        }
    }
    /*
    Home page elements
     */
    public class MatchHomeElement extends BaseElement{
        public MatchHomeElement(AppiumDriver driver){
            super(driver);
        }
        public MatchHomeElement(AppiumDriver driver,Integer searchtimes){
            super(driver,searchtimes);
        }
        public MatchHomeElement(AppiumDriver driver,Integer searchtimes,Integer spacingtime){
            super(driver,searchtimes,spacingtime);
        }
        @Override
        public ArrayList<String> selector(){
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/rb_explore");
            return sele;
        }
    }
    public class MessageHomeElement extends BaseElement{
        public MessageHomeElement(AppiumDriver driver){
            super(driver);
        }
        public MessageHomeElement(AppiumDriver driver,Integer searchtimes){
            super(driver,searchtimes);
        }
        public MessageHomeElement(AppiumDriver driver,Integer searchtimes,Integer spacingtime){
            super(driver,searchtimes,spacingtime);
        }
        @Override
        public ArrayList<String> selector(){
            ArrayList<String> sele = new ArrayList<>(2);
            sele.add(By.ID);
            sele.add("com.rcplatform.livechat:id/rb_message");
            return sele;
        }
    }
}
