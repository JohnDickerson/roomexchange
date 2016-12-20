BiFunction<Integer, Integer, Integer> ageFunction = (x, y) -> {
	int MAX = 5;
	return MAX - Math.abs(x - y);
};
