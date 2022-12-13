package com.kh.day15;

public class ObjectList {
    private Object[] objects;
    private int size;

    public ObjectList(){
        objects = new Object[3];
        size = 0;
    }
    public void add(Object input){
        objects[size] = input;
        size++;
    }

    public Object get(int index){

        return objects[index];
    }

    public Object size(){
        return size;
    }

    public void clear(){
        objects = new Object[3];
        size=0;
    }
}
