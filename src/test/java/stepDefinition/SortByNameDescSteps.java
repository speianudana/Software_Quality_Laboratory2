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

public class SortByNameDescSteps {

    @When("Select Sort By Name Z-A")
    public void sortByNameDesc() {
        WebElement element = getElement(By.cssSelector("#country1"));
        Select sortingCategories = new Select(element);
        sortingCategories.selectByValue("1");
    }

    @Then("Products sorted by name Z-A")
    public void checkProductSorting() {
        int[] list = {3, 7, 10, 11, 1, 8, 5, 4, 6, 9, 2};
        List<String> titles = new ArrayList<String>();
        for (int value : list) {
            WebElement productItem = getElement(By.xpath(" /html/body/div[7]/div/div[4]/div[" + value + "]"));
            System.out.println("List[i]" + value);
            String title = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[" + value + "]/div/div[2]/h4/a")).getText();
            System.out.println("Title" + title);
        }
        Collections.reverse(titles);
        boolean isSorted = Ordering.from(String.CASE_INSENSITIVE_ORDER).isOrdered(titles);

    }
}
