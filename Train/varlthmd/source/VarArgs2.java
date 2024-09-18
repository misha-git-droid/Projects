/*
	Using the variable length method and standart arguments together
*/

class VarArgs2 {
	
	static void vaTest(String msg, int ... v) {
		System.out.println(msg + v.length);
		System.out.println("Content: ");
		
		for (int i=0; i < v.length; i++) 
			System.out.println(" argument " + i + ": " + v[i]);
			
		System.out.println();
	}
	
	public static void main (String [] args) {
		vaTest(" argument in the parameter variable length ",10);
		vaTest(" arguments in the parameter variable length ", 1, 2, 3);
		vaTest(" arguments in the parameter variable length ");
	}
}