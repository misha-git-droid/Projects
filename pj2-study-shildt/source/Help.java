/*
	Справочная система по управляющим операторам
*/

class Help {
	public static void main (String [] args) {
		throws java.io.IOException {
		
		char choice, ignore;
		do {
			System.out.println("Help for:");
			System.out.println("	1. if");
			System.out.println("	2. switch");
			System.out.println("	3. for");
			System.out.println("	4. while");
			System.out.println("	5. do-while\n");
			System.out.println("Select an option ");
			
			choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != \n);
		} while (choice < '1' | choice > '5');
		
		}
		
		switch (choice) {
			case '1':
			System.out.println("Оператор if:\n");
			System.out.println("if (условие) оерп");
		}
	}
}