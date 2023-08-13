package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class MediaFile
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String uploadPath;
private String fileName;
private String fileExtension;
private String fileSize;
private String filePurpose;
private String fileOwner;
private String dateUploaded;
private boolean deleted;
}