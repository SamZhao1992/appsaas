package com.app.entity;

public class Apis {
    private String apiId;

    private String apiName;

    private String upstreamUrl;

    private String uris;

    @Override
    public String toString() {
        return "Apis{" +
                "apiId='" + apiId + '\'' +
                ", apiName='" + apiName + '\'' +
                ", upstreamUrl='" + upstreamUrl + '\'' +
                ", uris='" + uris + '\'' +
                '}';
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getUpstreamUrl() {
        return upstreamUrl;
    }

    public void setUpstreamUrl(String upstreamUrl) {
        this.upstreamUrl = upstreamUrl;
    }

    public String getUris() {
        return uris;
    }

    public void setUris(String uris) {
        this.uris = uris;
    }
}