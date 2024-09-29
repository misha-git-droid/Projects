interface Service {
	
	static int generateValue(int max) {
		int random = (int) (Math.random() * max);
		System.out.println(random);
		return random;
	}
}