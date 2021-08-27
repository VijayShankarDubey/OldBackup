package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class viewEditDriver {

	public WebDriver driver;

	// Add New Driver
	By vendorDashboard = By.xpath("//li[@class='superadminMenu ng-scope']");
	By clickDriver = By.id("viewDriverButton_vendor");
	By addDriver = By.id("addDriverNew");
	By driverName = By.xpath("//input[@name='name']");
	By driverfatherName = By.xpath("//input[@name='fatherName']");
	By mobileNumber = By.xpath("//input[@name='contactNo']");
	By dob = By.xpath("//button[@ng-click='openDobCal($event)']");
	By licenseNumber = By.xpath("//input[@name='lisNum']");
	By licenseExpiry = By.xpath("//button[@ng-click='openExpDateCal($event)']");
	By issuingAuthority = By.xpath("//input[@name='issuingAuthority']");
	By issueDate = By.cssSelector("button[ng-click='openIssuedCal($event)']");
	By policeVerification = By.xpath("//button[@ng-click='openPoliceVerificationCal($event)']");
	By ddRenewal = By.xpath("//button[@ng-click='openDDTCal($event)']");
	By medicalExpiry = By.xpath("//button[@ng-click='openMedicalExpiryCal($event)']");
	By joiningDate = By.xpath("//button[@ng-click='openJoiningCal($event)']");
	By address = By.xpath("//textarea[@name='address']");
	By permanentAddress = By.xpath("//textarea[@name='permanentAddress']");
	By submitDriver = By.xpath("//button[@ng-click='addDriver(newDriver)']");

	public viewEditDriver(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getvendorDashboard() {
		return driver.findElement(vendorDashboard);
	}

	public WebElement getclickDriver() {
		return driver.findElement(clickDriver);
	}

	public WebElement getaddDriver() {
		return driver.findElement(addDriver);
	}

	public WebElement getdriverName() {
		return driver.findElement(driverName);
	}

	public WebElement getdriverfatherName() {
		return driver.findElement(driverfatherName);
	}

	public WebElement getmobileNumber() {
		return driver.findElement(mobileNumber);
	}

	public WebElement getdob() {
		return driver.findElement(dob);
	}

	public WebElement getlicenseNumber() {
		return driver.findElement(licenseNumber);
	}

	public WebElement getlicenseExpiry() {
		return driver.findElement(licenseExpiry);
	}

	public WebElement getissuingAuthority() {
		return driver.findElement(issuingAuthority);
	}

	public WebElement getissueDate() {
		return driver.findElement(issueDate);
	}

	public WebElement getpoliceVerification() {
		return driver.findElement(policeVerification);
	}

	public WebElement getddRenewal() {
		return driver.findElement(ddRenewal);
	}

	public WebElement getmedicalExpiry() {
		return driver.findElement(medicalExpiry);
	}

	public WebElement getjoiningDate() {
		return driver.findElement(joiningDate);
	}

	public WebElement getaddress() {
		return driver.findElement(address);
	}

	public WebElement getpermanentAddress() {
		return driver.findElement(permanentAddress);
	}

	public WebElement getsubmitDriver() {
		return driver.findElement(submitDriver);
	}

}
