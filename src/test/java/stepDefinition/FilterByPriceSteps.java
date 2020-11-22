package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static stepDefinition.Utils.getElement;
import static stepDefinition.Utils.moveSlider;

public class FilterByPriceSteps {


    @When("Move slider")
    public void setPricesOnSlider() {
        WebElement slider1 = getElement(By.xpath("//*[@id=\"slider-range\"]/a[1]"));
        WebElement slider2 = getElement(By.xpath("//*[@id=\"slider-range\"]/a[2]"));
        moveSlider(slider1, slider2);
    }


    @Then("Are displayed only filtered products")
    public void checkDisplayedProducts() {
        int[] list = {1, 2, 7, 9, 11};
        List<Double> prices = new ArrayList<Double>();
        for (int value : list) {
            WebElement productItem = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[" + value + "]"));
            System.out.println("List[i]" + value);
            String price = getElement(By.xpath("  /html/body/div[7]/div/div[4]/div[" + value + "]/div/div[2]/div[1]/span")).getText();
            System.out.println("Price" + price);
            String newPrice = price.substring(1, price.length() - 1);
            Double priceDouble = Double.parseDouble(newPrice);
            prices.add(priceDouble);
            System.out.println(priceDouble);
        }

        Assert.assertTrue(checkPrices(prices));

    }

    private boolean checkPrices(List<Double> prices) {
        for (Double price : prices) {
            if (!(price >= 88 && price <= 311)) {
                return false;
            }
        }
        return true;
    }
}
