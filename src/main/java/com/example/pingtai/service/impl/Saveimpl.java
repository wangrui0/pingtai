package com.example.pingtai.service.impl;

import com.example.pingtai.domain.entity.LarkCaseCommon;
import com.example.pingtai.mapper.LarkCaseCommonMapper;
import com.example.pingtai.service.Save;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Saveimpl implements Save {
    @Autowired
    private LarkCaseCommonMapper larkCaseCommonMapper;




  /*  @Override
    public void demo() {
        LarkCaseCommon larkCaseCommon = new LarkCaseCommon();
        larkCaseCommon.setCaseId("ddd");
        larkCaseCommonMapper.insert(larkCaseCommon);
    }*/

    @Override
    public int save(LarkCaseCommon larkCaseCommon) {
        int insert = larkCaseCommonMapper.insert(larkCaseCommon);
        return insert;

    }
}
