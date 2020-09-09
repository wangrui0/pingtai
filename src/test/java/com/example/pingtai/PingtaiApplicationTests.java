package com.example.pingtai;

import com.example.pingtai.domain.entity.LarkCaseCommon;
import com.example.pingtai.mapper.LarkCaseCommonMapper;
import com.example.pingtai.service.Save;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class PingtaiApplicationTests {
    @Autowired
    private Save save;
    @Autowired
    private LarkCaseCommonMapper larkCaseCommonMapper;


    @Test
    void save() {
        LarkCaseCommon larkCaseCommon = new LarkCaseCommon();
        larkCaseCommon.setCaseId("今天");
        larkCaseCommon.setCommonAppidId("分享");
        larkCaseCommon.setCommonDataId("购后");
        larkCaseCommon.getCaseId();
        larkCaseCommon.getCommonAppidId();
        larkCaseCommon.getCommonDataId();

        int save = this.save.save(larkCaseCommon);
        assertEquals(save,1);


    }
    @Test
    void savemapper() {
        LarkCaseCommon larkCaseCommon = new LarkCaseCommon();
        larkCaseCommon.setCaseId("购后");
        larkCaseCommon.setCommonAppidId("弹窗");
        larkCaseCommon.setCommonDataId("项目");
        int save = larkCaseCommonMapper.insert(larkCaseCommon);
        assertEquals(save,1);


    }


}
