// This program is 
// Last modified Feb/18/2015

import java.io.*;
import java.util.*;
import java.util.Scanner;
import Package.*;

public class Read16s {
     public static void main(String[] args) {
		//Check usage
     	try {
       		if (args.length != 0) {
         		System.err.println("usage: java Read16s "+ "");
        		System.exit(0);
       		}
    String resultFile = "List16s.txt";   	
    PrintStream resultOut = new PrintStream(resultFile);	
	File folder = new File("../genbank-files");
	File[] listOfFiles = folder.listFiles();
	String fileName1 = null;
	for (File file : listOfFiles) {
    	if (file.isFile()) {
        	System.out.println(file.getName());
        	fileName1 = "../genbank-files/" + file.getName();
        	Scanner fileScanner = null;
			try {
			fileScanner = new Scanner(new File(fileName1));
			} catch(FileNotFoundException e) {
			System.err.println("Could not find file '" + fileName1 + "'.");
			System.exit(1);
			}//try
			String line = null;
			if (fileScanner.hasNext()){
			line = fileScanner.nextLine();
				if(line.substring(0,1).equals(">")){
					if (fileScanner.hasNext()){
						resultOut.println(line);
						line = fileScanner.nextLine();
						resultOut.println(line);
					}//if
				}//if
			}//if
    	}//if
	}//for

       System.out.println("Done");
       
       }catch (Exception ex) {
			ex.printStackTrace();
		}//try
     }//main
     
}//class Read16s


