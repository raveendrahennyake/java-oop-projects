package org.example;

import java.util.ArrayList;

public class Room {
    private Integer id;
    private Integer floor;
    private Integer capacity;
    private String type;
    private String description;
    private double price;
    private ArrayList<String> reservedDates;

    public Room (Integer id,Integer floor,Integer capacity,String type,String description,double price){
        this.id=id;
        this.floor=floor;
        this.capacity=capacity;
        this.description=description;
        this.price=price;
        reservedDates=new ArrayList<>();
    }

    public Room (){

    }

    public Integer getId (){
        return this.id;
    }
    public Integer getFloor(){
        return this.floor;
    }

    public Integer getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }
    public Double getprice (){
        return this.price;

    }

    public String getDescription(){
        return this.description;
    }










}
