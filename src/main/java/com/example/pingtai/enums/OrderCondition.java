package com.example.pingtai.enums;

public enum OrderCondition {
    /**
     *主键
     */
    ID("id"),
    /**
     *创建时间
     */
    GMTCREATE("gmt_create"),
    /**
     *修改时间
     */
    GMTMODIFIED("gmt_modified"),
    /**
     *需求名称
     */
    DEMANDNAME("demand_name"),
    /**
     *需求开始时间
     */
    STARTTIME("start_time"),
    /**
     *需求结束时间
     */
    ENDTIME("end_time"),
    /**
     *操作人名称
     */
    USERNICK("user_nick"),
    /**
     *amazon链路id
     */
    AMAZONCHAINIDS("amazon_chain_ids"),
    /**
     *需求id
     */
    DEMANDID("demand_id"),
    /**
     *需求方案内容
     */
    PLANDATAS("plan_datas");

    private String columnName;

    OrderCondition(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public static OrderCondition getEnumByName(String name) {
        OrderCondition[] orderConditions = OrderCondition.values();
        for (OrderCondition orderCondition : orderConditions) {
            if (orderCondition.name().equalsIgnoreCase(name)) {
                return orderCondition;
            }
        }
        throw new RuntimeException("OrderCondition of " + name + " enum not exist");
    }

    @Override
    public String toString() {
        return columnName;
    }
}
