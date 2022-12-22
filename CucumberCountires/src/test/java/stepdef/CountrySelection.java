package stepdef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountrySelection {
	
	List<String> countryList, capitalList, languageList;
	int index;
	
	@Given("^the user has countries array$")
	public void the_user_has_countries_array(DataTable arg1) throws Throwable {
		
		countryList = arg1.asList(String.class);
	}

	@And("^the user has capitals array$")
	public void the_user_has_capitals_array(DataTable arg1) throws Throwable {
		
	    capitalList = arg1.asList(String.class);
	}

	@And("^the user has languages array$")
	public void the_user_has_languages_array(DataTable arg1) throws Throwable {
	   
		languageList = arg1.asList(String.class);
	}

	@When("^the user choose a random number$")
	public void the_user_choose_a_random_number() throws Throwable {
		
		int len = countryList.size();
		Random r = new Random();
		index = r.nextInt(len);
		
	}

	@Then("^the corresponding items should be printed$")
	public void the_corresponding_items_should_be_printed() throws Throwable {
		System.out.println("Index:" + index);
		System.out.println("Country:"+ countryList.get(index));
		System.out.println("Capital:"+ capitalList.get(index));
		System.out.println("Language:"+ languageList.get(index));
	}
}
