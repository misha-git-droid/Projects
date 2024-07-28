class HelpClassDemo {
	public static void main (String [] args) 
	throws java.io.IOException {		
		char ignore, choice;
		Help hlpobj = new Help();
		for(;;) {
			do {
				hlpobj.showMenu();
				choice = (char) System.in.read(); //get symbol 
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while (!hlpobj.isValid(choice));
			if (choice  == 'q') break;
			System.out.println("\n");
			hlpobj.helpOn(choice);
			
			// make a loop that will check if the user wants to log out
		}
	}
}