package com.testvagrant.Base;

import java.nio.file.Paths;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.testng.annotations.BeforeSuite;

import com.testvagrant.utils.CommonUtils;


public class BaseClass {

	CommonUtils commonUtils = new CommonUtils();
	
	String absolutePath = Paths.get("src","test","resources").toFile().getAbsoluteFile().toString();
	String filepath = absolutePath+ "\\input.json";
	protected JSONArray playersList;
	
	@BeforeSuite
	public void beforeSuite()
	{
		 playersList = commonUtils.getJSONArrayFromJsonFile(filepath);
	}
}
