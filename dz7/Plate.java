package ru.geekbrains.java1.makerov.nikolai.dz.dz7;

public class Plate {

    private int food;



    public Plate(int food) {
        this.food = food;
    }



    public boolean decreaseFood(int n) {

        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;

    }



    public void addFood(int food) {
        System.out.println("Добавляем корм");
        this.food += food;

    }



    public void info() {
        System.out.println("plate: " + food);


        }

    }

