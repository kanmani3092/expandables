package org.consumer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	public void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("InValid Type");
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void windowsMax() {
		driver.manage().window().maximize();
	}

	public void sleep(int millis) throws InterruptedException {
      Thread.sleep(millis);
	}
	
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void alert(String type) {
		Alert alert = driver.switchTo().alert();

		switch (type) {
		case "Accept":
			alert.accept();
			break;

		case "Dismiss":
			alert.dismiss();
			break;

		default:
			break;
		}
	}

	public void textSend(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public void textSendByJs(WebElement element, String keysToSend) {
		js.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);
	}

	public void screenCapture(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\my folder\\New folder" + name + ".png");
		FileUtils.copyFile(source, target);

	}

	
	public void frameBasedElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void selectByValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void switchWindows(int index) {

		Set<String> allWindowsID = driver.getWindowHandles();
		List<String> list = new LinkedList<String>();
		list.addAll(allWindowsID);
		// To get Particular values
		String childWindowsID = list.get(index);
		// To Switch To Windows
		driver.switchTo().window(childWindowsID);

	}

	public String getWindowsID(int index) {

		Set<String> allWindowsID = driver.getWindowHandles();
		List<String> list = new LinkedList<String>();
		list.addAll(allWindowsID);
		// To get Particular values
		String childWindowsID = list.get(index);
		return childWindowsID;
	}

	public void switchtoWindows(String childWindowsID) {

		// To Switch To Windows
		driver.switchTo().window(childWindowsID);
	}

	public void scroll(WebElement element, String Up_Down) {

		switch (Up_Down) {
		case "Up":
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			break;

		case "Down":
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			break;

		default:
			System.err.println("InValid Type");
			break;
		}

	}

	public String readExcell(int rownum, int cellnum) throws IOException {

		// To Locate File (Excell)
		File file = new File("C:\\my folder\\Excel Workbook.xlsx");

		// To get File as a Input Datas
		FileInputStream stream = new FileInputStream(file); // throws FileNotFoundException

		// To Define WorkBook
		Workbook book = new XSSFWorkbook(stream); // throws IOException

		
		// To Get Sheet from Workbook
		Sheet sheet = book.getSheet("Sheet3");

		// To get Row from Sheet
		Row row = sheet.getRow(rownum);

		// To Get Cell from Row
		Cell cell = row.getCell(cellnum);

		// To Find Cell TYpe
		CellType cellType = cell.getCellType();

		String value = null;

		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();

			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);

			} else {

				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();
			}
			break;

		default:
			break;
		}

		return value;

	}

}


