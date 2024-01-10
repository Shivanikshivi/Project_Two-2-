package testcases;
import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.ManageBookingPage;

public class TC008_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new ManageBookingPage(driver)
			.getScreenshot("TC008_LaunchApplication");
		

		}
		
	}