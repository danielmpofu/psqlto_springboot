package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class BankingDetail
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String instituteId;
private String bankName;
private String accountNumber;
private String accountType;
private String currency;
private String alternateSignatory;
private String ownerId;
private boolean deleted;
}