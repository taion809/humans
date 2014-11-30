package com.redstalker.humans.jooq;

import org.jooq.Record;
import org.jooq.Result;

import static com.redstalker.humans.jooq.generated.Tables.HUMANS;

/**
 * Created by nick on 11/30/14.
 */
public class HumanDAO {
    final private Manager manager;

    public HumanDAO(Manager manager) {
        this.manager = manager;
    }

    public String fetchUsersAsString()
    {
        Result<Record> result = manager.getContext().select().from(HUMANS).fetch();
        String stringResult = "";

        for(Record r : result) {
            Integer id = r.getValue(HUMANS.ID);
            String name = r.getValue(HUMANS.NAME);

            stringResult += "ID: " + id + " name: " + name + "\n";
        }

        return stringResult;
    }
}
