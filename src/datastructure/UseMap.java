package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

//
public class UseMap {

    public static void main(String[] args) {
//		/*
//		 * Demonstrate how to use Map that includes storing and retrieving elements.
//		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
//		 * Use For Each loop and while loop with Iterator to retrieve data.
//		 *
//		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
//		 */

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(20, "Hamid");
        hmap.put(25, "Nuru");
        hmap.put(27, "John");
        hmap.put(29, "Tommy");
        hmap.put(30, "Clinto");

        /* Retrieve values */
        String var = hmap.get(4);
        System.out.println("Value at index 1 is: " + var);
        String var1 = hmap.get(3);
        System.out.println("Value at index 2 is: " + var1);

        // Add List<String> into a Map.
        Map<String, List<String>> list = new HashMap<String, List<String>>();
        List<String> carList = new ArrayList<String>();
        carList.add("acura");
        carList.add("kia");
        carList.add("honda");
        list.put("car", carList);
        System.out.println(list);

        List<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Grape");
        list.put("fruit", fruits);
        System.out.println(list);

        // Each loop to retrieve data
        for (Object str : list.keySet()) {
            System.out.println("KeySet:" + str);
            for (String str1 : list.get(str)) {
                System.out.println("Value: " + str1);
            }
        }
        // while loop with Iterator to retrieve data
        Iterator itr = list.entrySet().iterator();
        System.out.println("While Loop:");
        Iterator iterator = list.keySet().iterator();
        while (iterator.hasNext()) {
            Object kvalues = iterator.next();
            for (String str1 : list.get(kvalues)) {
                System.out.println("Value: " + str1);
            }
        }
        //Connect to MySql Database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        //Create table in the database
        // connectToSqlDB.insertDataFromStringToSqlTable("use_map", "use_map", "mapValue");

        for (Object str : list.keySet()) {
            List<String> list1 = new ArrayList<String>();
            for (String str1 : list.get(str)) {
                list1.add(str.toString()); // adds key
                list1.add(str1); // adds value
            }
            // Insert data in the database
            connectToSqlDB.insertDataFromStringArrayListToSqlTable(list1, "use_map", "mapKey");
        }
        System.out.println("Reading data from database: ");
        //Reading data from database

        List<String> numbers = new ArrayList<String>();
        try {
            numbers = connectToSqlDB.readDataBase("use_map", "mapKey");
            for (String st : numbers) {
                System.out.println(st);
            }
        } catch (Exception e) {

        }
    }
}

