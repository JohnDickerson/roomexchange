// String[] are in format of:
// [<Side of Campus>,<Community Name>,<Building Name>]
int locationWeight(String[] ans1, String[] ans2) { 

	int weight = 0;
	
	// Increase weight if on same side of campus
	if (ans1[0].equals(ans2[0])) { weight++; }

	// Increase weight if in same community
	if (ans1[1].equals(ans2[1])) { weight++; }

	// Incease weight if same building
	if (ans1[2].equals(ans2[2])) { weight++; }

	return weight;
}