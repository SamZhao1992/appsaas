package com.app.entity;

public class RecordTec {
    private Integer id;

    private String consumerName;

    private String consumerId;

    private String apiId;

    private String apiName;

    private String isDelete;

    private String isActive;

    private String keyAccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName == null ? null : consumerName.trim();
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId == null ? null : consumerId.trim();
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId == null ? null : apiId.trim();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    public String getKeyAccess() {
        return keyAccess;
    }

    public void setKeyAccess(String keyAccess) {
        this.keyAccess = keyAccess == null ? null : keyAccess.trim();
    }

    @Override
    public String toString() {
        return "RecordTec{" +
                "id=" + id +
                ", consumerName='" + consumerName + '\'' +
                ", consumerId='" + consumerId + '\'' +
                ", apiId='" + apiId + '\'' +
                ", apiName='" + apiName + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", isActive='" + isActive + '\'' +
                ", keyAccess='" + keyAccess + '\'' +
                '}';
    }
}