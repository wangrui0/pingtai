package com.example.pingtai.service.impl;

import com.example.pingtai.enums.OrderCondition;
import com.example.pingtai.enums.SortType;
import com.example.pingtai.domain.entity.PerfamazonDemand;
import com.example.pingtai.domain.entity.PerfamazonDemandExample;
import com.example.pingtai.domain.vo.QueryAmazonDemandParam;
import com.example.pingtai.mapper.PerfamazonDemandMapper;
import com.example.pingtai.service.AmazonServiceManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class AmazonServiceManagerImpl implements AmazonServiceManager {

    @Autowired
    private PerfamazonDemandMapper perfamazonDemandMapper;


    @Override
    public List<PerfamazonDemand> queryAmazonDeman(QueryAmazonDemandParam queryAmazonDemandParam ) {
        log.info("查询列表:{},参数:{}","queryAmazonDeman",queryAmazonDemandParam);

        Long demondId = queryAmazonDemandParam.getDemandId();
        String demondName = queryAmazonDemandParam.getDemandName();
        Long id = queryAmazonDemandParam.getId();
        //if (demondId == null && demondName == null && id == null) {
        //    log.error("查询amazonDemond表，参数NPE PARAM: " + queryAmazonDemondParam.toString());
        //}
        PerfamazonDemandExample perfamazonDemandExample = new PerfamazonDemandExample();
        PerfamazonDemandExample.Criteria criteria = perfamazonDemandExample.createCriteria();
        if (demondId != null) {

             criteria.andDemandIdEqualTo(demondId);
        }


        perfamazonDemandExample.appendOrderByClause(OrderCondition.ID,
                SortType.DESC).appendOrderByClause(OrderCondition.ENDTIME, SortType.DESC);

        if (demondName != null) {
            demondName = "%" + demondName + "%";
            criteria.andDemandNameLike(demondName);
        }

        if (id != null) {
            criteria.andIdEqualTo(id);
        }

        List<PerfamazonDemand> gtxPerfAmazonDemondDOS =  perfamazonDemandMapper.selectByExample(perfamazonDemandExample);

        if (gtxPerfAmazonDemondDOS.isEmpty()) {
            log.error("查询AmazonDemond表，未查询到任何数据！ param: " + gtxPerfAmazonDemondDOS.toString());

        }


        ArrayList<String> strings = new ArrayList<>();






        return gtxPerfAmazonDemondDOS;
    }
}
