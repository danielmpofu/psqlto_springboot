package com.daniel.test.models;

public class Address
{private String id;

public void setId( String id ){
this.id = id;
}

public String getId(){
return id;
}
private String country;

public void setCountry( String country ){
this.country = country;
}

public String getCountry(){
return country;
}
private String name;

public void setName( String name ){
this.name = name;
}

public String getName(){
return name;
}
private String city;

public void setCity( String city ){
this.city = city;
}

public String getCity(){
return city;
}
private String street;

public void setStreet( String street ){
this.street = street;
}

public String getStreet(){
return street;
}
private String ownerId;

public void setOwnerId( String ownerId ){
this.ownerId = ownerId;
}

public String getOwnerId(){
return ownerId;
}
private String proofOfResidency;

public void setProofOfResidency( String proofOfResidency ){
this.proofOfResidency = proofOfResidency;
}

public String getProofOfResidency(){
return proofOfResidency;
}
private boolean deleted;

public void setDeleted( boolean deleted ){
this.deleted = deleted;
}

public boolean getDeleted(){
return deleted;
}
}