package com.xActv4.accounting.master.gl;

public class GeneralLedgerException extends Exception {

	private static final long serialVersionUID = 1L;

	public GeneralLedgerException(String message) {
		super(message);
	}
	
	public GeneralLedgerException(Throwable cause) {
		super(cause);
	}
}
