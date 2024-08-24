/*
	Using the variable length method
*/

class VarArgs {
	
	static void vaTest(int ... v) {
		System.out.println("Number of arguments: " + v.length);
		System.out.println("Content: ");
		
		for (int i=0; i < v.length; i++) 
			System.out.println(" argument " + i + ": " + v[i]);
			
		System.out.println();
	}
	
	public static void main (String [] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}