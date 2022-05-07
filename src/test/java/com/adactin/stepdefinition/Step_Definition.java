package com.adactin.stepdefinition;

import com.adactin.baseclass.Base_Class;
import com.adactin.baseclass.LogIn_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static LogIn_Page lp = new LogIn_Page(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		getUrl("https://adactinhotelapp.com/");

	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {

		inputValueElement(lp.getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {

		inputValueElement(lp.getPassword(), password);
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(lp.getLogin());

	}

}
