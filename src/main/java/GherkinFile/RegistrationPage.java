package GherkinFile;

import org.openqa.selenium.By;

public class RegistrationPage extends HomePage {
    LoadProps loadProps = new LoadProps();

    private By _firstName = (By.id("FirstName"));
    private By _lastName = (By.xpath("//input[@name= 'LastName']"));
    private By _dateOfBirth = (By.xpath("//select[@name=\"DateOfBirthDay\"]"));
    private By _monthOfBirth = (By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
    private By _yearOfBirth = (By.xpath("//select[@name=\"DateOfBirthYear\"]"));
    private By _email = (By.name("Email"));
    private By _password = (By.xpath("//input[@type=\"password\" and @id=\"Password\"]"));
    private By _confirmPassword = (By.name("ConfirmPassword"));
    private By _registerButton = (By.xpath("//input[@class=\"button-1 register-next-step-button\"]"));


    public void verifyUserIsOnRegisterPage(){
        assertURL("register");
    }
    public void userEntersRegistrationDetails(){

        //enter first name
        enterText(_firstName,loadProps.getProperty("Firstname"));

        //enter last name
        enterText(_lastName,loadProps.getProperty("Lastname"));

        //select date
        selectByValue(_dateOfBirth,loadProps.getProperty("Date"));

        //select month
        selectByValue(_monthOfBirth,loadProps.getProperty("Month"));

        //select year
        selectByValue(_yearOfBirth,loadProps.getProperty("Year"));

        //enter email
        enterText(_email,"test" + randomDate() + "@gmail.com");

        //enter password
        enterText(_password,loadProps.getProperty("Password"));

        //enter confirm password
        enterText(_confirmPassword,loadProps.getProperty("ConfirmPassword"));

        //click on register button
        clickElement(_registerButton);
    }
}
