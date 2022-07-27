package runnerFiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends BeforeRun {

	@Test
	public void LoginPage() {

		gm.StartTest("Open Netflix page", "Open Netflix page");
		gm.OpenBrowser("https://www.netflix.com/in/", "chrome");

		gm.waitforElementVisible(By.id("id_email_hero_fuji"), 30, "emailAddress field");
		gm.setText(By.id("id_email_hero_fuji"), "Emailaddress@co.com", "emailAddress field");
		
		gm.EndTest();
		
	}
}
