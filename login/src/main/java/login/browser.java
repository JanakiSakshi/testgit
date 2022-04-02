package login;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class browser {
public static void main (String[] args) throws IOException {
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
File f = new File ("D:\\det.xlsx");
FileInputStream stream = new FileInputStream(f);
Workbook w = new XSSFWorkbook(stream);
Sheet sheet = w.getSheet("Sheet1");
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
Row row1 = sheet.getRow(1);
Cell cell1 = row.getCell(1);
String stringCellValue = cell.getStringCellValue();
String stringCellValue1 = cell1.getStringCellValue();
WebElement txtUsername = driver.findElement(By.id("email"));
txtUsername.sendKeys(stringCellValue);
WebElement txtPwd = driver.findElement(By.id("pass"));
txtPwd.sendKeys(stringCellValue1);
WebElement button = driver.findElement(By.name("login"));
button.click();
}
}
