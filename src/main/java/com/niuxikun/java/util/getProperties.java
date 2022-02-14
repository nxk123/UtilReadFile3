package com.niuxikun.java.util;

import com.niuxikun.java.MultiReadTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author niuxikun
 * @create 2022-02-15 0:15
 */
public class getProperties {
    public static Properties getProperties(String fileName) {
        try {
            String outpath = System.getProperty("user.dir");//先读取config目录的，没有再加载classpath的
            Properties properties = new Properties();
            InputStream in = new FileInputStream(new File(outpath +"/"+ fileName));
            properties.load(in);
            return properties;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
