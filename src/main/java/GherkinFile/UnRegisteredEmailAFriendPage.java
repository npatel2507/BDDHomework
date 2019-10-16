package GherkinFile;

import org.openqa.selenium.By;
import org.testng.Assert;

public class UnRegisteredEmailAFriendPage extends AppleMacBookPage {

    private By _friendsEmailLink = (By.id("FriendEmail"));
    private By _yourEmailLink = (By.xpath("//input[@class=\"your-email\"]"));
    private By _personalMessageLink = (By.name("PersonalMessage"));
    private By _sendEmailLink = (By.xpath("//input[contains(@name,'send-email')]"));
    private By _actualResult =(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));

    public void allDetailsToEmailFriendForUnregistered(){
        enterText(_friendsEmailLink,loadProps.getProperty("FriendEmail"));

        enterText(_yourEmailLink,loadProps.getProperty("Youremail"));

        enterText(_personalMessageLink,loadProps.getProperty("PersonalMessage"));

        clickElement(_sendEmailLink);
    }
    public void referAProductToFriendFails(){
        String expectedResult = "Only registered customers can use email a friend feature";
        String actualResult = getTextFromElement(_actualResult);

        Assert.assertEquals(expectedResult,actualResult);

    }
}
