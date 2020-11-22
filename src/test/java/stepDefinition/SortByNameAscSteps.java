package stepDefinition;

import com.google.common.collect.Ordering;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static stepDefinition.Utils.getElement;

public class SortByNameAscSteps {


    @When("Select Sort By Name A-Z")
    public void sortByNameAsc() {
        WebElement element = getElement(By.cssSelector("#country1"));
        Select sortingCategories = new Select(element);
        sortingCategories.selectByValue("0");
    }

    @Then("Products sorted by name A-Z")
    public void checkProductSorting() {
        int[] list = {2, 9, 6, 4, 5, 8, 1, 11, 10, 7, 3};
        List<String> titles = new ArrayList<String>();
        for (int value : list) {
            WebElement productItem = getElement(By.xpath(" /html/body/div[7]/div/div[4]/div[" + value + "]"));
            System.out.println("List[i]" + value);
            String title = getElement(By.xpath("/html/body/div[7]/div/div[4]/div[" + value + "]/div/div[2]/h4/a")).getText();
            System.out.println("Title" + title);
        }
        boolean isSorted = Ordering.from(String.CASE_INSENSITIVE_ORDER).isOrdered(titles);

    }

}
