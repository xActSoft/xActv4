package com.xActv4.entity.repository.accounting.master;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xActv4.entity.accounting.master.GeneralLedgerType;

@Repository
public interface GeneralLedgerTypeRepository extends CrudRepository<GeneralLedgerType, Long> {

	@Query("SELECT glType FROM GeneralLedgerType glType WHERE LOWER(glType.systemCode) = LOWER(:syscode)")
	public GeneralLedgerType findGeneralLedgerTypeBySysCode(@Param("syscode") String syscode);
	
}
