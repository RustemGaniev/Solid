package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    int orderId;
    Double orderPrice;
    int goodsCount;
    Custumer custumer;
    ArrayList<Goods> basket;

    public Order(){};

    public Order(int orderId, Double orderPrice, int goodsCount, Custumer custumer) {
        this.goodsCount = goodsCount;
        this.orderPrice = orderPrice;
        this.orderId = orderId;
        this.custumer = custumer;

    }

    public Order order(ArrayList<Goods> basket, int orderId, Scanner scanner) {
        System.out.println(" \n Введите имя, номер телефона на кого будет оформлен заказ и адрес доставки через Enter: \n");
        String customerName = scanner.nextLine();
        String customerPhone = scanner.nextLine();
        String customerAddress = scanner.nextLine();
        Custumer custumer = new Custumer(customerName, customerPhone, customerAddress);
        for (Goods b : basket) {
           orderPrice = orderPrice + b.price * b.count;
           goodsCount = goodsCount + b.count;
            }
        Order order = new Order(orderId, orderPrice, goodsCount, custumer);
        System.out.println(" \n Сформирован заказ: \n");
        System.out.println(order);
        return order;

    }
    @Override
    public String toString(){
        return " \n Номер заказа " + orderId + " \n" +
                "Сумма заказа " + orderPrice
                + "\n Количество позиций " + goodsCount +
                " \n " + custumer;

    }

}

