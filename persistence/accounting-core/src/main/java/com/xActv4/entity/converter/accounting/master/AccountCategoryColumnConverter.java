package com.xActv4.entity.converter.accounting.master;

import javax.persistence.AttributeConverter;

import com.xActv4.accounting.master.enums.AccountCategory;

public class AccountCategoryColumnConverter implements AttributeConverter<AccountCategory, String> {

	@Override
	public String convertToDatabaseColumn(AccountCategory attribute) {
		return attribute.getType();
	}

	@Override
	public AccountCategory convertToEntityAttribute(String dbData) {
		if (AccountCategory.ASSET.getType().equals(dbData)) {
			return AccountCategory.ASSET;
		} else if (AccountCategory.LIABILITY.getType().equals(dbData)) {
			return AccountCategory.LIABILITY;
		} else if (AccountCategory.INCOME.getType().equals(dbData)) {
			return AccountCategory.INCOME;
		} else if (AccountCategory.EXPENDITURE.getType().equals(dbData)) {
			return AccountCategory.EXPENDITURE;
		} 
		
		throw new IllegalArgumentException("Unknown value: " + dbData);
	}


}
