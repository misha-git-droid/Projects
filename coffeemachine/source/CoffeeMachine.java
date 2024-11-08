/*
	Функции, которые хочу внести:
	1. Создание класса банка 
		- Переменная для хранения только электронных финансов person
		- Хранение списка клиентов банка (объект person, логин, пароль)
		- 
	2. Администратор person, обладающий возможностью снятия денег с банкомата
	

*/

class CoffeeMachine implements UI, Service {
	
	
	//boolean err;
	private boolean power = false;
	private int intermediate_storage;
	private int storage_money = 0;
	private int coffee = 1000;
	final int MAX_STORAGE_MONEY = 1000;
	private int milk = 1000;
	public static CoffeeMachine cm;
	private boolean normal = true; //состояние кофемашины. Указывается для тестов
	
	private static Coffee[] list_coffee = {new Coffee("Cappucino", 50, 30, 25), new Coffee("Latte", 43, 75, 66), new Coffee("Espresso", 55, 23, 11)};
	
	public static void main (String [] args) {
		cm = new CoffeeMachine();
		//cm.go();
		
		//setup of person
		Person p = new Person(100);
		p.getDataAboutPerson(); 
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
		Coffee c = choose_coffee(person); 
		//проверка на достаточность ингредиентов
		try {
			if ((c.milk > milk) || (c.coffee > coffee)) {
				throw new CMErr(2);
			}
		}
		catch (CMErr exc) {
			System.out.println(exc);
			return;
		}
		
		System.out.println("There are enough ingredients"); 
		
		//процесс оплаты
		try {
			payment(person); 
		}
		catch (USErr | CMErr exc) {
			System.out.println(exc);
			return;
		}
		
		coffee -= c.coffee;
		milk -= c.milk;
		System.out.print("Making a drink");
		
		try {
			for (int i = 0; i < 7; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		System.out.println();
		System.out.println("Your drink is ready!");
		
		System.out.println("ADD TO LOGS: " + "In the coffeemachine coffee: " + coffee +
							" milk: " + milk);
		
		// в дальнейшем сделать проверку на работоспособность аппарата, коды ошибок аппарата 
	}
	
	void back_money(Person p) {
		
		//System.out.println("TEST/METH BACK_MONEY!");
		p.add_money(intermediate_storage);
		intermediate_storage = 0;
		
		System.out.println("Money refund!");
	}
	
	public void payment(Person p) throws CMErr,  USErr {
		try {
			p.buy(); 
		}
		catch (USErr exc) {
			throw exc;
			//return;
		}
		
		System.out.println("There are enough money"); 
		
		intermediate_storage += p.getCoffee().cost;
		
		System.out.println("The money is credited to the intermediate storage");
		
		
		if (!normal) {
			System.out.println("TEST/METH CHKERROR!");
			System.out.println("The refund process has been launched...");
			back_money(p);
			throw new CMErr(4);
			//return;
		}
		
		storage_money = intermediate_storage;
		System.out.println("The money was credited to the account of the coffee machine");
	}
		

		
	
	
	public void count_sugar() {
		
	}
	
	public Coffee[] getListCoffee() {
		return list_coffee;
	}
	
	public CoffeeMachine getCM() {
		return cm;
	}
	
	
	
	public void order() {
		
	}
	
	/* 
		
	void generate_transaction() {
		
	}
	*/
	
	
	int chkErr() {
		//return -1;
		return 1;
	}
	
	
	
	/*
	public int enter() 
		throws java.io.IOException {
		return System.in.read();
	}
	*/
}