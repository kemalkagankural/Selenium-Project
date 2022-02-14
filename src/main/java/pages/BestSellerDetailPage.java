package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestSellerDetailPage extends BasePage {
    public BestSellerDetailPage(WebDriver driver) {
        super(driver);
    }

    By bestSellerDetailPageTitleLocator=By.cssSelector("h1.a-size-large.a-spacing-medium.a-text-bold");

    public void selectProduct(int i){
        getAllProducts().get(i).click();
    }

    public boolean isOnBestSellerDetailPage() {
        return isDisplayed(bestSellerDetailPageTitleLocator);
    }

    public List<WebElement> getAllProducts(){
        By allProductsLocator=By.cssSelector("a.a-link-normal:nth-child(2) > span:nth-child(1)");
        return findAll(allProductsLocator);}
}
