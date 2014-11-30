package com.redstalker.humans;

/**
 * Created by nick on 11/29/14.
 */

import com.redstalker.humans.config.Loader;
import com.redstalker.humans.jooq.Manager;

public class HumansApplication {

    public static void main(String[] args) throws Exception {
        final HumansConfiguration c = Loader.load(args[0], HumansConfiguration.class);
        new HumansApplication().run(c);
    }

    public void run(HumansConfiguration config) throws Exception {
        Manager manager = Manager.build(config.getJooq());

        manager.close();
    }
}
