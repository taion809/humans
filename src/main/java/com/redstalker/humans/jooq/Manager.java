package com.redstalker.humans.jooq;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nick on 11/30/14.
 */
public class Manager {
    final protected Connection connection;
    final protected DSLContext context;

    public Manager(Connection connection, DSLContext context) {
        this.connection = connection;
        this.context = context;
    }

    public static Manager build(JooqConfig config) throws Exception {
        Class.forName(config.getDriver());
        Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPass());
        DSLContext context = DSL.using(connection, SQLDialect.POSTGRES);

        return new Manager(connection, context);
    }

    public Connection getConnection() {
        return connection;
    }

    public DSLContext getContext() {
        return context;
    }

    public void close() {
        if(this.connection == null) {
            return;
        }

        try {
            this.connection.close();
        } catch(SQLException e) {}
    }
}
