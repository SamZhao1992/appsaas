package com.app.entity;

public class Apis {
    private String id;

    private String upstreamUrl;

    private String uris;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUpstreamUrl() {
        return upstreamUrl;
    }

    public void setUpstreamUrl(String upstreamUrl) {
        this.upstreamUrl = upstreamUrl == null ? null : upstreamUrl.trim();
    }

    public String getUris() {
        return uris;
    }

    public void setUris(String uris) {
        this.uris = uris == null ? null : uris.trim();
    }
}