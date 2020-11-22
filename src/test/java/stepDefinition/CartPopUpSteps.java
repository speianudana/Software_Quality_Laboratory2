package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinition.Utils.*;

public class CartPopUpSteps {

    @Given("Open Men's clothes page")
    public void openMensClothesPage() {
        navigate("https://loving-hermann-e2094b.netlify.app/mens.html");
    }

    @When("Scroll to products area")
    public void scrollToProductsArea() {
        WebElement element = getElement(By.cssSelector("body > div.banner-bootom-w3-agileits > div > div.col-md-8.products-right > div"));
        scroll(element);
    }

    @And("Click on element ADD TO CART button")
    public void clickAddToCartButton() {
        WebElement element1 = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[2]/div[2]/form/fieldset/input[10]"));
        element1.submit();
    }

    @Then("Delete button is clickable")
    public void checkOverlapping() {
        WebElement button = getElement(By.cssSelector("#PPMiniCart > form > ul > li.minicart-item.minicart-item-changed > div.minicart-details-remove > button"));
        button.click();
    }
}