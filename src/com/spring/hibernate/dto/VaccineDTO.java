package com.spring.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Vaccine_table")
public class VaccineDTO {

    @Id
    @Column(name="vaccine_id")
	private int vaccineId;
    @Column(name="vaccine_name")
	private String vaccine_name;
    @Column(name="developed_by")
	private String developedBy;
    @Column(name="ready_to_use")
	private boolean readyToUse;
	
	public void VaccineDTO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}
	
}

