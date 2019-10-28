package com.varian.ccip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varian.ccip.model.PatientVO;
import com.varian.ccip.service.PatientService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipPatientApplication.class})
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

	@Test
	public void testFindByPatientSer() {
		PatientVO patientVO = patientService.findByPatientSer(123l);
        System.out.println(patientVO);
	}

}
