package stepdef;

import com.myntra.base.Testbase;
import com.myntra.pageclass.HomePage;
import com.myntra.pageclass.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class endsteps  extends Testbase{
	LoginPage logn=new LoginPage();
	HomePage hpm=new HomePage();
	@Given("^user opens browser$")
	public void user_opens_browser() {
		Testbase.browserInitialization();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
		logn.login(prop.getProperty("Email"), prop.getProperty("password" ));
		
	}

	@Then("^user validate homepage$")
	public void user_validate_homepage(){
		hpm.validateHome();
	}


}
