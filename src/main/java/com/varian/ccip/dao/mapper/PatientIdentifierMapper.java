package com.varian.ccip.dao.mapper;

import com.varian.ccip.dao.entity.PatientIdentifier;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bob
 * @since 2019-11-07
 */
public interface PatientIdentifierMapper extends BaseMapper<PatientIdentifier> {
	List<PatientIdentifier> getPatientIdentifiers();
}
