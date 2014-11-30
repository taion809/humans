package com.redstalker.humans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.redstalker.humans.jooq.JooqConfig;

/**
 * Created by nick on 11/30/14.
 */
public class HumansConfiguration {
    @JsonProperty("database")
    private JooqConfig jooq = new JooqConfig();

    public JooqConfig getJooq() {
        return jooq;
    }
}
