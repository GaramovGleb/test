package ru.mirea.inbo02;
import java.lang.*;

public class BallTest {
    public static void main(String[ ] arqs){

        Ball b1 = new Ball("BestBallEver","blue",4);
        Ball b2 = new Ball("KillerFoot");
        Ball b3 = new Ball("BestBallEver","blue");
        Ball b4 = new Ball();

        System.out.println("В данной программе имеется класс Ball, с некоторыми методами и параметрами, ниже они представлены");

        System.out.println("Перывый обеъкт класса, отобразим его размер");
        System.out.println(b1.getSize());

        System.out.println("Второй объект, выведем его размер и модель");
        System.out.println(" Размер "+b1.getSize() +", "+ "Модель: "+b2.getModel());

        System.out.println("Третий объект, выведем его цвет");
        System.out.println(b3.getColor());

        System.out.println("Теперь выведем все свойства первого объекта");
        b1.getAll();


    }
}

