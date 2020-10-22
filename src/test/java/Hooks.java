import functionLibrary.CommonFunction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks

{
    CommonFunction commonfunction=new CommonFunction();

    @Before

    public void beforeTest()
    {
    commonfunction.openBrowser();
    }

    @After

    public void afterTest()
    {
        commonfunction.closeBrowser();
    }
}
