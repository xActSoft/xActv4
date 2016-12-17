package com.xActv4.accounting.master.gl;

import com.xActv4.accounting.dto.master.gl.GeneralLedger;

/**
* Domain Service that exposes General Ledger Service Operations
*
* @author  Seetharaman
* @version 4.0
* @since   2016-12-13 
*/
public interface GeneralLedgerService {

	public boolean save(GeneralLedger generalLedger) throws GeneralLedgerException;	
}
