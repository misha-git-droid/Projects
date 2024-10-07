class Person {
	
	private int lastdebt;
	private String name;
	private int money;
	private Coffee favorite_coffee;
	private boolean admin;
	int sugar;
	//private int[] codes_transactions;
	
	private CoffeeMachine newcm = new CoffeeMachine(); 
	
	String[] list_name = {"Derek", "Alice", "Andrew", "Carol", "James", "Alex"};
	
	Person () {
		name = list_name[Service.generateValue(list_name.length)];
		money = Service.generateValue(350);
		newcm = newcm.getCM(); 
		Coffee[] c = newcm.getListCoffee(); 
		favorite_coffee = c[Service.generateValue(c.length)]; 
		this.admin = admin;
	}
	
	Person (int m) { // для тестов/ указывается  кол-во денег
		name = list_name[Service.generateValue(list_name.length)];
		money = m;
		newcm = newcm.getCM(); 
		Coffee[] c = newcm.getListCoffee(); 
		favorite_coffee = c[Service.generateValue(c.length)]; 
		this.admin = admin;
	}
	
	void buy() throws USErr{
		//Coffee c = getCoffee;
		if (getMoney() >= favorite_coffee.cost) {
			System.out.println("TEST/METH BUY!");
			money -= favorite_coffee.cost;
			System.out.println(name + " has " + money);
			lastdebt += favorite_coffee.cost;
		} else throw new USErr(1);
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
	
	void add_money(int i) {
		//System.out.println("TEST/METH ADD_MONEY!");
		lastdebt = 0;
		money += i;
	}
	
	void getDataAboutPerson() {
		System.out.println("Data: \n" + "Name: " + getName() + "\n" + "Money: " + getMoney() + "\n" + "Type of coffee: " + favorite_coffee.getType());
	}
	
	/*
	void addCodeTrn(int code) {
		
	}
	*/
}