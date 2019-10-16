package GherkinFile;

import org.openqa.selenium.By;

public class CheckOutAsGuestPage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _enterFirstNameLink = (By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]"));
    private By _enterLastNameLink = (By.xpath("//input[@id=\"BillingNewAddress_LastName\"]"));
    private By _enterEmailLink = (By.xpath("//input[@id=\"BillingNewAddress_Email\"]"));
    private By _checkOutAsGuestLink = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");

    public void guestCheckoutPageAssertion(){
        assertURL("checkoutasguest");

    }
    public void clickOnCheckOutAsAGuest(){

        clickElement(_checkOutAsGuestLink);}

    public void checkOutPersonalDetail(){
        enterText(_enterFirstNameLink,loadProps.getProperty("Firstname"));

        enterText(_enterLastNameLink,loadProps.getProperty("Lastname"));

        enterText(_enterEmailLink,loadProps.getProperty("Email"));


    }

}
