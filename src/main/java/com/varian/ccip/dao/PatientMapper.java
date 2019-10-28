package com.varian.ccip.dao;

import org.apache.ibatis.annotations.Param;

import com.varian.ccip.model.Patient;
import com.varian.ccip.model.PatientWithBLOBs;

public interface PatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientWithBLOBs record);

    int insertSelective(PatientWithBLOBs record);

    PatientWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatientWithBLOBs record);

    int updateByPrimaryKey(Patient record);
    
    Patient findByPatientSer(@Param("patientSer") Long patientSer);
}