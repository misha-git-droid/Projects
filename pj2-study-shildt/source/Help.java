/*
	Help system for managing operators
*/

class Help {
	
	void helpOn(int what) {
		switch (what) {
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
			case '6':
				System.out.println("Operator break:\n");
				System.out.println("break; or break mark");
				break;
			case '7':
				System.out.println("Operator continue:\n");
				System.out.println("continue; or continue mark;");
				break;
		}
		System.out.println();
	}
	
	void showMenu() {
		System.out.println("Help for:");
		System.out.println("	1. if");
		System.out.println("	2. switch");
		System.out.println("	3. for");
		System.out.println("	4. while");
		System.out.println("	5. do-while");
		System.out.println("	6. break");
		System.out.println("	7. continue\n");
		System.out.print("Select an option (or q for exit): ");
	}
	
	boolean isValid (int ch) {
		if (ch < '1' | ch > '7' & ch != 'q') return false;
		else return true;
	}
}