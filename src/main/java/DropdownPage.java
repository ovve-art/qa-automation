import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    private static final String URL = "https://the-internet.herokuapp.com/dropdown";

    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
    }

    public void selectByVisibleText(String text) {
        getSelect().selectByVisibleText(text);
    }

    public String getSelectedText() {
        return getSelectedOption().getText();
    }

    public String getSelectedValue() {
        return getSelectedOption().getDomProperty("value");
    }

    private WebElement getSelectedOption() {
        return getSelect().getFirstSelectedOption();
    }

    private Select getSelect() {
        return new Select(driver.findElement(dropdown));
    }
}
