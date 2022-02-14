package com.niuxikun.java.util;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

/**
 * @author niuxikun
 * @create 2022-02-14 9:52
 */
public class ReadProp {
    //filedName只查前缀就行，自动到resources目录下查找,很方便
     public String readProp(String filedName, String confName) {
         String result = null;
         try {
             ResourceBundle bundle = ResourceBundle.getBundle(filedName);
             //java.util.ResourceBundle类读取properties文件不支持中文,必须将文件设置为ISO-8859-1编码格式
              result = new String(bundle.getString(confName).getBytes("ISO-8859-1"), "GBK");
         } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
         }
         return result;
    }
}
