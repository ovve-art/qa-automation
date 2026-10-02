import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaScriptAlertsTest extends BaseTest {

    @Test
    void dismissJsConfirmShowsCancelResult() {

        JavaScriptAlertsPage alertsPage = new JavaScriptAlertsPage(driver);

        alertsPage.open();

        alertsPage.clickJsConfirm();

        assertEquals("I am a JS Confirm", alertsPage.getAlertText());

        alertsPage.dismissAlert();

        assertEquals("You clicked: Cancel", alertsPage.getResult());
    }

    @Test
    void jsPromptDisplaysEnteredText() {

        JavaScriptAlertsPage alertsPage = new JavaScriptAlertsPage(driver);

        alertsPage.open();

        alertsPage.clickJsPrompt();

        alertsPage.typeInPromptAndAccept("Hello QA");

        assertEquals("You entered: Hello QA", alertsPage.getResult());
    }
}
