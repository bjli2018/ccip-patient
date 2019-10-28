package com.varian.ccip.model;

import java.util.Date;

import lombok.Data;

@Data
public class Patient {
    private Integer id;

    private String vip;

    private String hisId;

    private String vId;

    private String pinyin;

    private String address;

    private String contactName;

    private String contactAddress;

    private String contactHomePhone;

    private String contactWorkPhone;

    private String contactMobilePhone;

    private String contactRelationship;

    private Date birthDate;

    private String homePhone;

    private String workPhone;

    private String mobilePhone;

    private String nationalId;

    private String chineseName;

    private String citizenship;

    private String englishName;

    private String ethnicGroup;

    private String radiationId;

    private String maritalStatus;

    private String patientStatus;

    private String patientHistory;

    private String createdUser;

    private Date createdDate;

    private String lastUpdatedUser;

    private Date lastUpdatedDate;

    private Long patientSer;

    private String gender;

    private String id1;
}