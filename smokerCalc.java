// Answers are in the form of:
// [<Do you smoke>,<Dealbreaker?>]
int smokerWeight(String[] ans1, String[] ans2) {
	// Student 2 smokes and DB for Student 1
	if (ans1[1].equals(ans2[0])) { 
		return -1; 
	}
	
	// Student 1 smokes and DB for Student 2
	else if (ans1[1].equals(ans2[0])) { 
		return -1; 
	}

	// Both students either smoke or don't smoke
	else if (ans1[0].equals(ans2[0])) { 
		return -1; 
	} else { 
		return 0; 
	}
}
