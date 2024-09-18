class CoffeeMachine implements UI {
	
	
	//boolean err;
	private int power = 0;
	private int intermediate_storage;
	final int COFFEE = 1000;
	final int MAX_STORAGE_MONEY = 1000;
	private int min_storage_money = 0;
	final int MILK = 1000;
	CoffeeMachine cm;
	
	private static Coffee[] list_coffee = {new Coffee("Cappucino", 6, 3, 20), new Coffee("Latte", 6, 2, 15), new Coffee("Americano", 0, 3, 10)};
	
	public static void main (String [] args) {
		
		
		cm = new CoffeeMachine();
		//cm.go();
		Person p = new Person("Andrew", 100, list_coffee[0], false);
		Coffee c = cm.choose_coffee(p);
		cm.cooking_coffee(p);
		
	}
	
	void go() {
		
	}
	
	public Coffee choose_coffee(Person person) {
		System.out.println(person.getName() + " is doing an order!");
		Coffee c = person.getCoffee();
		System.out.println("He is going to order " + c.getType());
		return c;
	}
	
	public void cooking_coffee(Person person) {
		Coffee c = person.getCoffee();
		if ((c.milk > MILK) | (c.coffee > COFFEE)) {
			System.out.println("There are not enough ingredients!");
			return;
		}
		
		System.out.println("There are enough ingredients"); //test
		
		if (!person.buy()) {
			System.out.println("Not enough money!");
			return;
		}
		
		System.out.println("There are enough money"); //test
		
		intermediate_storage += c.cost;
		
		System.out.println("The money is credited to the intermediate storage");
		
		if (chkErr == -1) {
			//intermediate_storage -= c.cost;
			System.out.println("The refund process has been launched...");
			cm.back_money(person);
		}
		
		
		System.out.println("Making a drink...");
		
		// в дальнейшем сделать проверку на работоспособность аппарата, коды ошибок аппарата 
	}
	
	void back_money(Person p) {
		System.out.println("Money refund!");
		p.setLastDebt(intermediate_storage)
	}
	
	public void count_sugar() {
		
	}
	
	public void payment() {
		
	}
	
	public void order() {
		
	}
	
	void generate_code_transaction() {
		
	}
	
	int chkErr() {
		return 0;
	}
	
	
	
	/*
	public int enter() 
		throws java.io.IOException {
		return System.in.read();
	}
	*/
}