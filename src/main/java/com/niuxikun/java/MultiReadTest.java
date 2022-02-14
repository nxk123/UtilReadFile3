package com.niuxikun.java;

import com.niuxikun.java.util.getProperties;

import java.util.Properties;

/**
 * @author niuxikun
 * @create 2022-02-13 23:38
 */
public class MultiReadTest {
    /**
     * 多线程读取文件测试
     * @param args
     */
    public static void main(String[] args) {
//        ReadProp readProp = new ReadProp();
//        String DOWN_THREAD_NUM = readProp.readProp("jdbc", "DOWN_THREAD_NUM");
//        int DOWN_THREAD_NUM_INT = Integer.parseInt(DOWN_THREAD_NUM);
//        String OUT_FILE_NAME = readProp.readProp("jdbc", "OUT_FILE_NAME");
//        String keywords = readProp.readProp("jdbc", "keywords");

        Properties properties = getProperties.getProperties("jdbc.properties");
        String DOWN_THREAD_NUM = properties.getProperty("DOWN_THREAD_NUM");
        int DOWN_THREAD_NUM_INT = Integer.parseInt(DOWN_THREAD_NUM);
        String OUT_FILE_NAME = properties.getProperty("OUT_FILE_NAME");
        String keywords = properties.getProperty("keywords");

        System.out.println(DOWN_THREAD_NUM_INT);
        System.out.println(OUT_FILE_NAME);
        System.out.println(keywords);

//        Run run = new Run();
//        run.run(DOWN_THREAD_NUM_INT,OUT_FILE_NAME,keywords);
    }
}
