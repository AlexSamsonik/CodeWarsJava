import org.testng.annotations.DataProvider;

import java.util.HashSet;
import java.util.Set;

public class ExamplesDataProvider {

    @DataProvider(name = "set")
    public Object[] set() {
        Set<String> setOne = new HashSet<>();
        setOne.add("N");
        setOne.add("W");
        setOne.add("S");
        setOne.add("E");

        Set<String> setTwo = new HashSet<>();
        setTwo.add("W");
        setTwo.add("N");
        setTwo.add("E");
        setTwo.add("S");
        return new Object[][]{{setOne, setTwo}};
    }
}
