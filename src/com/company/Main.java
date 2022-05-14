package com.company;

public class Main {

    public static void main(String[] args) {
       Animal animal1 =new Animal();
       animal1.methodAnimal();
        Shark[] sharks=new Shark[5];
        Turtle[]turtles=new Turtle[5];
        Eagle[]eagles=new Eagle[5];
        Animal[] animals={new Shark(),new Turtle(),new Eagle()};
        for (Animal animal:animals) {
            if (animal instanceof Shark){
                System.out.println("_______________________");
                System.out.println(animal.getClass().getName());
                ((Shark) animal).attack();
                sharks[0] =(Shark) animal;

            }
            else if(animal instanceof Turtle){
                System.out.println("_______________________");
                System.out.println(animal.getClass().getName());
                ((Turtle)animal).swim();
                turtles[0]=(Turtle) animal;
            }
            else if(animal instanceof Eagle){
                System.out.println("_______________________");
                System.out.println(animal.getClass().getName());
                ((Eagle)animal).fly();
                eagles[0]=(Eagle) animal;
                System.out.println("_______________________");
            }

        }


    }
}
