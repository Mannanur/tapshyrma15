package com.company;

public class Programmer extends Person{
    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println(getName() + " is coding");
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
    public String toString(){
        return "Aty - " + super.getName() + ", tarmagy - " + super.getDesignation() + ", kompaniasy - " +companyName;
    }
}
