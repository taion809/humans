package com.redstalker.humans.jooq;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nick on 11/30/14.
 */
public class JooqConfig {
    @JsonProperty
    private String user;

    @JsonProperty
    private String pass;

    @JsonProperty
    private String url;

    private String driver;

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }
}
