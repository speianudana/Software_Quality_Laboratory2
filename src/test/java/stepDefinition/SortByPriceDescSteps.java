package stepDefinition;

import com.google.common.collect.Ordering;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static stepDefinition.Utils.getElement;

public class SortByPriceDescSteps {


    @When("Select Sort By Price High-Low")
    public void sortByPriceAsc() {
        WebElement element = getElement(By.cssSelector("#country1"));
        Select sortingCategories = new Select(element);
        sortingCategories.selectByValue("2");
    }

    @Then("Products sorted by price High-Low")
    public void checkProductSorting() {
        int[] list = {11, 1, 7, 9, 2, 6, 3, 8, 5, 4, 10};

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
        Collections.reverse(prices);
        boolean sorted = Ordering.natural().isOrdered(prices);
    }
}
