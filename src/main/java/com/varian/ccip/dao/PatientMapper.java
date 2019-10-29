package com.varian.ccip.dao;

import org.apache.ibatis.annotations.Param;

import com.varian.ccip.model.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKeyWithBLOBs(Patient record);

    int updateByPrimaryKey(Patient record);
    
    Patient findByPatientSer(@Param("patientSer") Long patientSer);
}