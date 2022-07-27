package runnerFiles;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import utility.GenericMethods;

public class BeforeRun {

	GenericMethods gm;

	@BeforeSuite(enabled = true)
	public void readingVariablesfromFile() throws IOException {

		gm = new GenericMethods(System.getProperty("user.dir") + "\\Driver\\",
				System.getProperty("user.dir") + "\\Reports\\", "HTN_");

	}

}
