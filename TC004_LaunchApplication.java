package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.FlightsPage;

public class TC004_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new FlightsPage(driver)
			.getScreenshot("TC004_LaunchApplication");
		

		}
		
	}
