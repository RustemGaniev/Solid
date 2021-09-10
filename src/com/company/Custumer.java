package com.company;

public class Custumer {

    private String name;
    private String phone;
    private String address;

    public Custumer(String name, String phone, String address) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return " \n Покупатель " + name + " \n" +
                "Телефон : " + phone
                + "\n Адрес доставки: " + address;

    }
}
