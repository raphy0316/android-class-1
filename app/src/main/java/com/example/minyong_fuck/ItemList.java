package com.example.minyong_fuck;

/**
 * Created by 오현택 on 2017-03-24.
 */

public class ItemList {
    private String name, num;

    public ItemList(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
