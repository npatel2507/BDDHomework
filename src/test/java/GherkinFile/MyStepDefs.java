package GherkinFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    UnRegisteredEmailAFriendPage unRegisteredEmailAFriendPage = new UnRegisteredEmailAFriendPage();
    BooksPage booksPage = new BooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutShippingAddressPage checkOutShippingAddressPage = new CheckOutShippingAddressPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();

// 1.User should be able to register successfully

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        homepage.clickOnNoppCommereceLogo();
        }

    @When("^user enters all required details$")
    public void user_enters_all_required_details()  {
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        }

    @Then("^user should be able to register successfully$")
    public void user_should_be_able_to_register_successfully() {
        registrationResultPage.userIsSuccessfullyRegistered();
       }

       // 2.Register User Should be able to refer product to friend

    @When("^user enters all compulsory details$")
    public void user_enters_all_compulsory_details()  {
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        }

    @When("^user should get message registered successfully$")
    public void user_should_get_message_registered_successfully() {
        registrationResultPage.userIsSuccessfullyRegistered();
       }

       @When("^click on noppcommerecelogo$")
    public void click_on_noppcommerecelogo()  {
        homepage.clickOnNoppCommereceLogo();

        }

    @When("^click on applemacbook product$")
    public void click_on_applemacbook_product() {
         homepage.clickOnAppleMacBookProduct();
       }

    @When("^click on emailfriend$")
    public void click_on_emailfriend()  {
        appleMacBookPage.clickOnEmailFriend();
       }

    @When("^enter all details to email friend$")
    public void enter_all_details_to_email_friend() {

        emailAFriendPage.allDetailstoEmailAFriend();
        }

    @Then("^user is able to refer product to friend$")
    public void user_is_able_to_refer_product_to_friend() {
        emailAFriendResultPage.userIsAbleToReferAProductToFriend();
        }

        // 3.Unregisterd User should Not Able To Refer Product To A Friend

    @When("^user select the product$")
    public void user_select_the_product()  {
        homepage.clickOnAppleMacBookProduct();
        }
    @When("^click on emailafriend$")
    public void click_on_emailafriend()  {
        appleMacBookPage.clickOnEmailFriend();
        }

    @When("^enter all details to email a friend$")
    public void enter_all_details_to_email_a_friend() {
        unRegisteredEmailAFriendPage.allDetailsToEmailFriendForUnregistered();
        }

        @Then("^user should get error message$")
    public void user_should_get_error_message()  {
        unRegisteredEmailAFriendPage.referAProductToFriendFails();
        }


        //4.Registered User should Be Able To Buy Product Successfully

    @When("^user enter all compulsory details for registration$")
    public void user_enter_all_compulsory_details_for_registration() {
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        }

    @When("^user should get message about registered successfully$")
    public void user_should_get_message_about_registered_successfully()  {
        registrationResultPage.userIsSuccessfullyRegistered();
        }

    @When("^clicks on noppcommerecelogo$")
    public void clicks_on_noppcommerecelogo() {
        homepage.clickOnNoppCommereceLogo();
        }

    @When("^selects the product$")
    public void selects_the_product()  {
        homepage.clickOnBooks();
        booksPage.userIsOnBooksPage();
        booksPage.clickOnprideAndPrejudiceAddToCartButton();
        }

    @When("^click on add to card button$")
    public void click_on_add_to_card_button()  {
        booksPage.clickShoppingCartButton();
        shoppingCartPage.checkOnTheShoppingCartPage();
        shoppingCartPage.clickOnCheckoutButton();
        checkOutShippingAddressPage.checkOutAssertion();

    }

    @When("^enter all details of shipping address$")
    public void enter_all_details_of_shipping_address() {
        checkOutShippingAddressPage.checkOutShippingAddressDetails();
    }

    @When("^enter continue on shipping method$")
    public void enter_continue_on_shipping_method()  {
        checkOutShippingAddressPage.clickContinueOnShippingMethod();

    }

    @When("^click on credit card$")
    public void click_on_credit_card()  {
        checkOutShippingAddressPage.clickOnCreditCard();
    }

    @When("^enter all payment information details$")
    public void enter_all_payment_information_details() {
        checkOutShippingAddressPage.paymentInformationDetails();
        }

    @When("^click on checkout confirmation$")
    public void click_on_checkout_confirmation() {
        checkOutShippingAddressPage.clickOnCheckOutConfirmation();
        }

    @Then("^user should see the order has been placed successfully$")
    public void user_should_see_the_order_has_been_placed_successfully()  {
        checkOutPage.orderHasBeenPlacedSuccessfully();
        }

//5.Guest User Should Be Able To Checkout As Guest Successfully


    @When("^user click on books$")
    public void user_click_on_books()  {
        homepage.clickOnBooks();
        }

        @When("^user clicks on add to card button$")
    public void user_clicks_on_add_to_card_button()  {
        booksPage.clickOnprideAndPrejudiceAddToCartButton();
    }

    @When("^click on shopping cart button$")
    public void click_on_shopping_cart_button() {
        booksPage.clickShoppingCartButton();
        shoppingCartPage.checkOnTheShoppingCartPage();
    }

    @When("^click on checkout$")
    public void click_on_checkout()  {
        shoppingCartPage.clickOnCheckoutButton();
    }

    @When("^click on checkout as guest$")
    public void click_on_checkout_as_guest()  {
        checkOutAsGuestPage.guestCheckoutPageAssertion();
        checkOutAsGuestPage.clickOnCheckOutAsAGuest();
        checkOutShippingAddressPage.checkOutAssertion();
    }

    @When("^enter personal details$")
    public void enter_personal_details() {
        checkOutAsGuestPage.checkOutPersonalDetail();
    }

    @When("^enter details of shipping address$")
    public void enter_details_of_shipping_address() {
        checkOutShippingAddressPage.checkOutShippingAddressDetails();

    }
    @When("^click continue on shipping method$")
    public void click_continue_on_shipping_method()
    {
        checkOutShippingAddressPage.clickContinueOnShippingMethod();
    }

    @When("^click on credit card and continue$")
    public void click_on_credit_card_and_continue()
    {
        checkOutShippingAddressPage.clickOnCreditCard();
    }

    @When("^enter details of  payment information$")
    public void enter_details_of_payment_information()
    {
        checkOutShippingAddressPage.paymentInformationDetails();
    }

    @When("^clicks on checkout confirmation$")
    public void clicks_on_checkout_confirmation() {

        checkOutShippingAddressPage.clickOnCheckOutConfirmation();
    }

    @Then("^user should see the message order has been placed successfully$")
    public void user_should_see_the_message_order_has_been_placed_successfully()  {
        checkOutPage.orderHasBeenPlacedSuccessfully();
    }


}
