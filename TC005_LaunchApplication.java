package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.ForgotPasswordPage;

public class TC005_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new ForgotPasswordPage(driver)
			.getScreenshot("TC005_LaunchApplication");
		

		}
		
	}
