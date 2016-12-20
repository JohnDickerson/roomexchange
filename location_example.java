Map<String, Map<String, Integer>> communityDistance, residentHallDistance;

BiFunction<String[], String[], Integer> locationFunction = (x, y) -> { 
	//String[] = {<Side of Campus>,<Community Name>,<Building Name>}

	int weight = 0;
	
	if (!x[0].equals(y[0])) {
		weight++;
	}

	weight += Math.abs(communityDistance.get(x[1]).get(y[1]);
	weight += Math.abs(residentHallDistance.get(x[2]).get(y[1])

	return weight;
};