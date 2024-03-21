package com.main.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="Jpa_Doctor_Info")
@Entity
public class Doctor 
{
	 @SequenceGenerator(name="gen1", sequenceName = "JPA_DOCTOR_INFO_SEQ", initialValue = 30000, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	 @Id
	 @Column(name="DOC_ID")
     private Integer docId;
	 
	 @Column(name="DOC_NAME")
     private String docName;
	 
	 @Column(name="INCOME")
	 private Float income;
	 
	 @Column(name="SPECIALIZATION")
     private String specialization;
}
