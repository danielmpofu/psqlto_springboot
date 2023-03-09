package com.pgtosqlapp.demo.models;

public class Certificate
{private String id;

public void setId( String  id ){
this.id = id;
}

public String  getId(){
return id;
}
private String name;

public void setName( String  name ){
this.name = name;
}

public String  getName(){
return name;
}
private String type;

public void setType( String  type ){
this.type = type;
}

public String  getType(){
return type;
}
private String institution;

public void setInstitution( String  institution ){
this.institution = institution;
}

public String  getInstitution(){
return institution;
}
private dateAwarded;

public void setDateAwarded(  dateAwarded ){
this.dateAwarded = dateAwarded;
}

public  getDateAwarded(){
return dateAwarded;
}
private String expiry;

public void setExpiry( String  expiry ){
this.expiry = expiry;
}

public String  getExpiry(){
return expiry;
}
private String ownerId;

public void setOwnerId( String  ownerId ){
this.ownerId = ownerId;
}

public String  getOwnerId(){
return ownerId;
}
private String certificateFile;

public void setCertificateFile( String  certificateFile ){
this.certificateFile = certificateFile;
}

public String  getCertificateFile(){
return certificateFile;
}
private boolean verified;

public void setVerified( boolean  verified ){
this.verified = verified;
}

public boolean  getVerified(){
return verified;
}
}