package com.pgtosqlapp.demo.models;

public class Contact
{private String id;

public void setId( String  id ){
this.id = id;
}

public String  getId(){
return id;
}
private boolean isPrimary;

public void setIsPrimary( boolean  isPrimary ){
this.isPrimary = isPrimary;
}

public boolean  getIsPrimary(){
return isPrimary;
}
}