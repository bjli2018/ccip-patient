package com.varian.ccip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.varian.ccip.model.PatientVO;
import com.varian.ccip.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
	
	@GetMapping("search")
	@ResponseBody
	public PatientVO findByPatientSer(@RequestParam("patientSer")Long patientSer) {
		return this.patientService.findByPatientSer(patientSer);
		
	}
}
