package com.elder.enums;


public enum UserTypeEnums {
    ORDINARY(1,"普通用户"),COMMUNITYSERVICEPERSON(2,"社区服务人员"),ORDINARYMANAGER(3,"普通管理员"),SUPERMANAGER(4,"超级管理员");
    private int TypeId;
    private String TypeName;

    private UserTypeEnums(int TypeId, String TypeName) {
        this.TypeId = TypeId;
        this.TypeName = TypeName;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
