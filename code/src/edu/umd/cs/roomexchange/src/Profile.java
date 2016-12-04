import java.util.ArrayList;
import java.util.List;

public class Profile {

	int gender;
	List <Question> prefs;
	/* Questions I'm starting with:
	 * Yes or no questions
	 	-What is your gender? (0-male, 1-female)
		-Do you smoke? (0-no, 1-yes)
		-Do you have people over frequently?
		-Will you often study in the room?
	 */
	
	public Profile() {
		System.out.println("Let's swap some rooms!");
	}
	
	public Profile(int gender, int smoker, int ppl, int study) {
		prefs = new ArrayList<Question>();
		
	}
	
}
