
public class Question {

	String name; // Idk if we need this if we just keep the order the same
	int value;
	BiFunction<Integer, Integer, Integer> weightFunction;
	
	/* Questions I'm starting with:
	 * Yes or no questions
	 	-What is your gender? (0-male, 1-female)
		-Do you smoke? (0-no, 1-yes)
		-Do you have people over frequently?
		-Will you often study in the room?
	 */
	
	public Question() { //do we need this?
		this.name = "default";
		value = -1;
	}
	
	public Question(String qName, int val, BiFunction<Integer, Integer, Integer> weightFunction) {
		this.name = qName;
		this.value = val;
		this.weightFunction = weightFunction; // TODO
	}
	
	public int calculate_weight(Answer answer1, Answer answer2) {
		//return weightFunction.apply(answer1, answer2);
		//Are we going to have answer object? Will the  
		//int value of an answer object be stored as a field?
		return 0;
	}
	
}
