package com.pgtosqlapp.demo.models;

public class MediaFile
{private String id;

public void setId( String  id ){
this.id = id;
}

public String  getId(){
return id;
}
private String uploadPath;

public void setUploadPath( String  uploadPath ){
this.uploadPath = uploadPath;
}

public String  getUploadPath(){
return uploadPath;
}
private String fileName;

public void setFileName( String  fileName ){
this.fileName = fileName;
}

public String  getFileName(){
return fileName;
}
private String fileExtension;

public void setFileExtension( String  fileExtension ){
this.fileExtension = fileExtension;
}

public String  getFileExtension(){
return fileExtension;
}
private fileSize;

public void setFileSize(  fileSize ){
this.fileSize = fileSize;
}

public  getFileSize(){
return fileSize;
}
private String filePurpose;

public void setFilePurpose( String  filePurpose ){
this.filePurpose = filePurpose;
}

public String  getFilePurpose(){
return filePurpose;
}
private String fileOwner;

public void setFileOwner( String  fileOwner ){
this.fileOwner = fileOwner;
}

public String  getFileOwner(){
return fileOwner;
}
private String dateUploaded;

public void setDateUploaded( String  dateUploaded ){
this.dateUploaded = dateUploaded;
}

public String  getDateUploaded(){
return dateUploaded;
}
private boolean deleted;

public void setDeleted( boolean  deleted ){
this.deleted = deleted;
}

public boolean  getDeleted(){
return deleted;
}
}