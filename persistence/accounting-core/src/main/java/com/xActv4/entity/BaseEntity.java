package com.xActv4.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
* Base class that will be extended by every entity class in the system
*
* @author  rookie
* @version 4.0
* @since   2016-12-17
*/

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreDtTime")
	private Timestamp createdDatetime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastCngDtTime")
	private Timestamp lastChangedDatetime;
	
	@Column(name="CreUserId", nullable=false)
	private Long createdByUserId;
	
	@Column(name="LastCngUserId", nullable=false)
	private Long lastChangedByUserId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getLastChangedDatetime() {
		return lastChangedDatetime;
	}

	public void setLastChangedDatetime(Timestamp lastChangedDatetime) {
		this.lastChangedDatetime = lastChangedDatetime;
	}

	public Long getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(Long createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public Long getLastChangedByUserId() {
		return lastChangedByUserId;
	}

	public void setLastChangedByUserId(Long lastChangedByUserId) {
		this.lastChangedByUserId = lastChangedByUserId;
	}
	
	@Override
	public String toString() {
		StringBuilder value = new StringBuilder();
		value.append("Id: ["); value.append(id); value.append("]");
		value.append("Created User Id: ["); value.append(createdByUserId); value.append("]");
		value.append("Last Changed User Id: ["); value.append(lastChangedByUserId); value.append("]");
		value.append("Created Timestamp: ["); value.append(createdDatetime); value.append("]");
		value.append("Last Changed Timestamp: ["); value.append(lastChangedDatetime); value.append("]");
		value.append(this.objectValue());
		return value.toString();
	}
	
	protected abstract String objectValue();
}
