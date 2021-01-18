package org.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRestaurants {


    public static void main(String[] args) {

        Item i1 = new Item();
        i1.name = "Honey Chilly Pottatoes";
        i1.price = 110.76;
        i1.quantity = "400 grams";


        Item i2 = new Item();
        i2.name = "Biriyani";
        i2.price = 145.67;
        i2.quantity = "2 bowls";

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);

        ItemGroup itemGroup1 = new ItemGroup();
        itemGroup1.name = "Main Course";
        itemGroup1.items = items;

        List<ItemGroup> itemGroups = new ArrayList<>();
        itemGroups.add(itemGroup1);

        Menu menu = new Menu();
        menu.name = "North Indian Items";
        menu.itemGroups = itemGroups;

        Address address
                = new Address();
        address.contactNums = Arrays.asList("+91 8971647098", "0674 2345678");
        address.line1 = "opposite vanivihar, utkal university";
        address.line2 = "nearest to pantaloons";

        Restaurant restaurant = new Restaurant();
        restaurant.name = "Swasti Plaza";
        restaurant.address = address;
        restaurant.menu = menu;
        restaurant.cuisine = Arrays.asList(Cuisine.CHINESE, Cuisine.THAI);

        System.out.println(restaurant);
    }

    private static class Restaurant {
        String name;
        Address address;
        Menu menu;
        List<Cuisine> cuisine;
    }

    private static enum Cuisine {
        CHINESE, THAI;
    }

    private static class Menu {
        String name;
        List<ItemGroup> itemGroups;
    }

    private static class Item {
        String name;
        Double price;
        String quantity;
    }

    private static class ItemGroup {
        String name;
        List<Item> items;
    }

    private static class Address {
        String line1;
        String line2;
        String pinCode;
        List<String> contactNums;
    }
}
