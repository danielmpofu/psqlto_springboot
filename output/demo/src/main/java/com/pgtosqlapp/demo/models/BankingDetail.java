package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class BankingDetail
{private String id;
private String instituteId;
private String bankName;
private String accountNumber;
private String accountType;
private String currency;
private String alternateSignatory;
private String ownerId;
private boolean deleted;
}