// Игра в угадывание буквы, версия 1
class Guess4 {
	public static void main (String [] args) 
		throws java.io.IOException	{
		char ch, ignore, answer = 'k';
		do {
			System.out.println("Задумана буква между A и Z.");
			System.out.print("Попробуйте её угадать: ");
			
			ch = (char) System.in.read();
			
			
			do {
				ignore = (char) System.in.read();
				System.out.print(" " + ignore);
			} while (ignore != '\n');
			
			
			if (ch == answer) System.out.println("** Right! **");
			else {
				System.out.print("Oh... you didn't guess it. The letter is ");
				if (ch < answer) System.out.println("further down in alphabet.");
				else System.out.println("closer in alphabet.");
				System.out.println("Try again!\n");
			}
		} while (answer != ch);
	}
}