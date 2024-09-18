class CoffeeMachine implements UI {
	
	boolean power = false;
	//boolean err;
	Coffee c;
	final int COFFEE = 1000;
	final int STORE_MONEY = 1000;
	final int MILK = 1000;
	
	private static Coffee[] list_coffee = {new Coffee("Cappucino", 6, 3, 20), new Coffee("Latte", 6, 2, 15), new Coffee("Americano", 0, 3, 10)};
	
	public static void main (String [] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Person p = new Person("Andrew", 100, list_coffee[0], false);
		cm.choose_coffee(p);
	}
	
	public Coffee choose_coffee(Person person) {
		System.out.println(person.getName() + " is doing an order!");
		c = person.getCoffee();
		System.out.println("He is going to order " + c.getType());
		return c;
	}
	
	public void count_sugar() {
		
	}
	
	public void payment() {
		
	}
	
	public void order() {
		
	}
}