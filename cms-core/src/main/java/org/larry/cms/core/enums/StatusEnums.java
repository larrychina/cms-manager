package org.larry.cms.core.enums;

/**
 * Created by Larry on 2017/3/6.
 */
public enum StatusEnums {

    ;
    private int status ;
    private String statusInfo;

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

    public static StatusEnums statusOff(int index){
        for(StatusEnums staus : values()){
            if(staus.getStatus() == index)
                return staus ;
        }
        return null ;
    }
}
