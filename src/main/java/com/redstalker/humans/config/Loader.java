package com.redstalker.humans.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.redstalker.humans.HumansConfiguration;

import java.io.*;

/**
 * Created by nick on 11/30/14.
 */
public class Loader {
    public static HumansConfiguration load(String path, Class<HumansConfiguration> klass) throws Exception {
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        return om.readValue(open(path), klass);
    }

    private static InputStream open(String filename) throws IOException {
        final File f = new File(filename);
        if(! f.exists()) {
            throw new FileNotFoundException("File " + filename + " Not found.");
        }

        return new FileInputStream(f);
    }

}
