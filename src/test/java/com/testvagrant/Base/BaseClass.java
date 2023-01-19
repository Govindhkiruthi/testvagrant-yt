package com.testvagrant.Base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.testng.annotations.BeforeSuite;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testvagrant.utils.CommonUtils;
import com.testvagrant.utils.TeamsModel;
import com.testvagrant.utils.DeserializeJsonUtility;


public class BaseClass {

	protected CommonUtils commonUtils = new CommonUtils();
	protected DeserializeJsonUtility jsonutility = new DeserializeJsonUtility();
	String absolutePath = Paths.get("src","test","resources").toFile().getAbsoluteFile().toString();
	String filepath = absolutePath+ "\\input.json";
	public TeamsModel teamsModel;
	
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		teamsModel = jsonutility.deserializeJson(filepath);
		 
	}
}
