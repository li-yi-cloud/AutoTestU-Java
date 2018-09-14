package helper;

import java.util.ArrayList;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public interface Element{
    ArrayList<String> selector();
    Element setConfig(Integer searchtimes,Integer spacingtime);
    WebElement getAppiumElement();
    Boolean click();
    String getText();
    Boolean isFound();
    String name();
    Point location();
    Dimension size();
    Boolean inputText(String text);
}
