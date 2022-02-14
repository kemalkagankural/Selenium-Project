package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellerPage  extends BasePage {
    public BestSellerPage(WebDriver driver) {
        super(driver);
    }
    By bestSellerPageLocator=By.id("zg_banner_text");

    public boolean isOnBestSellerPage() {
        return isDisplayed(bestSellerPageLocator);
    }
}
