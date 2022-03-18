package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(getName() + " is dancing");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
        return "Aty - " +super.getName() +  ", tarmagy - " + super.getDesignation() + ", gruppasy - " + groupName;
    }
}
