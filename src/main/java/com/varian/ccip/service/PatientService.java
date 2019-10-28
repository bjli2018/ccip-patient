package com.varian.ccip.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varian.ccip.dao.PatientMapper;
import com.varian.ccip.model.Patient;
import com.varian.ccip.model.PatientVO;

@Service
public class PatientService {
    @Autowired
    private PatientMapper patientMapper;
    
    public PatientVO findByPatientSer(Long patientSer) {
    	Patient patient = this.patientMapper.findByPatientSer(patientSer);
    	PatientVO patientVO = new PatientVO();
		BeanUtils.copyProperties(patient, patientVO);
		return patientVO;  	
    }
}
