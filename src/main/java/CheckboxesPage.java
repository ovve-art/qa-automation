import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckboxesPage extends BasePage {

    private static final String URL = "https://the-internet.herokuapp.com/checkboxes";

    private By checkboxes = By.cssSelector("#checkboxes input[type='checkbox']");
    private By firstCheckbox = By.cssSelector("#checkboxes input[type='checkbox']:nth-of-type(1)");
    private By secondCheckbox = By.cssSelector("#checkboxes input[type='checkbox']:nth-of-type(2)");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkboxes));
    }

    public int getCheckboxCount() {
        return driver.findElements(checkboxes).size();
    }

    public void toggleFirst() {
        driver.findElement(firstCheckbox).click();
    }

    public void toggleSecond() {
        driver.findElement(secondCheckbox).click();
    }

    public boolean isFirstChecked() {
        return driver.findElement(firstCheckbox).isSelected();
    }

    public boolean isSecondChecked() {
        return driver.findElement(secondCheckbox).isSelected();
    }
}
