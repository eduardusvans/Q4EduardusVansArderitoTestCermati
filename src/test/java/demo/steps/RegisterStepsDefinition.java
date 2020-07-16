package demo.steps;

import demo.pages.RegisterCermatiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepsDefinition {

    RegisterCermatiPage registerCermatiPage = new RegisterCermatiPage();

    @Given("User is on Register page")
    public void userIsOnRegisterPage() {
        registerCermatiPage.openRegisterPage();
        registerCermatiPage.isOnRegisterPage();
    }

    @When("User input {string} on E-mail input text field on Register page")
    public void userInputOnEMailInputTextFieldOnRegisterPage(String email) {
        registerCermatiPage.inputEmail(email);
    }

    @When("User input {string} on Password input text field on Register page")
    public void userInputOnPasswordInputTextFieldOnRegisterPage(String password) {
        registerCermatiPage.inputPassword(password);
    }

    @When("User input {string} on Confirm Password input text field on Register page")
    public void userInputOnConfirmPasswordInputTextFieldOnRegisterPage(String confirmPassword) {
        registerCermatiPage.inputConfirmPassword(confirmPassword);
    }

    @When("User input {string} on First Name input text field on Register page")
    public void userInputOnFirstNameInputTextFieldOnRegisterPage(String firstName) {
        registerCermatiPage.inputFirstName(firstName);
    }

    @When("User input {string} on Last Name input text field on Register page")
    public void userInputOnLastNameInputTextFieldOnRegisterPage(String lastName) {
        registerCermatiPage.inputLastName(lastName);
    }

    @When("User input {string} on Phone Number input text field on Register page")
    public void userInputOnPhoneNumberInputTextFieldOnRegisterPage(String phoneNumber) {
        registerCermatiPage.inputPhoneNumber(phoneNumber);
    }

    @When("User input {string} on Residence City input text field on Register page")
    public void userInputOnResidenceCityInputTextFieldOnRegisterPage(String residenceCity) {
        registerCermatiPage.inputResidenceCity(residenceCity);
    }

    @When("User tap register button")
    public void userTapRegisterButton() {
        registerCermatiPage.tapRegisterButton();
    }

    @Then("User is on Cermati Home Page")
    public void userIsOnCermatiHomePage() {
        registerCermatiPage.isOnHomePage();
    }
}
