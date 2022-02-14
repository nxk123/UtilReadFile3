package com.niuxikun.java;

/**
 * @author niuxikun
 * @create 2022-02-13 23:38
 */
public class KeyWordsCount {

    private static KeyWordsCount kc;

    private int count = 0;
    private KeyWordsCount(){

    }

    public static synchronized KeyWordsCount getCountObject(){
        if(kc == null){
            kc = new KeyWordsCount();
        }
        return kc;
    }

    public synchronized void  addCount(int count){
        System.out.println("增加次数："+count);
        this.count += count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
