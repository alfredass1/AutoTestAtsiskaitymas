import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
    static WebDriver browser;

    private static final int SECONDS = 2;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
    }

    //public static void close() { browser.close(); }

    public static void createRecord(String keyword) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        nameField.sendKeys(keyword);
        genreField.sendKeys(keyword);
        directorField.sendKeys(keyword);
        directorField.sendKeys(Keys.ENTER);
    }

    public static void badRecord(String keyword) {

        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        nameField.sendKeys(keyword);
        genreField.sendKeys(keyword);
        directorField.sendKeys(keyword);
        directorField.sendKeys(Keys.ENTER);
    }

    public static void deleteRecord(String keyword) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement deleteBtn = browser.findElement(By.name("delete"));
        idField.sendKeys(keyword);
        deleteBtn.sendKeys(Keys.ENTER);

    }

    public static void updateRecord(String keyword1, String keyword2, String keyword3, String keyword4) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        WebElement updateBtn = browser.findElement(By.name("update"));
        idField.sendKeys(keyword1);
        nameField.sendKeys(keyword2);
        genreField.sendKeys(keyword3);
        directorField.sendKeys(keyword4);
        updateBtn.sendKeys(Keys.ENTER);
    }

    public static void updateBadRecord(String keyword1, String keyword2) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        WebElement updateBtn = browser.findElement(By.name("update"));
        idField.sendKeys(keyword1);
        nameField.sendKeys(keyword2);
        genreField.sendKeys(keyword2);
        directorField.sendKeys(keyword2);
        updateBtn.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) {

        System.out.println("Atsiskaitymas");
        setup();
        createRecord("Filmas");
        badRecord("...");
        deleteRecord("80");
        updateRecord("88", "Antanas", "Baranauskas", "Silelis");
        updateBadRecord("88", "...");

    }

}
