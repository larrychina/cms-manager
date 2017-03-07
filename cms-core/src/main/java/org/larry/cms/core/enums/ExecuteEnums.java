package org.larry.cms.core.enums;

/**
 * Created by Larry on 2017/3/6.
 */
public enum  ExecuteEnums {
    SUCCESS(1,"操作成功"),FAILED(0,"操作失败"),INNER_ERROR(-1,"内部错误");

    private int status ;
    private String statusInfo;

    ExecuteEnums(int status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public static ExecuteEnums statusOff(int index){
        for(ExecuteEnums staus : values()){
            if(staus.getStatus() == index)
                return staus ;
        }
        return null ;
    }
}
