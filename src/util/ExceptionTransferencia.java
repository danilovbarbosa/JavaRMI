package util;

public class ExceptionTransferencia extends Exception {
	private String msg;

	public ExceptionTransferencia(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
