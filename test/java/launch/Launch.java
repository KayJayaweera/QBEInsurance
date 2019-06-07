package launch;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.WebPage;
import resources.BrowserLogin;


public class Launch extends BrowserLogin
{
	@BeforeTest
	public void launch() throws IOException
	{
		//Launch l=new Launch();
		driver=initialization();
	}
	
	@Test
	public void webpage() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		WebPage wp = new WebPage(driver);
		wp.CarsandVehicles().click();
		wp.CTP().click();
		wp.State().click();
		wp.GreenSlipRenewal().click();
		wp.NewGreenSlipQuote().click();
		wp.AnonymousRadioButton().click();
		wp.IsthevehicleDropDown().selectByValue("1");
		wp.InsuranceStart().click();
		wp.StartDate().click();
		wp.SubmitContinueButton().click();
		wp.YearofManufacture().sendKeys("2015");
		wp.MakeofVehicleDropdown().selectByValue("MITSUB");
		wp.VehicleShapeDropdown().selectByValue("WAG");
		wp.VehicleUsageDropdown().selectByValue("AIRP");
		wp.PostcodeDropdown().selectByValue("2000-HAYMARKET");
		wp.VDContinueButton().click();
		wp.CustomertypeRadioButton().click();
		wp.TermRadioButton().click();
		wp.TaxcreditRadioButton().click();
		wp.DOBofinsurer().sendKeys("13/11/1990");
		wp.DOBofinsurer().click();
		wp.UnderAgeRadioButton().click();
		wp.NSWlicenceRadioButton().click();
		wp.InsurerDetailContinueButton().click();
		wp.FinishButton().click();

		Thread.sleep(1000);
	}
	
	@AfterTest
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}  
	

}
