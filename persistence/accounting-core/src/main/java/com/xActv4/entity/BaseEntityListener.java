package com.xActv4.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class BaseEntityListener {

	@PrePersist
	public void decorateBeforeCreation(BaseEntity baseEntityObject) {
		Date date = Calendar.getInstance().getTime();
		baseEntityObject.setCreatedDatetime(new java.sql.Timestamp(date.getTime()));
		baseEntityObject.setLastChangedDatetime(new java.sql.Timestamp(date.getTime()));
		baseEntityObject.setCreatedByUserId(1l);
		baseEntityObject.setLastChangedByUserId(1l);
	}
	
	@PreUpdate
	public void decorateBeforeUpdation(BaseEntity baseEntityObject) {
		Date date = Calendar.getInstance().getTime();
		baseEntityObject.setLastChangedDatetime(new java.sql.Timestamp(date.getTime()));
		baseEntityObject.setLastChangedByUserId(1l);
	}
}
