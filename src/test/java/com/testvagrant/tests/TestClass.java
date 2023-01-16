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

public class TestClass extends BaseClass {

	List<String> nonIndianPlayersList = new ArrayList<String>();
	List<String> WickKeepersList = new ArrayList<String>();
	Iterator itr;
	@Test
	public void testForeignPlayersAreNotMoreThanFour()
	{
		itr = playersList.iterator();
		
		while(itr.hasNext())
		{
			JSONObject player = (JSONObject) itr.next();
			String country = (String)player.get(Constants.Country);
			if(!(country.equals(Constants.India)))
			{nonIndianPlayersList.add(country);
				}
		}
		boolean result = nonIndianPlayersList.size()<=4;
		Assert.assertTrue(result, "Sorry! Only 4 Foreign Players are allowed in the Team");
		
	}
	@Test
	public void TestAtleastOneWicketKeeperPresent()
	{
		itr = playersList.iterator();
		
		while(itr.hasNext())
		{
			JSONObject player = (JSONObject) itr.next();
			String Role = (String)player.get(Constants.Role);
			if(Role.equals(Constants.WicketKeeper))
			{WickKeepersList.add(Role);
			}
		}
		
		boolean result = WickKeepersList.size()>=1;
		
		Assert.assertTrue(result, "Sorry! There should be atleast one wicket-keeper present in the team");
		
	}
}
