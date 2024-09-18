class Stack {

	Stack(int size) {
		arr = new char[size];
	}

	private char[] arr;
	private int putloc, getloc = 0;
	
	
	//get size array
	int getSize() {
		return arr.length;
	}
	
	// add the element in queue
	void push(char ch) {
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
		Stack s = new Stack(10);
		
		int count = 0;
		for (int i = 'a'; count < s.getSize(); i++) {
			s.push((char) i);
			count++;
		}
		
		for (int i = 0; i < s.getSize(); i++) {
			s.pop();
			count++;
		}	
	}
}