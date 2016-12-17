package com.xActv4.entity.accounting.master;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.xActv4.accounting.master.enums.AccountCategory;
import com.xActv4.entity.BaseEntity;
import com.xActv4.entity.converter.accounting.master.AccountCategoryColumnConverter;

@Entity
@Table(name="GlType")
public class GeneralLedgerType extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name="syscode", nullable=false, length=10)
	private String systemCode;
	
	@Column(name="typeName", nullable=false, length=100)
	private String typeName;

	@Column(name="category", nullable=false)
	@Convert(converter=AccountCategoryColumnConverter.class)
	private AccountCategory category;
	
	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public AccountCategory getCategory() {
		return category;
	}

	public void setCategory(AccountCategory category) {
		this.category = category;
	}

	@Override
	protected String objectValue() {
		StringBuilder value = new StringBuilder();
		value.append("System Code: ["); value.append(systemCode); value.append("];");
		value.append("Type Name: ["); value.append(typeName); value.append("];");
		value.append("Category: ["); value.append(category); value.append("];");
		return value.toString();
	}

}
