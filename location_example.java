Map<String, Map<String, Integer>> communityDistances = new HashMap<String, HashMap<String, Integer>>();
Map<String, Map<String, Integer>> residentHallDistances = new HashMap<String, HashMap<String, Integer>>();

BiFunction<String[], String[], Integer> locationFunction = (x, y) -> { 
	//String[] = {<Side of Campus>,<Community Name>,<Building Name>}

	Map<String, Map<String, Integer>> community = new HashMap<String, HashMap<String, Integer>>();
	int value;
	
	if (!x[0].equals(y[0])) {
		weight++;
	}

	weight += Math.abs(communityDistances.get(x[1]) - communityDistances.get(y[1]));
	weight += Math.abs(communityDistances.get(x[2]) - communityDistances.get(y[2]));

	return weight;
};