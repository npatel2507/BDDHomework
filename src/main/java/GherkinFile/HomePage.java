package GherkinFile;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProps loadProps = new LoadProps();
    BrowserSelector browserSelector = new BrowserSelector();

    private By _registerLink = By.xpath("//a[@class='ico-register']");
    private By _computerLink = By.linkText("Computers");
    private By _electronicsLink = By.linkText("Electronics ");
    private By _apparelLink = By.linkText("Apparel ");
    private By _digitalDownloadLink = By.linkText("Digital downloads ");
    private By _booksLink = By.linkText("Books");
    private By _jewelryLink = By.linkText("Jewelry ");
    private By _giftCardsLink = By.linkText("Gift Cards ");
    private By _loginLink = By.xpath("//a[@class=\"ico-login\"]");
    private By _wishlistLink = By.xpath("class=\"wishlist-label\"");
    private By _shoppingCartLink = By.xpath("//span[@class=\"cart-label\"]");
    private By _appleMacBookProductLink = (By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]"));
    private By _buildYourOwnComputerProductLink = (By.linkText("Build your own computer"));
    private By _htcOneM8AndroidL5LollipopProductLink =(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
    private By _virtualGiftCardProductLink = (By.linkText("$25 Virtual Gift Card"));
    private By _noppcommerecelogoLink = (By.xpath("//img[@alt=\"nopCommerce demo store\"]"));



    public void clickOnRegisterButton(){
        clickElement(_registerLink); }

    public void clickOnNoppCommereceLogo(){
        clickElement(_noppcommerecelogoLink); }

    public void clickOnAppleMacBookProduct(){
        clickElement(_appleMacBookProductLink); }

    public void clickOnLogin(){
        clickElement(_loginLink); }

    public void clickOnWishList(){
        clickElement(_wishlistLink); }

    public void clickOnShoppingCart(){
        clickElement(_shoppingCartLink);}

    public void clickOnBuildYourOwnComputerProduct(){
        clickElement(_buildYourOwnComputerProductLink); }

    public void clickOnHtcOneM8AndroidL5LollipopProduct(){
        clickElement(_htcOneM8AndroidL5LollipopProductLink);}

    public void clickOnVirtualGiftCardProduct(){
        clickElement(_virtualGiftCardProductLink);}

    public void clickOnComputer(){
        clickElement(_computerLink); }

    public void clickOnElectronics(){
        clickElement(_electronicsLink); }

    public void clickOnApparel(){
        clickElement(_apparelLink);}

    public void clickOnDigitalDownLoad(){
        clickElement(_digitalDownloadLink);}

    public void clickOnBooks(){
        clickElement(_booksLink);}

    public void clickOnJewelry(){
        clickElement(_jewelryLink);}

    public void clickOnGiftCard(){
        clickElement(_giftCardsLink);}




}
