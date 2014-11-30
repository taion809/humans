package com.redstalker.humans.resources;

import com.redstalker.humans.jooq.HumanDAO;
import spark.Request;
import spark.Response;

import static spark.Spark.*;

/**
 * Created by nick on 11/30/14.
 */
public class Human {
    public static void register(HumanDAO dao) {
        get("/", (request, response) -> {
            return dao.fetchUsersAsString();
        });
    }
}
