import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckboxesTest extends BaseTest {

    @Test
    void userCanToggleCheckboxes() {

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        checkboxesPage.open();

        assertEquals(2, checkboxesPage.getCheckboxCount(), "Page should contain exactly 2 checkboxes");

        assertFalse(checkboxesPage.isFirstChecked(), "Precondition: checkbox 1 should be unchecked");
        assertTrue(checkboxesPage.isSecondChecked(), "Precondition: checkbox 2 should be checked");

        checkboxesPage.toggleFirst();
        checkboxesPage.toggleSecond();

        assertTrue(checkboxesPage.isFirstChecked(), "Checkbox 1 should be checked after click");
        assertFalse(checkboxesPage.isSecondChecked(), "Checkbox 2 should be unchecked after click");
    }
}
