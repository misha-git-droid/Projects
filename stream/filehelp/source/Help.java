import java.io.*;

class Help {
	String helpfile;
	
	Help(String fname) {
		helpfile = fname;
	}
	
	boolean helpOn(String what) {
		int ch;
		String topic, info;
		
		try (BufferedReader helpRdr = 
			new BufferedReader(new FileReader(helpfile))) 
		{
			do {
				ch = helpRdr.read();
				
				if (ch == '#') {
					topic = helpRdr.readLine();
					if (what.compareTo(topic) == 0) {
						do {
							info = helpRdr.readLine();
							if (info != null) System.out.println(info);
						} while ((info != null) && 
						(info.compareTo("") != 0));
						return true;
					}
				}
			} while (ch != -1);
		}
		catch (IOException exc) {
			System.out.println("Error of access to the help file");
			return false;
		}
		return false;
	}
	
	String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in, System.console().charset()));
		System.out.println("Enter name topic: ");
		try {
			topic = br.readLine();
		}
		catch (IOException exc) {
			System.out.println("Error during reading with console");
		}
		return topic;
	}
}