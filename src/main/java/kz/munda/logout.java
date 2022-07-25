package kz.munda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class logout {

    WebDriver driver;
    public logout(WebDriver driver) {this.driver = driver;}

    // �������� �������� ������ �� �������

    @FindBy(xpath = "//div[contains(@class, 'topPage__user-info')]")
    @CacheLookup
    private WebElement usermenu;

    @FindBy(xpath = "//button[contains(@class, 'button logout-btn')]")
    @CacheLookup
    private WebElement logoutBtn;

    // �������� �������� ������ �� �������

    public void clickBtn() {
        logoutBtn.click();
    }

    public void clickMenu() {
        usermenu.click();
    }

}
