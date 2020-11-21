package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinition.Utils.*;

public class QuickViewSteps {
    @When("Scroll to men's clothes items area")
    public void scrollToProductsArea() {
        WebElement element = getElement(By.cssSelector("body > div.banner-bootom-w3-agileits > div > div.col-md-8.products-right > div"));
        scrollPage(element);
    }


    @And("Click on element \"Quick View\" button")
    public void clickOnQuickViewButton() {
        WebElement image = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[1]/div/div"));
        WebElement quickView = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[1]/div/div/a"));
        moveToProductPage(image);
        quickView.click();

    }

    @Then("The correct product page is opened")
    public void openCorrectPage() {
        WebElement element = getElement(By.xpath("/html/body/div[7]/div/div[2]/h3"));
        Assert.assertEquals("Part Men's Blazer", element.getText());
    }

}
