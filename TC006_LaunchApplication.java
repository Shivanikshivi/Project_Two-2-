package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CheckinPage;

public class TC006_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new CheckinPage(driver)
			.getScreenshot("TC006_LaunchApplication");
		

		}
		
	}
