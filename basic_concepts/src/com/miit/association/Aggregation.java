package com.miit.association;

class Engine {
    public void startEngine(){
        System.out.println("Car Engine Started.");
    }
}

class Car {
    private String color;
    private int max_Speed; 
    private int door;

    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int max_Speed) {
        this.max_Speed = max_Speed;
    }
    public void setDoor(int door) {
    	this.door = door;
    }
    public void carDetails(){
        System.out.println("Car Color is: " + color);
        System.out.println("Max Speed is: " + max_Speed); 
        System.out.println("Number of doors are: " + door);
    }
}
 
class Toyota extends Car{
    public void HondaStart(){
        Engine Honda_Engine = new Engine();
        Honda_Engine.startEngine();
    }
}
 
public class Aggregation {
    public static void main(String[] args) {        
        Toyota DreamCar = new Toyota();
        DreamCar.setColor("White");
        DreamCar.setMaxSpeed(120);
        DreamCar.setDoor(4);
        DreamCar.carDetails();
        DreamCar.HondaStart();
    }
}

