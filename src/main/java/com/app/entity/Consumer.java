package com.app.entity;

import java.io.Serializable;

public class Consumer implements Serializable {
    private String id;

    private String consumerId;

    private String createdAt;

    private String keyConsumer;

    private String secret;

    private String username;

    private String jwtToken;

    private String appName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId == null ? null : consumerId.trim();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    public String getKeyConsumer() {
        return keyConsumer;
    }

    public void setKeyConsumer(String keyConsumer) {
        this.keyConsumer = keyConsumer == null ? null : keyConsumer.trim();
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken == null ? null : jwtToken.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id='" + id + '\'' +
                ", consumerId='" + consumerId + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", keyConsumer='" + keyConsumer + '\'' +
                ", secret='" + secret + '\'' +
                ", username='" + username + '\'' +
                ", jwtToken='" + jwtToken + '\'' +
                ", appName='" + appName + '\'' +
                '}';
    }
}