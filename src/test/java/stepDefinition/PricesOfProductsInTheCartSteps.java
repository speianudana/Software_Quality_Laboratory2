package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinition.Utils.*;
import static stepDefinition.Utils.getElement;

public class PricesOfProductsInTheCartSteps {

    @When("Scroll to clothes items area")
    public void scrollToProductsArea() {
        WebElement element = getElement(By.cssSelector("body > div.banner-bootom-w3-agileits > div > div.col-md-8.products-right > div"));
        scrollPage(element);
    }

    @And("Click on element \"Add to Cart\" button")
    public void clickAddToCartButton() {
        WebElement element1 = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[2]/div[2]/form/fieldset/input[10]"));
        element1.submit();
    }


    @Then("The price from cart is equal with price item from the page")
    public void checkIfPricesCorrespond() {
       WebElement cartItem = getElement(By.xpath("//*[@id=\"PPMiniCart\"]/form/ul/li/div[4]/span"));
        WebElement itemOnPage = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[2]/div[1]/span"));
        Assert.assertEquals(cartItem.getText(),itemOnPage.getText());
    }
}
