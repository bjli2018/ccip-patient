package com.varian.ccip.model;

public class PatientWithBLOBs extends Patient {
    private byte[] photo;

    private String patientInfo;

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo == null ? null : patientInfo.trim();
    }
}