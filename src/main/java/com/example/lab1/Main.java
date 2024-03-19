package com.example.lab1;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть номер завдання від 1 до 5 : ");
        do
        {
            int TaskNumber = scan.nextInt();

            Ex1 Task = new Ex1();
            System.out.println("Завдання " + TaskNumber);
            /*------------------------ Завдання 1 -------------------------*/
            if (TaskNumber == 1) {
                Task.Task1();
            }
            /*------------------------ Завдання 2 -------------------------*/
            else if (TaskNumber == 2) {
                Task.Task2();
            }
            /*------------------------ Завдання 3 -------------------------*/
            else if (TaskNumber == 3) {
                User user1 = new User(1, 19, "Yevheb", "Harashchenko", 86, 190);
                User user2 = new User(2, 19, "Petro", "Samoilevich", 99, 190);
                User user3 = new User(3, 19, "Oleg", "Tokarchk", 78, 186);
                User user4 = new User(4, 18, "Maryna", "HARASHCHENKO", 40, 140);
                User user5 = new User(5, 19, "Petro", "Mostovchuk", 75, 175);
                User user6 = new User(6, 21, "Andriy", "Olenyk", 75, 185);
                User user7 = new User(7, 20, "Liza", "Omelkovich", 60, 165);
                User user8 = new User(8, 18, "Roman", "Horbach", 76, 185);
                User user9 = new User(9, 21, "Pavlo", "pryma", 80, 170.);
                User user10 = new User(10, 19, "Maksym", "Rozenblum", 81, 160);

                int totalAge = user1.age + user2.age + user3.age + user4.age + user5.age + user6.age + user7.age + user8.age + user9.age + user10.age;
                double totalWeight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
                double totalHeight = user1.height + user2.height + user3.height + user4.height + user5.height + user6.height + user7.height + user8.height + user9.height + user10.height;

                System.out.println("Total age: " + totalAge);
                System.out.println("Total weight: " + totalWeight);
                System.out.println("Total height: " + totalHeight);
            }
            /*------------------------ Завдання 4 -------------------------*/
            else if (TaskNumber == 4) {
                Car car1 = new Car("Honda", "NSX", "White", 1200, 3.2, 320, 15);
                Car car2 = new Car("Honda", "Civic", "Red", 700, 2.2, 250, 9);
                Car car3 = new Car("Nisan", "Z370", "Blue", 900, 2.8, 320, 11);
                Car car4 = new Car("Nisan", "Z350", "Green", 1000, 2.2, 280, 12);
                Car car5 = new Car("Nisan", "Z240", "Blue", 600, 1.8, 220, 7);
                Car car6 = new Car("Subaru", "Impreza", "Orange", 800, 2.4, 270, 9);
                Car car7 = new Car("Toyota", "Celica", "Red", 1000, 2.6, 260, 12);
                Car car8 = new Car("Toyota", "Supra", "White", 2200, 7.2, 520, 22);
                Car car9 = new Car("Toyota", "AE86", "White", 700, 1.8, 230, 8);
                Car car10 = new Car("Mazda", "Mata ", "Red", 800, 1.6, 240, 7);

                double totalVolume = car1.Volume + car2.Volume + car3.Volume + car4.Volume + car5.Volume + car6.Volume + car7.Volume + car8.Volume + car9.Volume + car10.Volume;
                double totalHp = car1.HP + car2.HP + car3.HP + car4.HP + car5.HP + car6.HP + car7.HP + car8.HP + car9.HP + car10.HP;

                System.out.println("TotalVolume = " + totalVolume);
                System.out.println("TotalHp = " + totalHp);
            }
            /*------------------------ Завдання 5 -------------------------*/
            else if (TaskNumber == 5) {
                int num = 412;

                System.out.println("Реверснуте число: " + Number.reverse(num));
            }
            else
            {
                System.out.println("Такого завдання не існує ! ");
            }
            System.out.println(" ");
            System.out.println("Якщо хочете завершити програму натисніть (0) , а щоб продовжити виберіть завдання від 1 по 5");
            if (TaskNumber == 0) {
                break;
            }
        }while(true);
    }
}
