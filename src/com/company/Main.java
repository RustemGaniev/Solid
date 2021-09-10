package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int orderId = 0;
        Order newOrder;
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Goods> basket = new ArrayList<>();
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Goods(101, "Сахар мешок 10 кг", 10000,"Сахарный комбинат", 600, 100,Rating.Medium ));
        goods.add(new Goods(102, "Сахар мешок 5 кг", 10000,"Сахарный комбинат", 360, 100,Rating.VeryLow ));
//        goods.add(new Goods(103, "Сахар мешок 100 кг", 10000,"Сахарный комбинат", 5009, 100,Rating.Low ));
//        goods.add(new Goods(204, "Помидор ящик 20 кг", 1000, "Турция", 2000, 800, Rating.High));
//        goods.add(new Goods(205, "Помидор ящик 20 кг", 1000, "Кубань", 1900, 800, Rating.VeryHigh));
//        goods.add(new Goods(209, "Помидор ящик 200 кг", 1000, "Узбекистан", 20009, 800, Rating.Low));
//        goods.add(new Goods(206, "Помидор ящик 10 кг", 1000, "Турция", 1000, 800, Rating.Medium));

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Добро пожаловать в наш магазин ! \n" +
                "Введите 1 для совершения покупок \n" +
                "Введите 2 для того, чтобы отследить заказ \n" +
                "Введите 3 для того, чтобы оменить заказ \n");

      Integer input = scanner.nextInt();


      switch (input) {

          case 1:
              Shopping shopping = new Shopping();
              orderId =  orderId ++;
              Order order = new Order();
              basket = shopping.shopping(goods);
              newOrder = order.order(basket, orderId,scanner);
              orders.add(newOrder);
              break;

          case 2:
              tracking(orders);
              break;

          case 3:
              canceling(orders);
              break;

          default:
              System.out.println(" Введены некорректные данные, повотрите ввод");
      }
    }
    public static void tracking(ArrayList<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите номер заказа ");
        Integer inputId = scanner.nextInt();
        for (Order o : orders) {
            if (o.orderId == inputId) {
                System.out.println(" \n Ваш заказ будет доставлен в ближайшее время \n");
            } else {
                System.out.println(" \n Заказ с номером " + inputId + " не найден \n ");
            }
        }

    }
    public static void canceling(ArrayList<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите номер заказа для отмены ");
        Integer inputId = scanner.nextInt();
        for (Order o : orders) {
            if (o.orderId == inputId) {
                orders.remove(o);
                System.out.println(" \n Ваш заказ отменен \n");
            } else {
                System.out.println(" \n Заказ с номером " + inputId + " не найден \n ");
            }
        }

    }
}

