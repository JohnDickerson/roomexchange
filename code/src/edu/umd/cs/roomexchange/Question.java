package edu.umd.cs.roomexchange;

public class Question {
	
	static int weight = 0;
	static boolean dealbreaker = false;
	
	// ones that seem similar to me
	
	Yes or no questions
	-smoking
	-significant other
	-studying in room
	-
	-religious (v same issue as this one)
	-major (this one will be hard because you'll need a lot of options to calculate differences)
	-sexual orientation
			
	Some kind of ranking/subtraction system
	-going out
	-cleanliness
	-age
	-living near a diner/having a kitchen -- this is yes or no but also ranking-- maybe separate questions
	
	Wasn't sure how to do this one
	-sleep schedule
	
	Absolute Dealbreakers: (requirements of campus)
	-gender

	// What is your gender? Male(0) or female(1) 
	public int calculate_weight(int ans1, int ans2) {
		if (ans1 == ans2)
			weight += 1;
		else 
			dealbreaker = true;
		
		return weight;
	}

	// Are you a smoker? No(0) or Yes(1)
	// How important is it to you that you live with a nonsmoker? Not important at all(0), kind of important(1), dealbreaker.
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 

	// What is your desired location?  
	// Rank your location preference, 7 being most preferred. 
	// How important is it that you live in your desired location? Not important at all(0), kind of important(1), dealbreaker.
	/*North Campus:
	Cambridge Community(1) // these numbers are to remember the own vertex’s location
	Denton Community(2)
	Ellicott Community(3)
	South Campus
	North Hill Community(4)
	South Hill Community(5)
	Leonardtown Community(6)
	Commons(7)*/

	public int calculate_weight(int ans1, int ans2) {
		if (!cares) //doesn’t care where they live
			weight += 7;
		else
			weight += locs[this.loc];
		
		return weight;
	}

	// Rank your cleanliness (1-5), 5 being absolutely spotless. 
	// How important to you is it that your roommate is clean? Not important at all(0), kind of important(1), dealbreaker.
	public int calculate_weight(int ans1, int ans2) {
		if (!cares)
			weight +=5;
		else
			weight += this.cleanliness;
		
		return weight;
	}


	// Rank how often you go out (1-5), 5 being every night. 
	// How important to you is it that your roommate doesn’t go out much? Not important at all(0), kind of important(1), dealbreaker.
	public int calculate_weight(int ans1, int ans2) {
		if (!cares)
			weight +=5;
		else
			weight += 5 - this.daysOut;
		
		return weight;
	}
		

	// Significant Other
	// Do you have a significant other? Yes/No
	// (If Yes) Do you plan on having sleep overs with your significant other at your dorm? Yes/No
	// Is living with a roommate who will have sleepovers with their significant other in your dorm a deal breaker for you? Yes/No
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 
	
	// Usual sleep/waking up time
	// Do you usually go to bed before 12?
	// Do you usually wake up before 10?
	
	// ?
	
	// Prefered place for studying
	// Do you prefer to study in the dorm as opposed to outside of it?
	// Is a roommate who prefers to study in the dorm a deal breaker for you?
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 
	
	// Age 
	// What is your age?
	// Is living with someone older than you a deal breaker to you?
	// Is living with someone younger than you a deal breaker to you?
	public int calculate_weight(int ans1, int ans2) {
		if (!cares)
			weight +=3;
		else
			weight += 3 - this.year;
		
		return weight;
	}
			
	// Religion/Religious?
	// Are you religious?
	// (IF WE CAN ASK) What is your religion?
	// Is living with someone who is religious a deal breaker to you?
	// Is living with someone who is a different religion than you a deal breaker?
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 
			
	// Major (preference)
	// What is your major?
	// Do you prefer to live with a similar major?
	// Is living with someone who is a different type of major a deal breaker?
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 
			
	// AC/no AC (If you are moving out)
	// Is no AC a deal breaker to you?
	// AC/no AC (If your roommate is moving out)
	// Does your room have AC? 
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 
			
	// Having a kitchen (preference)
	// Meal Plan? (I don’t think this matters)
	// Are you on the meal plan?
	// If so, rank your the importance of being close to a Diner
	// ?
	
	// Sexual Orientation
	// What is your sexual orientation? Gay/Straight
	// Is living with someone who is gay a deal breaker?
	public int calculate_weight(int ans1, int ans2) {
		if (!cares || (cares && !this.smoker)) //yes doesn’t care or the rommie doesn’t smoke
			weight += 1;
	 
		return weight;
	} 
			
}
