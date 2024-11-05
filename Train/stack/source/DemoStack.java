class Stack<T> {

	private T[] arr;
	private int putloc, getloc = 0;

	public Stack(T[] arrs) {
		arr = arrs;
	}
	
	
	//get size array
	int getSize() {
		return arr.length;
	}
	
	// add the element in queue
	void push(T ch) {
		if (putloc == arr.length)  {
			System.out.println("Queue is full");
			return;
		}
		arr[putloc] = ch;
		putloc++;
		System.out.println("The element " + ch + " added");
	}
	// delete the element from the queue
	void pop() {
		if (getloc == putloc) {
			System.out.println("The queue is empty");
			return;
		}
		System.out.println("Delete " + arr[getloc] + " from the queue!");
		getloc++;
	}
	
}

class DemoStack {
	public static void main (String [] args) {
		
		Stack<Character> s = new Stack<>(new Character[10]);
		
		int count = 0;
		for (int i = 'a'; count < s.getSize(); i++) {
			s.push((char) i);
			count++;
		}
		
		for (int i = 0; i < s.getSize(); i++) {
			s.pop();
			count++;
		}
		
		count = 0; обнулить переменную перед созданием нового стека 
		
		Stack<Integer> iNt = new Stack<>(new Integer[10]);
		
		for (int i = 1; count < iNt.getSize(); i++) {
			iNt.push(i);
			count++;
		}
		
		for (int i = 0; i < iNt.getSize(); i++) {
			iNt.pop();
			count++;
		}
	}
}