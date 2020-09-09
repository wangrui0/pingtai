package com.example.pingtai.mapper;

import com.example.pingtai.domain.entity.LarkCaseCommon;
import org.springframework.stereotype.Repository;

@Repository
public interface LarkCaseCommonMapper {

    int deleteByPrimaryKey(Integer id);
    int insert(LarkCaseCommon record);
    int insertSelective(LarkCaseCommon record);
    LarkCaseCommon selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(LarkCaseCommon record);
    int updateByPrimaryKey(LarkCaseCommon record);
}
