package string_and_parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

	public static void main(String[] args)
	        throws IOException
	    {
	        File file = new File("D:\\JAVA data\\Capgemini\\Labbook1\\src\\string_and_parsing\\Text.txt");
	        FileInputStream fileInputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	  
	        String line;
	        int wordCount = 0;
	        int characterCount = 0;
	        int paraCount = 0;
	        
	        int sentenceCount = 0;
	  
	        while ((line = bufferedReader.readLine()) != null) {
	            if (line.equals("")) {
	                paraCount += 1;
	            }
	            else {
	                characterCount += line.length();
	                String words[] = line.split("\\s+");
	                wordCount += words.length;
	               
	                String sentence[] = line.split("[!?.:]+");
	                sentenceCount += sentence.length;
	            }
	        }
	        if (sentenceCount >= 1) {
	            paraCount++;
	        }
	        System.out.println("Total word count = "+ wordCount);
	        System.out.println("Total number of lines = "+ sentenceCount);
	        System.out.println("Total number of characters = "+ characterCount);
	        
	        
	    }
	}


