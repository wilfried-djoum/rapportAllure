package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObjects.HomePage;

public class HomeStep {

    private HomePage homePage = new HomePage();

    @Given("user in the home page")
    public void userInTheHomePage() {
        homePage.navigateToHomePage();
    }

    @When("user click avatar in navbar")
    public void userlickAvatar(){

    }

    @Then("modal is open")
    public void modalIsOpen(){

    }

}
