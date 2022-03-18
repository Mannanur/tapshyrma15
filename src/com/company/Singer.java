package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }
    public void singing(){
        System.out.println(getName() + " is singing");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override

    public void learn(){
        System.out.println(getName() + " is learning"); }
    public void walk(){
        System.out.println(getName() + " is walking"); }
    public void eat(){
        System.out.println(getName() + " is eating");
    }
    @Override
    public String toString() {
        return "Aty - " +super.getName() + ", tarmagy - " + super.getDesignation() +", " + " tobu - " +bandName ;
    }
}
