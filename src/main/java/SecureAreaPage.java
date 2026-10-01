import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecureAreaPage extends BasePage{

    private By logoutButton = By.cssSelector("a.button.secondary.radius");
    private By flashMessage = By.id("flash");

    public SecureAreaPage(WebDriver driver){

        super(driver);
    }

    public void logout() {

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(logoutButton)
        );

        button.click();
    }

    public String getFlashMessage(){

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(flashMessage));

        return message.getText();
    }

}
