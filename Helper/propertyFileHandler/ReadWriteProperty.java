package com.bmc.remedyforce.Helper.propertyFileHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class ReadWriteProperty {

	
	
	Properties props = new Properties();
	FileInputStream in;
	FileOutputStream out;
	//HandlersException exHandler = new HandlersException();
	
	
	// Reading from Property File by passing Property file name, Property and
	// returning Property Value
	public String Read(String properrtyfile, String property) {

		// Properties prop = new Properties();
		InputStream input = null;
		
		File file = new File("C:\\rfInstallAutomation\\RemedyforceAutoServices\\Properties\\"+properrtyfile);
		
		//File file = new File(System.getProperty("user.dir")+ "\\Properties\\"+properrtyfile);
	//System.out.println("C:\\rfInstallAutomation\\AutoInstallationScript\\Properties\\"+properrtyfile);
			

		try {
			input = new FileInputStream(file.getAbsolutePath());

		} catch (FileNotFoundException e) {
			System.out.println("Property File not found:" + e);
			
		}

		try {
			props.load(input);
			//System.out.println( "Value loaded from Property File: " + properrtyfile);
			
		} catch (IOException e) {
			System.out.println("Unable to Load Values from:" + properrtyfile + "  " + e);
			
		}
		// get the property value and print it out
		return props.getProperty(property);

	}
	
	 public void write(List<String> propContent, String propertyFileName) throws IOException {
		File file = new File("C:\\rfInstallAutomation\\RemedyforceAutoServices\\Properties\\"+propertyFileName+".properties");
		FileWriter fr = null;
		BufferedWriter br = null;

		int arraysize = propContent.size();

		if (arraysize > 0) {
			fr = new FileWriter(file);
			br = new BufferedWriter(fr);
			for (int j = 0; j < arraysize; j++) {

				System.out.println(propContent.get(j));
				br.write(propContent.get(j) + System.getProperty("line.separator"));

			}

			br.close();
			fr.close();

		}
	        
	        
	       /* String dataWithNewLine=data+System.getProperty("line.separator");
	        try{
	            fr = new FileWriter(file);
	            br = new BufferedWriter(fr);
	            for(int i = noOfLines; i>0; i--){
	                br.write(dataWithNewLine);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	            try {
	                br.close();
	                fr.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }*/
	    }
	 
	/* public void Write(String properrtyfile, String property, String propertyValue) {

			try {
				in = new FileInputStream(properrtyfile);
				props.load(in);
				in.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Property File not found:" + e);
			
				// in.close();
			}

			props.setProperty(property, propertyValue);

			try {
				out = new FileOutputStream(properrtyfile);
				props.store(out, null);
				out.close();
				System.out.println("Property Vaule Updated:" + property + "=" + propertyValue);

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println( "Property File not able to Load:" + e);
				
				// in.close();
			}
		}*/

}

