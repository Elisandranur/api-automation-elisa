package starter.user;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.stepsdefinition.GetSteps;

public class GetAll {
    @Steps
    GetSteps getAll;

    @Given("set the GET ALL user data endpoint")
    public void setGETALLEndpoint(){
        getAll.setApiGETALLEndpoint();
    }
    @When("send the HTTP Request GET ALL user")
    public void sendRequestOfGETALL(){
        getAll.sendRequstGETALLHttp();
    }
    @Then("i got verify code 200")
    public void verifiedCode200GETALL(){
        getAll.getResponseCodeGETALL();
    }
    @And("I try to check content of get all by id 1")
    public void checkContentGETALL(){
        getAll.verifyContentGETALL();
    }
}
