package be.example;

import java.io.IOException;




/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	public static void main(String[] args) throws IOException {
		String input="new_profile|id|<Hussain><Amir><Khan>|14-03-1965|<Mumbai><<72><72>>|jkdfgkjie9977.jpg";
		JsonResponse jr= new JsonResponse();
		
		String[] inputArray= input.split("\\|");
		jr.setId(inputArray[1]);
			
	}
		
}
