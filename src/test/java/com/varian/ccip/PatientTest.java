package com.varian.ccip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varian.ccip.dao.PatientMapper;
import com.varian.ccip.model.Patient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipPatientApplication.class})
public class PatientTest {

    @Autowired
    private PatientMapper patientMapper;

	
	@Test
	public void testSelectByPrimaryKey() {
		Patient patient = patientMapper.selectByPrimaryKey(2);
        System.out.println(patient);
	}
    
	@Test
	public void testFindByPatientSer() {
		Patient patient = patientMapper.findByPatientSer(456l);
        System.out.println(patient);
	}

}
