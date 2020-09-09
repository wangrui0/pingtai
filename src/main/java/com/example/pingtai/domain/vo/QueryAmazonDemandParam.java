package com.example.pingtai.domain.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryAmazonDemandParam {
    private Long id;
    private Long demandId;
    private String demandName;

}
