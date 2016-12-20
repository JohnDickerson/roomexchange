BiFunction<Integer, Integer, Integer> ageFunction = (x, y) -> { 
	static int MAX = 5;
	return MAX - Math.abs(x - y);
};
