
public class Question {

	String name; // Idk if we need this if we just keep the order the same
	int value;
	int placeHolder;
	
	/* Questions I'm starting with:
	 * Yes or no questions
	 	-What is your gender? (0-male, 1-female)
		-Do you smoke? (0-no, 1-yes)
		-Do you have people over frequently?
		-Will you often study in the room?
	 */
	
	public Question() {
		this.name = "default";
		value = -1;
	}
	
	public Question(String qName, int val, int placeHolderForLambdaFunction) {
		this.name = qName;
		this.value = val;
		this.placeHolder = placeHolderForLambdaFunction; // TODO
	}
	
	public int calculate_weight() {
		
		return 0;
	}
	
}
