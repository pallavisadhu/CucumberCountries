package stepdef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountrySelection {
	
	String[] country= {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
	String[] capital= {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
	String[] language= { "Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
	List<String> countryList;
	List<String> capitalList;
	List<String> languageList;
	int index;
	
	@Given("^the user has three arrays$")
	public void the_user_has_three_arrays() throws Throwable {
		countryList = new ArrayList<String>(Arrays.asList(country));
	    capitalList = new ArrayList<String>(Arrays.asList(capital));
	    languageList = new ArrayList<String>(Arrays.asList(language));
	}

	@When("^the user choose a random number$")
	public void the_user_choose_a_random_number() throws Throwable {
		int len = countryList.size();
		Random r = new Random();
		index = r.nextInt(len);
	   
	}

	@Then("^the corresponding items should be printed$")
	public void the_corresponding_items_should_be_printed() throws Throwable {
		System.out.println("Index:"+index);
		System.out.println("Country:"+countryList.get(index));
		System.out.println("Capital:"+capitalList.get(index));
		System.out.println("Language:"+languageList.get(index));
	}



}
