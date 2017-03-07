package org.larry.cms.core.dto;

import org.larry.cms.core.enums.ExecuteEnums;

/**
 * Created by Larry on 2017/3/6.
 * 操作执行结果
 */
public class ExecuteResult<T> {

    private Integer status ;

    private String statusInfo ;

    private ExecuteEnums executeStatus ;

    private T data ;

    public ExecuteResult(ExecuteEnums executeStatus, T data) {
        this.executeStatus = executeStatus;
        this.data = data;
    }

    public Integer getStatus() {
        this.status = this.executeStatus.getStatus() ;
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusInfo() {
        this.statusInfo = this.executeStatus.getStatusInfo() ;
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public ExecuteEnums getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteEnums executeStatus) {
        this.executeStatus = executeStatus;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
