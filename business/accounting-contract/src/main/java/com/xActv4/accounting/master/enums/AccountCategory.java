package com.xActv4.accounting.master.enums;

/**
* The Enum defines a ledger type
*
* @author  rookie
* @version 4.0
* @since   2016-12-13 
*/
public enum AccountCategory {

	ASSET("A"),
	LIABILITY("L"),
	INCOME("I"),
	EXPENDITURE("E");
	
	private String type;
	
	private AccountCategory(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
