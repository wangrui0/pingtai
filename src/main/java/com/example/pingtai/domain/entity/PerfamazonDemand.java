package com.example.pingtai.domain.entity;

import java.util.Date;

public class PerfamazonDemand {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.id
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.gmt_create
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.gmt_modified
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.demand_name
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private String demandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.start_time
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.end_time
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.user_nick
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private String userNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.amazonchain_ids
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private String amazonchainIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.demand_id
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private Long demandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column perfamazon_demand.plan_datas
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    private String planDatas;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.id
     *
     * @return the value of perfamazon_demand.id
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.id
     *
     * @param id the value for perfamazon_demand.id
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.gmt_create
     *
     * @return the value of perfamazon_demand.gmt_create
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.gmt_create
     *
     * @param gmtCreate the value for perfamazon_demand.gmt_create
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.gmt_modified
     *
     * @return the value of perfamazon_demand.gmt_modified
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.gmt_modified
     *
     * @param gmtModified the value for perfamazon_demand.gmt_modified
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.demand_name
     *
     * @return the value of perfamazon_demand.demand_name
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public String getDemandName() {
        return demandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.demand_name
     *
     * @param demandName the value for perfamazon_demand.demand_name
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setDemandName(String demandName) {
        this.demandName = demandName == null ? null : demandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.start_time
     *
     * @return the value of perfamazon_demand.start_time
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.start_time
     *
     * @param startTime the value for perfamazon_demand.start_time
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.end_time
     *
     * @return the value of perfamazon_demand.end_time
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.end_time
     *
     * @param endTime the value for perfamazon_demand.end_time
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.user_nick
     *
     * @return the value of perfamazon_demand.user_nick
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public String getUserNick() {
        return userNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.user_nick
     *
     * @param userNick the value for perfamazon_demand.user_nick
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.amazonchain_ids
     *
     * @return the value of perfamazon_demand.amazonchain_ids
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public String getAmazonchainIds() {
        return amazonchainIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.amazonchain_ids
     *
     * @param amazonchainIds the value for perfamazon_demand.amazonchain_ids
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setAmazonchainIds(String amazonchainIds) {
        this.amazonchainIds = amazonchainIds == null ? null : amazonchainIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.demand_id
     *
     * @return the value of perfamazon_demand.demand_id
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public Long getDemandId() {
        return demandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.demand_id
     *
     * @param demandId the value for perfamazon_demand.demand_id
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setDemandId(Long demandId) {
        this.demandId = demandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column perfamazon_demand.plan_datas
     *
     * @return the value of perfamazon_demand.plan_datas
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public String getPlanDatas() {
        return planDatas;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column perfamazon_demand.plan_datas
     *
     * @param planDatas the value for perfamazon_demand.plan_datas
     *
     * @mbggenerated Wed Sep 09 15:22:32 CST 2020
     */
    public void setPlanDatas(String planDatas) {
        this.planDatas = planDatas == null ? null : planDatas.trim();
    }
}