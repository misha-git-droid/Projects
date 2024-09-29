class Coffee {
	
	String type;
	int milk;
	int coffee;
	int cost;
	int sugar = 0;
	
	
	Coffee(String t, int m, int ce, int ct) {
		type = t;
		milk = m;
		coffee = ce;
		cost = ct;
	}
	
	String getType() {
		return type;
	}
}