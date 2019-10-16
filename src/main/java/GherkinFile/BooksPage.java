package GherkinFile;

import org.openqa.selenium.By;

public class BooksPage extends Utils {
    private By _prideAndPrejudiceAddToCartButtonLink = (By.xpath("//input[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/39/1/1\"),!1']"));
    private By _checkinShoppingCartLink = (By.linkText("Shopping cart"));
    public void userIsOnBooksPage(){

        assertURL("books");
    }
    public void clickOnprideAndPrejudiceAddToCartButton(){

        clickElement(_prideAndPrejudiceAddToCartButtonLink);
    }
    public void clickShoppingCartButton(){
        clickElement(_checkinShoppingCartLink);
    }

}
