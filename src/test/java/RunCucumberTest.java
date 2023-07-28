import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import setup.driver.SeleniumWebDriver;

/**
 * @author: Navdeep
 * Date: 2023-07-25
 * Time: 9:55 p.m.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/sauceDemoLogin.feature"},//classpath:features/sauceDemoLogin.feature    classpath:features/saucedemoE2E.feature
        glue = {"com.assignment.solution"},
        plugin = {"pretty", "html:target/cucumber-reports/index.html", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"}
)
public class RunCucumberTest extends SeleniumWebDriver {
    @BeforeClass
    public static void initDriver() {
        initChrome();
    }

    @AfterClass
    public static void tearDown() {
        closeDriver();
    }
}
