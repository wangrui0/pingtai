package com.example.pingtai.service;

import com.example.pingtai.domain.entity.PerfamazonDemand;
import com.example.pingtai.domain.vo.QueryAmazonDemandParam;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AmazonServiceManager {
    List<PerfamazonDemand> queryAmazonDeman(QueryAmazonDemandParam queryAmazonDemandParam);
}
