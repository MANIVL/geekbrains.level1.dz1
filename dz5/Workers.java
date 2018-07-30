package ru.geekbrains.java1.makerov.nikolai.dz.dz5;

   public class Workers {

       private String name;
       private String position;
       private String mail;
       private String telephone;
       private int salary;
       private int age;


       public Workers(String name, String position, String mail, String telephone, int salary, int age) {
           this.name = name;
           this.position = position;
           this.mail = mail;
           this.telephone = telephone;
           this.salary = salary;
           this.age = age;
       }


       public void printInfo() {
           System.out.println("Имя: " + name + " Должность: " + position + " Почта: " + mail + " Телефон: " + telephone + " Зарплата: " + salary + " Возраст: " + age);
       }

       public void printOld() {

           if (this.age > 40){
             printInfo();
           }
       }

}
