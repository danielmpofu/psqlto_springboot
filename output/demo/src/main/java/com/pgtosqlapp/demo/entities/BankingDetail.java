package com.pgtosqlapp.demo.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class BankingDetail
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;

public void setId( String  id ){
this.id = id;
}

public String  getId(){
return id;
}
private String instituteId;

public void setInstituteId( String  instituteId ){
this.instituteId = instituteId;
}

public String  getInstituteId(){
return instituteId;
}
private String bankName;

public void setBankName( String  bankName ){
this.bankName = bankName;
}

public String  getBankName(){
return bankName;
}
private String accountNumber;

public void setAccountNumber( String  accountNumber ){
this.accountNumber = accountNumber;
}

public String  getAccountNumber(){
return accountNumber;
}
private String accountType;

public void setAccountType( String  accountType ){
this.accountType = accountType;
}

public String  getAccountType(){
return accountType;
}
private String currency;

public void setCurrency( String  currency ){
this.currency = currency;
}

public String  getCurrency(){
return currency;
}
private String alternateSignatory;

public void setAlternateSignatory( String  alternateSignatory ){
this.alternateSignatory = alternateSignatory;
}

public String  getAlternateSignatory(){
return alternateSignatory;
}
private String ownerId;

public void setOwnerId( String  ownerId ){
this.ownerId = ownerId;
}

public String  getOwnerId(){
return ownerId;
}
private boolean deleted;

public void setDeleted( boolean  deleted ){
this.deleted = deleted;
}

public boolean  getDeleted(){
return deleted;
}
}