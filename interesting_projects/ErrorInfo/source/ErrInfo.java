class Err {
	String msg;
	int severity;
	
	Err(String m, int s) {
		msg = m; severity = s;
	}
}

class ErrorInfo {
	String[] msgs = {
		"output error",
		"input error",
		"the disk is crowding",
		"the index goes beyond the bounds of the array"
	};
	int[] howBad = {3, 3, 2, 4};
	
	Err getErrorInfo(int i) {
		if (i >= 0 & i < msgs.length) 
		  return new Err(msgs[i], howBad[i]);
		else 
		  return new Err("non-existent error code", 0);
	}
}

class ErrInfo {
	public static void main (String [] args) {
		ErrorInfo err = new ErrorInfo();
		Err e;
		e = err.getErrorInfo(2);
		System.out.println(e.msg + ", level severity: " + e.severity);
		e = err.getErrorInfo(19);
		System.out.println(e.msg + ", level severity: " + e.severity);
	}
}