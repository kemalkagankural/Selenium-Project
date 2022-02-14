
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.BestSellerList;


public class Test_Best_Sellers extends BaseTest {
    HomePage homePage ;
    BestSellerList bestSellerList;
    BestSellerPage bestSellerPage;
    BestSellerDetailPage bestSellerDetailPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void go_to_bestsellers() {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        homePage.goToBestSellers();
        bestSellerPage=new BestSellerPage(driver);
        Assertions.assertTrue(bestSellerPage.isOnBestSellerPage() ,
                "Not on best seller page!");
    }

    @Test
    @Order(2)
    public void go_to_bestseller_selected_category() throws Exception {
        bestSellerList=new BestSellerList(driver);
        bestSellerList.getBestSellerList();
        bestSellerList.readBestSellerList(3);
        bestSellerDetailPage=new BestSellerDetailPage(driver);
        Assertions.assertTrue(bestSellerDetailPage.isOnBestSellerDetailPage() ,
                "Not on best seller selected category detail page!");
    }
    @Test
    @Order(3)
    public void select_product(){
        bestSellerDetailPage.selectProduct(0);
        productDetailPage=new ProductDetailPage(driver);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }
    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase!");
    }

    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded() ,
                "Product was not added to cart!");
    }

}
