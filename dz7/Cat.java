package ru.geekbrains.java1.makerov.nikolai.dz.dz7;


    public class Cat {

        private String name;
        private int appetite;
        private boolean satiety;


        public Cat(String name, int appetite) {

            this.name = name;
            this.appetite = appetite;
            this.satiety = true;

        }


        public void info() {

            String isSatiety = !satiety ? "сыт" : "голоден";
            System.out.println(name + ": " + isSatiety);

        }


        public void eat(Plate plate) {

            if (satiety && plate.decreaseFood(appetite))
                satiety = false;
        }

    }

