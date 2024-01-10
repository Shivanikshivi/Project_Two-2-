package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.LoginPage;

public class TC002_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new LoginPage(driver)
			.getScreenshot("TC002_LaunchApplication");
		

		}
		
	}
