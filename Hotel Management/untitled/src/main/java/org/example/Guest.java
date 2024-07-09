package org.example;

public class Guest {
    private Integer Id;
    private String name;
    private String email;
    private Integer discount;

    Guest (Integer Id,String name,String email,Integer discount){
        this.Id=Id;
        this.name=name;
        this.email=email;
        this.discount=discount;
    }
    public Guest (){}

    public Integer getId (){
        return this.Id;
    }

    public String getName (){
        return this.name;
    }

    public String getEmail (){
        return this.email;
    }

    public Integer getDiscount(){
        return this.discount;
    }

}
