package com.daniel.test.models;

public class PeopleRelationship
{private String id;

public void setId( String id ){
this.id = id;
}

public String getId(){
return id;
}
private String relationship;

public void setRelationship( String relationship ){
this.relationship = relationship;
}

public String getRelationship(){
return relationship;
}
private String ownerId;

public void setOwnerId( String ownerId ){
this.ownerId = ownerId;
}

public String getOwnerId(){
return ownerId;
}
private String otherPerson;

public void setOtherPerson( String otherPerson ){
this.otherPerson = otherPerson;
}

public String getOtherPerson(){
return otherPerson;
}
private boolean deleted;

public void setDeleted( boolean deleted ){
this.deleted = deleted;
}

public boolean getDeleted(){
return deleted;
}
}