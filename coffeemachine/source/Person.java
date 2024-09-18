class Person {
	
	private String name;
	private int money;
	private Coffee favorite_coffee;
	private boolean admin;
	
	
	Person (String n, int m, Coffee c, boolean admin) {
		name = n;
		money = m;
		favorite_coffee = c;
		this.admin = admin;
	}
	
	void buy() {
		
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
	
}