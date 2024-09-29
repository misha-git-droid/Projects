class USErr extends Exception {
	int code_err;
	String[] err_msg = {"Not enough money!"};
	
	USErr(int code) {
		code_err = code;
	}
	
	String chkTypeErr() {
		switch(code_err) {
			case 1:
			return err_msg[0];
		}
	return "Unknown error!";
	}
	
	
	public String toString() {
		return "Error number: " + code_err + "\n" + chkTypeErr();
	}
}