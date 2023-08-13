package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class MediaFile
{private String id;
private String uploadPath;
private String fileName;
private String fileExtension;
private String fileSize;
private String filePurpose;
private String fileOwner;
private String dateUploaded;
private boolean deleted;
}