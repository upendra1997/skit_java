package com.company;

public abstract class MutatedAnimal implements animal{
    protected String name;


    public String SuperPowers(){
        return "No Powers";
    }

    public String Weapon(){
        return "No Weapons";
    }

    public String aliance(){
        return "Neutral";
    }

    public MutatedAnimal(String _name){
        name = _name;
    }

    public void introduce(){
        System.out.println("Hello I am an Mutated Animal "+name);
    }

}
