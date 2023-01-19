package com.testvagrant.tests;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrant.Base.BaseClass;
import com.testvagrant.utils.Constants;
import com.testvagrant.utils.DeserializeJsonUtility;


public class TestClass extends BaseClass {

	@Test
	public void testForeignPlayersAreNotMoreThanFour()
	{
		int count= jsonutility.getForeignPlayersCount();
		boolean result = count <=4; 
		Assert.assertTrue(result, "Sorry! Only 4 Foreign Players are allowed in the Team");
	}
	@Test
	public void TestAtleastOneWicketKeeperPresent()
	{
		int count= jsonutility.getWicketKeepersCount();
		boolean result = count>=1;
		Assert.assertTrue(result,"Sorry! There should be atleast one wicket-keeper present in the team");
	}
}
