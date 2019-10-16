package GherkinFile;

import org.openqa.selenium.By;

public class EmailAFriendPage extends AppleMacBookPage {
    LoadProps loadProps = new LoadProps();

    private By _friendsEmailLink = (By.id("FriendEmail"));

    private By _personalMessageLink = (By.name("PersonalMessage"));
    private By _sendEmailLink = (By.xpath("//input[contains(@name,'send-email')]"));


    public void allDetailstoEmailAFriend(){
        enterText(_friendsEmailLink,loadProps.getProperty("FriendEmail"));

        enterText(_personalMessageLink,loadProps.getProperty("PersonalMessage"));

        clickElement(_sendEmailLink);
    }

}
