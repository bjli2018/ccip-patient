package com.varian.ccip;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.varian.ccip.dao.entity.PatientIdentifier;
import com.varian.ccip.dao.mapper.PatientIdentifierMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipPatientApplication.class})
public class PatientIdentifierDaoTest {

    @Autowired
    private PatientIdentifierMapper patientIdentifierMapper;

	
	@Test
	public void testAddPatientIdentifier() {
		PatientIdentifier entity = new PatientIdentifier();
		entity.setValue("look very good");
		entity.setType("1");
		int isSuccess = patientIdentifierMapper.insert(entity);
        System.out.println("isSuccess=" + (isSuccess==1?true:false));
	}
	
	@Test
	public void testUpdatePatientIdentifier() {
		PatientIdentifier entity = new PatientIdentifier();
		entity.setId(3);
		entity.setValue("look very good!!!");
		int isSuccess = patientIdentifierMapper.updateById(entity);
        System.out.println("isSuccess=" + (isSuccess==1?true:false));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testUpdate2PatientIdentifier() {
		AbstractWrapper wrapper = new UpdateWrapper();
		wrapper.eq("type", "1");
		PatientIdentifier entity = new PatientIdentifier();
		entity.setValue("look very good!!!HaHaHa");
		int isSuccess = patientIdentifierMapper.update(entity,wrapper);
        System.out.println("isSuccess=" + (isSuccess==1?true:false));
	}
	
	@Test
	public void testDeletePatientIdentifier() {
		int isSuccess = patientIdentifierMapper.deleteById(3);
        System.out.println("isSuccess=" + (isSuccess==1?true:false));
	}
	
	@Test
	public void testSelectList() {
		List<PatientIdentifier> list = patientIdentifierMapper.selectList(null);
		list.forEach(System.out::println);
	}
	
	@Test
	public void testGetPatientIdentifiers() {
		List<PatientIdentifier> list = patientIdentifierMapper.getPatientIdentifiers();
		list.forEach(System.out::println);
	}
}
