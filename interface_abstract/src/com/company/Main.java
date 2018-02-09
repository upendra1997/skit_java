package com.company;


class dog implements animal{

    @Override
    public String speak() {
        return "Bark";
    }

    @Override
    public String eat() {
        return "Bone";
    }

    @Override
    public String stay() {
        return "Doghouse";
    }

    @Override
    public String scared() {
        return "Humans";
    }
}


class supercat extends MutatedAnimal{

    public supercat(String _name){
        super(_name);
    }

    @Override
    public String SuperPowers(){
        return "Thundershock";
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public String eat() {
        return "fish";
    }

    @Override
    public String stay() {
        return "bed";
    }

    @Override
    public String scared() {
        return "dogs";
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    animal inu = new dog();
    System.out.println("dog "+inu.speak());
    System.out.println(inu.speak());
    System.out.println(inu.speak());
    System.out.println(inu.speak());
    System.out.println(inu.speak());
    MutatedAnimal neko = new supercat("Kami-sama");
    neko.introduce();

    }
}
