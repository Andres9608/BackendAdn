package com.ceiba.demo.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.AccessType;
import javax.persistence.Column;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable {
	private static final long serialVersionUID = -6326211126367055587L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable= false)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
