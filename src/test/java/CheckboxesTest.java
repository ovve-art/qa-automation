import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckboxesTest extends BaseTest {

    @Test
    void userCanToggleCheckboxes() {

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        checkboxesPage.open();

        assertFalse(checkboxesPage.isChecked(0), "Precondition: checkbox 1 should be unchecked");
        assertTrue(checkboxesPage.isChecked(1), "Precondition: checkbox 2 should be checked");

        checkboxesPage.toggle(0);
        checkboxesPage.toggle(1);

        assertTrue(checkboxesPage.isChecked(0), "Checkbox 1 should be checked after click");
        assertFalse(checkboxesPage.isChecked(1), "Checkbox 2 should be unchecked after click");
    }
}
