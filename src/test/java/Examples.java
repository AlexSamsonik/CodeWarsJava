import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Examples extends ExamplesDataProvider {
    private static final Logger logger = LogManager.getLogger(Examples.class);

    /**
     * Checked that first set collection equals second set collection
     */
    @Test(description = "Set equals Set", dataProvider = "set")
    public void equalsSet(Set<String> setOne, Set<String> setTwo) {
        logger.info("Start of check that setOne: " + setOne + " equals setTwo: " + setTwo);
        Assert.assertEquals(setOne, setTwo, "Sets are not equals, ");
        logger.info("Checked that setOne equals setTwo.");
    }
}