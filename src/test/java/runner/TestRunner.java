package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//com.cucumber.listener.ExtentCucumberFormatter:output/report.html
//import managers.FileReaderManager;
//import dataProviders.ConfigFileReader;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\FreeCRM_1\\src\\test\\java\\feature\\taggedhooks.feature", 
				 glue = "stepdefinitation", 
				 monochrome = true, 
				// plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }, 
				 format= "pretty",
				 dryRun = false, 
				 strict= true )
				// tags= {"~@SmokeTest and @RegressionTest"}

public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}

