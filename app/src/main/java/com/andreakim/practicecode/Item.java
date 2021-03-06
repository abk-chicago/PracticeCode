package com.andreakim.practicecode;

/**
 * Created by andreakim on 6/20/16.
 */
public class Item {

    private String name;
    private String desc;

    public Item() {
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String toString()
    {
        return ("Name: "+name+"\nDescription: "+desc);

    }

}
