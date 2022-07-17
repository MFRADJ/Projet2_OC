package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WriteSymptomDataToFile  implements ISymptomWriter{
	private static final File FileNameResults = null;
	LinkedHashMap <String,Integer> map;
	public WriteSymptomDataToFile(LinkedHashMap<String, Integer> map) {
		super();
		this.map = map;
	}
	@Override
	     public  File writeRustls() 
	         { 	  
			FileWriter writer = null;
			try {
				File FileNameResults = new File("result.out");
				writer = new FileWriter (FileNameResults);

				   for(Entry<String, Integer> mp:map.entrySet())
				     
			
						writer.write( mp.getKey() + ": "+ mp.getValue() + "\n");
					writer.close();
			}
				   catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return FileNameResults ;
	}
}
