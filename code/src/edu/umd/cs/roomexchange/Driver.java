package edu.umd.cs.roomexchange;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class Driver {

	public Driver() {
		System.out.println("Let's swap some rooms!");
	}
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		String line;
		int sampleNo = 2;

		File fout = new File("sample.txt");	

		try {
			
			FileOutputStream fos = new FileOutputStream(fout);	
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			for (int i= 0; i < sampleNo; i++) {
				bw.write("New Person"); // for each new person
				
				/* Questions I'm starting with:
				 * Yes or no questions
				 	-What is your gender? (0-male, 1-female)
					-Do you smoke? (0-no, 1-yes)
					-Do you have people over frequently?
					-Will you often study in the room?
				 */
				
				for (int j= 0; j < 4; j++) {
					if (Math.random < 0.5)	
						bw.write("0");
					else
						bw.write("1");
					bw.newLine();
				}
			}
			
			bw.close();
			
			// Now read the values into people objects
			BufferedReader br = new BufferedReader(new FileReader(fout));
			while ((line = br.readLine()) != null) {
				if (line.equals("New Person")) { 
					// create a new person profile/ node in graph
					
					// if (person is smoker)
						// the value is a one
					// else if the person is not a smoker and doesn't care
						// the value should be zero
					// else
						// the value is negative one if the person cares and doesn't smoke
					
					// all the other fields will be generated
				}
				
			}

			br.close();
			
			// Calculate weights for each person
			// for (each person in graph)
				// Implement a lambda function that if a person is a smoker only then only
				// loop through people who don't mind smokers
				
				// Calculate weight for person A->person B
				// Create edge from A->B in graph
			
			// end for
			
			// optimization of graph
				
		} catch (Exception e) {
			System.out.println(hashed);	
		}

		
		System.out.println("successfully found " + i);
				
		} catch (Exception e) {
			System.out.println("issues");	
		}

		
	}

}
