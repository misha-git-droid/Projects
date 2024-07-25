/*
	Справочная система по управляющим операторам
*/

class Help {
	public static void main (String [] args) 
		throws java.io.IOException {
		
		char choice, ignore;
		do {
			System.out.println("Help for:");
			System.out.println("	1. if");
			System.out.println("	2. switch");
			System.out.println("	3. for");
			System.out.println("	4. while");
			System.out.println("	5. do-while\n");
			System.out.println("	6. break");
			System.out.println("	7. continue\n");
			System.out.print("Select an option: ")
			
			
			choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while (choice < '1' | choice > '5');
		
		
		
		switch (choice) {
			case '1':
				System.out.println("Operator if:\n");
				System.out.println("if (requirement) operator;");
				System.out.println("else operator;");
				break;
			case '2':
				System.out.println("Traditional operator switch:\n");
				System.out.println("switch (expression) {");
				System.out.println("	case constant:");
				System.out.println("		a sequence of operators");
				System.out.println("		break;");
				System.out.println("	// ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("Cycle for:\n");
				System.out.println("for (initialization; requirement; iteration)");
				System.out.println("	operator;");
				break;
			case '4':
				System.out.println("Cycle while:\n");
				System.out.println("while (requirement) operator;");
				break;
			case '5':
				System.out.println("Cycle do-while:\n");
				System.out.println("do {");
				System.out.println("	operator;");
				System.out.println("} while (requirement);");
				break;
		}
	}
}