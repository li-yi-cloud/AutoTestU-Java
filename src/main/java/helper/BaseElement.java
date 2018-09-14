package helper;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseElement implements Element{
    public static Logger logger = LoggerFactory.getLogger(BaseElement.class);
    protected AppiumDriver driver = null;
    private WebElement element = null;
    protected Integer searchtimes = 3;
    protected Integer spacingtime = 200;

    public BaseElement(AppiumDriver driver,Integer searchtimes,Integer spacingtime){
        this.driver = driver;
        this.searchtimes = searchtimes;
        this.spacingtime = spacingtime;
    }
    public BaseElement(AppiumDriver driver){
        this.driver = driver;
    }
    public BaseElement(AppiumDriver driver,Integer searchtimes){
        this.driver = driver;
        this.searchtimes = searchtimes;
    }

    public Element setConfig(Integer searchtimes,Integer spacingtime){
        this.searchtimes = searchtimes;
        this.spacingtime = spacingtime;
        return  this;
    }

    public WebElement getAppiumElement(){
        if (this.isFound()){
            try {
                if (this.element == null) {
                    ArrayList<String> sele = this.selector();
                    this.element = this.driver.findElement(sele.get(0), sele.get(1));
                }
                return  this.element;
            }catch (Exception e){
                logger.error("find element error. reason: "+e.getStackTrace());
                return null;
            }
        }else {
            return this.element;
        }
    }
    // must implement this function in child class.
    public abstract ArrayList<String> selector();

    public Boolean isFound() {
        if (this.element != null){
            return true;
        }else{
            return this.verifyElement();
        }
    }
    private Boolean verifyElement(){
        logger.info("start find element: "+ this.name());
        Boolean ret = false;
        for (int i=0;i<this.searchtimes;i+=1){
           ret = this.searchElement(i == this.searchtimes-1);
           if (ret == true){
               break;
           }else {
               try {
                   Thread.sleep(this.spacingtime);
               }catch (InterruptedException e){
                   logger.info("Interrupted: "+e.getStackTrace());
               }
           }
        }
        return  ret;
    }
    private Boolean searchElement(Boolean islog){
        ArrayList<String> sele = this.selector();
        try{
            this.element = this.driver.findElement(sele.get(0),sele.get(1));
            return true;
        }catch (Exception e){
            if (islog) {
                logger.warn("element: \""+this.name()+"\" is not found. reason: "+ e.toString());
//                e.printStackTrace();
            }
            return false;
        }
    }
    public String getText(){
        if (this.getAppiumElement() != null){
            try {
                return  this.getAppiumElement().getText();
            }catch (Exception e){
                logger.error("get element: "+this.name()+" size fail.");
                return null;
            }
        }else {
            return null;
        }
    }
    public Boolean click() {
        if (this.isFound()){
            try {
                this.getAppiumElement().click();
                return true;
            }catch (Exception e){
                logger.error("click element: "+ this.name() + " fail.");
                return false;
            }
        }else {
            return false;
        }
    }
    public String name(){
        String[] namelist = this.getClass().getName().split("\\$",2);
//        String[] namelist = StringUtils.split(this.getClass().getName(),"$",2);
        return namelist[namelist.length-1];
    }

    public Point location(){
        if (this.isFound()){
            try {
                return this.getAppiumElement().getLocation();
            }catch (Exception e){
                logger.error("get element: "+this.name()+" location fail.");
                return null;
            }
        }else {
            return null;
        }
    }
    public Dimension size(){
        if (this.isFound()){
            try {
                return this.getAppiumElement().getSize();
            }catch (Exception e){
                logger.error("get element: "+this.name()+" size fail.");
                return null;
            }
        }else {
            return null;
        }
    }
    public Boolean inputText(String text){
        if (this.isFound()){
            try {
                this.getAppiumElement().clear();
                this.getAppiumElement().sendKeys(text);
                return true;
            }catch (Exception e){
                logger.error("get element: "+this.name()+" size fail.");
                return false;
            }
        }else {
            return  false;
        }
    }
}
