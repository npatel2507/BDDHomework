package GherkinFile;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {
    private By _termsAndConditionLink = (By.xpath("//input[@id=\"termsofservice\"]"));
    private By _checkoutLink = (By.xpath("//button[@type=\"submit\"]"));

    public void checkOnTheShoppingCartPage(){
        assertURL("cart");
    }
    public void clickOnCheckoutButton(){
        clickElement(_termsAndConditionLink);

        clickElement(_checkoutLink);
    }
}
