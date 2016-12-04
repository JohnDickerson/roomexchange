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
			
			// Now read the values into people objects
			BufferedReader brHash = new BufferedReader(new FileReader(fout));
			while ((currHash = brHash.readLine()) != null) {
				
				BufferedReader br = new BufferedReader(new FileReader(passIn));
				found = false;
				while ((line = br.readLine()) != null && found == false) {
					hashed = "CMSC414" + line + "Fall16";
					hashed = getSha256(hashed);
				
					if (hashed.equals(currHash)) {
						System.out.println("found: " + hashed);
						bw.write(line);
						bw.newLine();
						found = true;
						i++;
					}
				}
			}

			bw.close();
				
		} catch (Exception e) {
			System.out.println(hashed);	
		}

		
		System.out.println("successfully found " + i);
				
		} catch (Exception e) {
			System.out.println("issues");	
		}

		
	}

}
