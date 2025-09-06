package practice.ete;

import java.util.HashSet;
import java.util.Set;

public class allSubstrings {
	
	public static void printSubstring(String inputString)
	{   Set<String> resultSet=new HashSet<String>();
		for(int i=0;i<inputString.length();i++)
		{
			for(int j=i;j<inputString.length();j++)
			{
				
				resultSet.add(inputString.substring(i, j+1));
			}
		}
		System.out.print(resultSet);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logic to print all the substrings of the given string 
		
       printSubstring("mamatha");
      
	}

}
