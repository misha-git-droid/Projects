class CMErr extends Exception {
	int code_err;
	String[] err_msg = {"The coffee machine is dirty. It is not possible to prepare a coffee drink. The refund process has been launched...", 
	"Not enough ingredients", "The money vault is full"};
	//int[] err_codes = {1,2,3};
	
	CMErr(int code) {
		code_err = code;
	}
	
	String chkTypeErr() {
		switch(code_err) {
			case 1:
			return err_msg[0];
			case 2:
			return err_msg[1];
			case 3:
			return err_msg[2];
		}
	return "Unknown error!";
	}
	
	
	public String toString() {
		return "Error number: " + code_err + "\n" + chkTypeErr();
	}
}