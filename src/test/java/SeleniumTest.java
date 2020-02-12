import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup() {
        Selenium.setup();
    }

    @Test
    public void createRecordTest() {
        Selenium.createRecord("Filmas");
    }
    @Test
    public void badRecordTest() {
        Selenium.badRecord("...");
    }
    @Test
    public void deleteRecordTest() {
        Selenium.deleteRecord("80");
    }
    @Test
    public void updateRecordTest() {
        Selenium.updateRecord("88","Antanas", "Baranauskas", "Silelis");
    }
    @Test
    public void updateBadRecordTest() {
        Selenium.updateBadRecord("88","...");
    }


    @AfterTest
    public void close() {
        //Selenium.close();
    }

}
