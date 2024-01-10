package testcases;
import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.FlightStatusPage;

public class TC007_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new FlightStatusPage(driver)
			.getScreenshot("TC007_LaunchApplication");
		

		}
		
	}