package com.xActv4.entity.accounting.master;

import static org.junit.Assert.assertNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.xActv4.accounting.master.enums.AccountCategory;
import com.xActv4.entity.repository.accounting.master.GeneralLedgerTypeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:spring-context.xml", "classpath*:dataAccessContext-outOfContainer.xml" })
@Transactional
public class GeneralLedgerTypeSlowTest {
	
	@Autowired
	private GeneralLedgerTypeRepository generalLedgerTypeRepository;

	@Test
	public void CRUDTest() {
		GeneralLedgerType generalLedgerType = createDummy();
		GeneralLedgerType insertedEntity = generalLedgerTypeRepository.save(generalLedgerType);
		
		insertedEntity.setTypeName("another type name");
		
		GeneralLedgerType updatedEntity = generalLedgerTypeRepository.save(insertedEntity);
		
		generalLedgerTypeRepository.delete(updatedEntity);
		
		assertNull(generalLedgerTypeRepository.findOne(insertedEntity.getId()));
		
	}

	private GeneralLedgerType createDummy() {
		GeneralLedgerType generalLedgerType = new GeneralLedgerType();
		
		generalLedgerType.setSystemCode("syscode");
		generalLedgerType.setTypeName("dummy type name");
		generalLedgerType.setCategory(AccountCategory.ASSET);
		Date date = Calendar.getInstance().getTime();
		generalLedgerType.setCreatedDatetime(new java.sql.Timestamp(date.getTime()));
		generalLedgerType.setLastChangedDatetime(new java.sql.Timestamp(date.getTime()));
		generalLedgerType.setCreatedByUserId(1l);
		generalLedgerType.setLastChangedByUserId(1l);
		return generalLedgerType;
	}
}
