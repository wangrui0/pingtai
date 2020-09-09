package com.example.pingtai.enums;

public enum SortType {
    /**
     * 升序
     */
    ASC("asc"),
    /**
     * 降序
     */
    DESC("desc");

    private String value;

    SortType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SortType getEnumByName(String name) {
        SortType[] sortTypes = SortType.values();
        for (SortType sortType : sortTypes) {
            if (sortType.name().equalsIgnoreCase(name)) {
                return sortType;
            }
        }
        throw new RuntimeException("SortType of " + name + " enum not exist");
    }

    @Override
    public String toString() {
        return value;
    }
}
