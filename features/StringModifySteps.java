package com.bdd.stringmodify;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import static org.junit.Assert.assertTrue;

public class StringModifySteps {

	StringModify mod;

@Given("^the object's string is \"([^\"]*)\"$")
public void the_object_s_string_is(String arg1) throws Throwable {
    mod = new StringModify(arg1);
    assertTrue("The initial string is correct.",mod.getString().equals(arg1));
}

@When("^\"([^\"]*)\" is concatenated to the string$")
public void is_concatenated_to_the_string(String arg1) throws Throwable {
    mod.add(arg1);
}

@Then("^\"([^\"]*)\" should be the new object string$")
public void should_be_the_new_object_string(String arg1) throws Throwable {
    assertTrue("The concatenated string is correct.",mod.getString().equals(arg1));
}


@When("^I remove (\\d+) characters$")
public void I_remove_characters(int arg1) throws Throwable {
    mod.remove(arg1);
}


@When("^the object string is reversed$")
public void the_object_string_is_reversed() throws Throwable {
    mod.reverse();
}

@Given("^the string is a palindrome$")
public void the_string_is_a_palindrome() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}
	
}
