package GherkinFile;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CheckOutShippingAddressPage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _selectCountryLink = (By.xpath("//select[@data-trigger=\"country-select\"]"));
    private By _selectStateLink = (By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]"));
    private By _cityNameLink =(By.xpath("//input[@data-val-required=\"City is required\"]"));
    private By _address1Link =(By.xpath("//input[@data-val-required=\"Street address is required\"]"));
    private By _postalCodeLink = (By.xpath("//input[@data-val-required=\"Zip / postal code is required\"]"));
    private By _phoneNumberLink = (By.id("BillingNewAddress_PhoneNumber"));
    private By _continueShippingAddressClickLink = (By.xpath("//input[@onclick=\"Billing.save()\"]"));
    private By _continueShippingMethodClickLink = (By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]"));
    private By _creditCardClickLink = (By.xpath("//input[@id=\"paymentmethod_1\"]"));
    private By _continueOnPaymentMethodLink = (By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]"));
    private By _selectCardTypeLink = By.xpath("//select[@id=\"CreditCardType\"]");
    private By _cardHolderNameLink = By.xpath("//input[@data-val-required=\"Enter cardholder name\"]");
    private By _cardNumberLink = By.xpath("//input[@id=\"CardNumber\"]");
    private By _expiryDateLink = By.xpath("//select[@data-val-required=\"Expire month is required\"]");
    private By _expiryYearLink = By.xpath("//select[@data-val-required=\"Expire year is required\"]");
    private By _cardCordLink = By.xpath("//input[@style=\"width:60px;\"]");
    private By _continuePaymentDetailsLink = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _checkOutConfirmLink = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");

    public void checkOutAssertion(){

        assertURL("onepagecheckout");
    }

    public void checkOutShippingAddressDetails(){

        //select country
        selectByValue(_selectCountryLink,loadProps.getProperty("Country"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //select state
        selectByValue(_selectStateLink,loadProps.getProperty("State"));

        //enter cityname
        enterText(_cityNameLink,loadProps.getProperty("Cityname"));

        //enter address
        enterText(_address1Link,loadProps.getProperty("Address"));

        //enter postcode
        enterText(_postalCodeLink,loadProps.getProperty("Postcode"));

        //enter phonenumber
        enterText(_phoneNumberLink,loadProps.getProperty("Phonenumber"));

        //click on continue
        clickElement(_continueShippingAddressClickLink);

    }
    public void clickContinueOnShippingMethod(){
        clickElement(_continueShippingMethodClickLink);
    }

    public void clickOnCreditCard(){
        clickElement(_creditCardClickLink);

        clickElement(_continueOnPaymentMethodLink);
    }
    public void paymentInformationDetails(){

        //select creditcard type
        selectByVisibleText(_selectCardTypeLink,loadProps.getProperty("Creditcard"));

        //enter card holders name
        enterText(_cardHolderNameLink,loadProps.getProperty("CardHolderName"));

        //enter card number
        enterText(_cardNumberLink,loadProps.getProperty("CardNumber"));

        //select month
        selectByVisibleText(_expiryDateLink,loadProps.getProperty("Expirymonth"));

        //select year
        selectByVisibleText(_expiryYearLink,loadProps.getProperty("Expiryyear"));

        //enter security code
        enterText(_cardCordLink,loadProps.getProperty("Cardcode"));

        //click on continue
        clickElement(_continuePaymentDetailsLink);
    }
    public void clickOnCheckOutConfirmation(){
        clickElement(_checkOutConfirmLink);
    }



}
