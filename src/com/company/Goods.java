package com.company;


public class Goods {

    int id;
    String name;
    String producer;
    double price;
    int count;
    int ordered;
    Rating rate;
    int availability;


    public Goods(int id, String name, int availability, String producer, double price, int ordered, Rating rate) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.id = id;
        this.ordered = ordered;
        this.rate = rate;
        this.availability = availability;

    }

    @Override
    public String toString() {

        return "\n Наименование товара : " + name +
                "\n Производитель : " + producer +
                "\n Стоимость : " + price + " руб." +
                "\n Наличие в магазине : " + availability + " шт." +
                "\n Товар был куплен в магазине " + ordered + " раз." +
                "\n Рейтинг товара : " + rate +
                "\n Код товара : " + id + "\n";
    }

}


