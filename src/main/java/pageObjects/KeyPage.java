package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPage {

    public KeyPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);


    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[31]/a")
    WebElement keypressesClk;

    /*@FindBy(id="//*[@id=\"content\"]/ul/li[31]/a")
    WebElement*/

    public void keypresses()
    {
keypressesClk.click();
    }
}
