package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public class SymptomCounter implements ISymptomCounter {

	   ArrayList<String> list ;
	   
	   public SymptomCounter(ArrayList<String> list) {
		super();
		this.list = list;
	}

	//  List<String>   newList = new ArrayList<String>();
	  
	
	@Override
	
	public  LinkedHashMap<String,Integer> getOccurence() {
		// TODO Auto-generated method stub
	
		//	ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>() ;
		ArrayList<String> NoduplicateAndOrdredList = new ArrayList<String>();
		
		
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		linkedset.addAll(list);
		NoduplicateAndOrdredList.addAll(linkedset);
		
		
		Collections.sort(NoduplicateAndOrdredList);
		
		for (int i=0;i<NoduplicateAndOrdredList.size();i++)
		{
			

	      int result =Collections.frequency(list, NoduplicateAndOrdredList.get(i));
	      
	      map.put(NoduplicateAndOrdredList.get(i), result);
		}
		
		return map;
	}

	
}
