package utils;

import com.opencsv.exceptions.CsvException;
import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BestSellerList extends BasePage {
    public BestSellerList(WebDriver driver) {
        super(driver);
    }
    List<String> bestSellers;


    public void getBestSellerList() throws IOException {
        bestSellers=new ArrayList<>();
        for(int i=0;i<getAllBestSeller().size();i++){
            bestSellers.add(getAllBestSeller().get(i).getAttribute("href"));
        }
        Helper.writeToCSV(String.valueOf(bestSellers));
    }
    public void readBestSellerList(int number) throws IOException, CsvException {
        driver.get(Helper.readToCSV(number));
    }


    public List<WebElement> getAllBestSeller(){
        By bestSellerCategoriesLocator=By.cssSelector("div._p13n-zg-nav-tree-all_style_zg-browse-item__1rdKf._p13n-zg-nav-tree-all_style_zg-browse-height-small__nleKL > a");
        return findAll(bestSellerCategoriesLocator);}
}
