class Person {
	
	private lastdebt;
	private String name;
	private int money;
	private Coffee favorite_coffee;
	private boolean admin;
	int sugar;
	//private int[] codes_transactions;
	
	
	Person (String n, int m, Coffee c, boolean admin) {
		name = n;
		money = m;
		favorite_coffee = c;
		this.admin = admin;
	}
	
	boolean buy() {
		Coffee c = getCoffee();
		if (getMoney() >= c.cost) {
			money -= c.cost;
			System.out.println(name + " has " + money);
			lastdebt += c.cost;
			return true;
		}
		return false;
	}
	
	
	
	void add_sugar() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public Coffee getCoffee() {
		return favorite_coffee;
	}
	
	public boolean getAdmin() {
		return admin;
	}
	
	void setLastDebt(int i) {
		lastdebt -= i;
		money += i;
	}
	
	/*
	void addCodeTrn(int code) {
		
	}
	*/
}