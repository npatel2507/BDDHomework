package GherkinFile;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils {
    private By _orderConfirmLink = By.linkText("Your order has been successfully processed!");

    public void orderHasBeenPlacedSuccessfully() {

        assertURL("checkout");

    }
}
