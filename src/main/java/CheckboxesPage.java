import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckboxesPage extends BasePage {

    private static final String URL = "https://the-internet.herokuapp.com/checkboxes";

    private By checkboxes = By.cssSelector("#checkboxes input[type='checkbox']");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
        wait.until(ExpectedConditions.numberOfElementsToBe(checkboxes, 2));
    }

    public void toggle(int index) {
        getCheckbox(index).click();
    }

    public boolean isChecked(int index) {
        return getCheckbox(index).isSelected();
    }

    private WebElement getCheckbox(int index) {
        return driver.findElements(checkboxes).get(index);
    }
}
