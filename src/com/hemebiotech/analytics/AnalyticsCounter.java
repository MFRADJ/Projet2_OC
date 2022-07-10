package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.LinkedHashMap;



public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
     
	
         ISymptomReader	readSymptomDataFromFile = new 	ReadSymptomDataFromFile ("symptoms.txt") ;
         ArrayList<String> list = readSymptomDataFromFile.GetSymptoms() ;
          

         ISymptomCounter symptomCounter =new SymptomCounter(list);
         LinkedHashMap <String,Integer> map=symptomCounter.getOccurence();
         
         
	    ISymptomWriter	 writeSymptomToFile = new 	WriteSymptomDataToFile (map);
	    writeSymptomToFile.writeRustls();   	
	}

}


		 
		 
		 
		 
		 
		 
	
