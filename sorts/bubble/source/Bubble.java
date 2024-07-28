class Bubble {
	public static void main (String [] args) {
		int[] nums = {99, -10, 4, 23, 105, 6578, -9,  22, 0, -1234};
		int a, b, t;
		int size;
		int counter = 0;
		
		size = 10;
		
		System.out.print("The original array");
		for (int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		
		for (a = 1; a < size; a++) {
			for (b = size - 1; b >= a; b--) {
				if (nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
					System.out.println("swap: " + nums[b-1] + " and " + nums[b]);
					System.out.print("Array: ");
					for (int i = 0; i < size; i++)
						System.out.print(" " + nums[i]);
					System.out.println();
				}
				counter++;
				System.out.println(" counter mini rounds " + counter + " ");
			}
			System.out.println(a + " round");
			System.out.print("Array now: ");
			for (int i = 0; i < size; i++)
				System.out.print(" " + nums[i]);
			System.out.println();
		}	
		System.out.print("The sorted array");
		for (int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
	}
}