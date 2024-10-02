class FileHelp {
	public static void main (String [] args) {
		Help hlobj = new Help("helpfile.txt");
		String topic;
		
		System.out.println("Demostration working FileHelp. " + 
		"For stopping enter stop.");
		
		do {
			topic = hlobj.getSelection();
			
			if (!hlobj.helpOn(topic))
				System.out.println("The topic was not found!");
		} while (topic.compareTo("stop") != 0);
	}
}