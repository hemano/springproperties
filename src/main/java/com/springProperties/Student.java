package com.springProperties;

/**
 * Created by hemantojha on 05/07/17.
 */
public class Student {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student Name is: " + name;
    }


}
