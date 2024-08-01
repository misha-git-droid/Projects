/*
	Using the exclusive or operation for encoding and decoding message 
*/

class Encode {
	public static void main (String [] args) {
		var msg = "This is a test";
		var encmsg = "";
		var decmsg = "";
		int key = 88;
		
		System.out.print("Message now: ");
		System.out.println(msg);
		
		for (int i = 0; i < msg.length(); i++)
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
			
		System.out.print("Encoding msg: ");
		System.out.println(encmsg);
		
		for (int i = 0; i < msg.length(); i++) 
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
			
		System.out.print("Decoding msg: ");
		System.out.println(decmsg);
	}
}