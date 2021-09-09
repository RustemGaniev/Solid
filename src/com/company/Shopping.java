package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public ArrayList<Goods> shopping(ArrayList<Goods> goods) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Goods> basket = new ArrayList<>();

        System.out.println(" \n Введите 1 чтобы вывести список товаров \n" +
                " Введите 2 чтобы найти товар \n" +
                " Введите 3 чтобы подобрать нужный вам товар \n" +
                " Введите 4 чтобы положить товар в корзину \n");
        Integer input = scanner.nextInt();

        switch (input) {

            case 1:
                    System.out.println(goods);
                    break;

            case 2:
                System.out.println(" \n Введите 1 чтобы найти товар по ключевому слову " +
                        "\n Введите 2 чтобы найти товар по производителю \n" +
                        " Ввeдите 3 чтобы найти товар по цене \n");
                Integer inputSub = scanner.nextInt();
                switch (inputSub) {
                    case 1:
                        System.out.println("\n Введите ключевое слово: \n");
                        String inputCase = scanner.nextLine();
                        System.out.println(" \n По ключевому слову " + inputCase + " найдены следующие товары: \n");
                        for (Goods g : goods) {
                            if (g.name.regionMatches(0, inputCase, 0, inputCase.length()) == true ||
                                    g.producer.regionMatches(0, inputCase, 0, inputCase.length()) == true) {
                                System.out.println(g + "\n");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("\n Введите производителя \n");
                        String inputProducer = scanner.nextLine();
                        System.out.println(" \n По производителю " + inputProducer + " найдены следующие товары: \n");
                        for (Goods g : goods) {
                            if (g.producer == inputProducer) {
                                System.out.println(g + "\n");
                            }

                        }
                        break;

                    case 3:
                        System.out.println(" \n Введите цену товара : \n");
                        Integer inputPrice = scanner.nextInt();
                        System.out.println(" \n По цене товара " + inputPrice + " найдены следующие товары: \n");
                        for (Goods g : goods) {
                            if (g.price == inputPrice) {
                                System.out.println(g + "\n");
                            }
                        }
                        break;
                }

            case 3:
                System.out.println(" \n Введите минимальную и максимальную цену в рублях через Enter : \n");
                Double minPrice = scanner.nextDouble();
                Double maxPrice = scanner.nextDouble();
                System.out.println(" \n В диапазоне указанных цен найдныследующие товары: \n");
                for (Goods g : goods) {
                    if (g.price > minPrice & g.price < maxPrice) {
                        System.out.println(g + "\n");
                    }
                }
break;
            case 4:
                System.out.println(" \n Введите код товара : \n ");
                Integer inputId = scanner.nextInt();

                for (Goods g : goods) {
                    if (g.id == inputId) {
                        basket.add(g);
                        System.out.println("\n Введите количество :  \n");
                        g.count = scanner.nextInt();
                        g.availability -= g.count;
                        basket.add(g);
                        System.out.println(" \n Введите 1 для проолжения покупок или 2 для формления заказа \n");
                        Integer inputChoise = scanner.nextInt();
                        switch (inputChoise) {
                            case 1:
                                break;
                            case 2:
                                return basket;
                        }

                    }
                }
        }
        return basket;
    }
    }