// This program is 
// Last modified Feb/16/2015

import java.io.*;
import java.util.*;
import java.util.Scanner;
import Package.*;

public class RefSoil {
     public static void main(String[] args) {
		//Check usage
     	try {
       		if (args.length != 0) {
         		System.err.println("usage: java RefSoil "+ "");
        		System.exit(0);
       		}
       		
       		String RefList = "refSeqList.csv";
       		String resultFile = "refSeqListInput.txt";
       		ReadFile refSoilList = new ReadFile(RefList,",");
       
       		PrintStream resultOut = new PrintStream(resultFile);
    		for (int i=1 ; i<refSoilList.get().size();i++){
    			for (int j=1; j<refSoilList.get().get(i).size();j++){
    				resultOut.println(refSoilList.get().get(i).get(j));
    			}
    		}
    		
       		System.out.println("Done");
       
       }catch (Exception ex) {
			ex.printStackTrace();
		}//try
     }//main
     
}//class RefSoil


