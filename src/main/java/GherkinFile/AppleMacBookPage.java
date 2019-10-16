package GherkinFile;

import org.openqa.selenium.By;

public class AppleMacBookPage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _emailAFriendLink = (By.xpath("//input[@value=\"Email a friend\"]"));

    public void clickOnEmailFriend(){

        clickElement(_emailAFriendLink);

    }}
