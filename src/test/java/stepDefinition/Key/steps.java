package stepDefinition.Key;

import functionLibrary.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.KeyPage;

public class steps extends CommonFunction {

KeyPage keypage = new KeyPage(driver);

    @Given(": I am on homepage")
    public void i_am_on_homepage()

    {
        driver.get("http://the-internet.herokuapp.com/");
    }

    @When(": Click keypresses")
    public void click_keypresses()
    {

        keypage.keypresses();
        wait(120);
    }
    /*@When(": Enter space")
    public void enter_space()

    {
        
    }
    @Then(": User able to see {string}")
    public void user_able_to_see(String string)

    {
        
    }*/

}


