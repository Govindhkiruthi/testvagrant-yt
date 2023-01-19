package com.testvagrant.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * This Class is to read the json file into Pojo class 
 * All utility methods according to the testcases
 * @author kiruthika
 *
 */
public class DeserializeJsonUtility {

	
	protected JSONArray playersList;
	TeamsModel teamsModel;
	
	public TeamsModel deserializeJson(String filepath)
	{
		ObjectMapper mapper = new ObjectMapper();
		
		try {
				teamsModel = mapper.readValue(new File(filepath), TeamsModel.class);
			} catch (StreamReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatabindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return teamsModel;
		
	}
	
	public int getForeignPlayersCount()
	{
		List<PlayersModel> players = new ArrayList<PlayersModel>(teamsModel.getPlayer());
		int count =0;
		for(PlayersModel p : players)
		{
			if(!(p.getCountry().equalsIgnoreCase(Constants.India)))
			{
				count +=1;
			}
		}
		return count;
	}
	
	public int getWicketKeepersCount()
	{
		List<PlayersModel> players = new ArrayList<PlayersModel>(teamsModel.getPlayer());
		int count =0;
		for(PlayersModel p : players)
		{
			if(p.getRole().equalsIgnoreCase(Constants.WicketKeeper))
			{
				count +=1;
			}
		}
		return count;
	}
}
