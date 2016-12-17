package com.xActv4.entity.repository.accounting.master;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xActv4.entity.accounting.master.GeneralLedgerType;

@Repository
public interface GeneralLedgerTypeRepository extends CrudRepository<GeneralLedgerType, Long> {

}
