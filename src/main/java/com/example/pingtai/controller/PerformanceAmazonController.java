
package com.example.pingtai.controller;
import com.example.pingtai.domain.entity.LarkCaseCommon;
import com.example.pingtai.service.AmazonServiceManager;
import com.example.pingtai.service.Save;
import org.apache.commons.lang3.StringUtils;

import com.example.pingtai.domain.entity.PerfamazonDemand;
import com.example.pingtai.domain.vo.QueryAmazonDemandParam;
import com.example.pingtai.domain.vo.ResultDo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/controller")
public class PerformanceAmazonController {

 /* @Autowired
    private Save save;
    @PostMapping("/save")
    public void Save(@RequestBody LarkCaseCommon larkCaseCommon){

        save.save(larkCaseCommon);
    }*/


    @Autowired
    private AmazonServiceManager amazonServiceManager;

    @RequestMapping(value = "/getAllAmazonReqs", method = RequestMethod.POST,
            produces = "Application/json; charset=utf-8")
    public ResultDo getAllAmazonReqs(@RequestBody JSONObject jsonObj) throws Exception {
        QueryAmazonDemandParam queryAmazonDemandParam = new QueryAmazonDemandParam();

        List<PerfamazonDemand> allList = new ArrayList<>();
        ResultDo res = new ResultDo();

        if (StringUtils.isNoneBlank(jsonObj.getString("demandId"))) {

            if (jsonObj.getString("demandId").contains("[")) {
                JSONArray ids = jsonObj.getJSONArray("demandId");
                for (int i = 0; i < ids.size(); i++) {
                    Integer tmp = (Integer) ids.get(i);
                    Long id = tmp.longValue();
                    queryAmazonDemandParam.setDemandId(id);
                    List<PerfamazonDemand> amazonDemands = amazonServiceManager.queryAmazonDeman(
                            queryAmazonDemandParam);
                    if (amazonDemands.size() > 0) {
                        allList.add(amazonDemands.get(0));
                    }
                }
            } else {
                queryAmazonDemandParam.setDemandId(jsonObj.getLong("demandId"));
                List<PerfamazonDemand> amazonDemands = amazonServiceManager.queryAmazonDeman(
                        queryAmazonDemandParam);
                if (amazonDemands.size() > 0) {
                    allList.add(amazonDemands.get(0));
                }
            }

            if (allList.size() > 0) {
                res.setSuccess(true);
                res.setMessage("查询成功！");
                res.setData(allList);
            } else {
                res.setSuccess(false);
                res.setMessage("没有获取到Amazon需求信息！");
            }
            return res;
        } else {
            String demandName = jsonObj.getString("demandName");
            if (StringUtils.isNoneBlank(demandName)) {
                queryAmazonDemandParam.setDemandName(demandName);
            }
            List<PerfamazonDemand> amazonDemands = amazonServiceManager.queryAmazonDeman(
                    queryAmazonDemandParam);

            if (amazonDemands.size() > 0) {
                res.setSuccess(true);
                res.setMessage("查询成功！");
                res.setData(amazonDemands);
            } else {
                res.setSuccess(false);
                res.setMessage("没有获取到Amazon需求信息！");
            }
            return res;
        }
    }

}
