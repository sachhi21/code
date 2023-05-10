package org.example;

/**
 * Hello world!
 *
 */
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {




        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery_man","root", "0000");


            System.out.println("Connected to the database!");

            //Statement statement = connection.createStatement();
             //Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);




     /*       ResultSet resultSet = statement.executeQuery("select * from customers");
            while(resultSet.next()) {
               // System.out.println();
                System.out.println(resultSet.getInt(1) + " "+ resultSet.getString(2) + " "+ resultSet.getString(8));
            }





            ResultSet resultSet = statement.executeQuery("select * from customer");
            while(resultSet.next()) {
                // System.out.println();
                System.out.println(resultSet.getInt(1) + " "+ resultSet.getString(2) + " "+ resultSet.getString(3) + " " + resultSet.getString(4) );
            }

*/

            String sql = "SELECT * FROM orders  join customer join restaurants join menu  on orders.customer_id = customer.customer_id = menu.menu_id where orders.customer_id=?;" ;
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a customer ID:");
                int id = Integer.parseInt(sc.nextLine());
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int orderId = resultSet.getInt("order_id");
                        int menu_id = resultSet.getInt("menu_id");

                        int restaurantId = resultSet.getInt("restaurant_id");
                        Date orderDate = resultSet.getDate("order_date");

                        System.out.println(resultSet.getString(
                                7) + " "+ resultSet.getDate(4)+"  " + resultSet.getString(11)+  " " + resultSet.getString(17) +
                                " " + resultSet.getInt(18));
                    }
                }
            }

            String sq1 = "SELECT * FROM Menu WHERE restaurant_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sq1)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a restaurant ID:");
                int id = Integer.parseInt(sc.nextLine());
                statement.setInt(1,id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int itemId = resultSet.getInt("menu_id");
                        String itemName = resultSet.getString("item_name");
                        double itemPrice = resultSet.getDouble("item_price");
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(3)+ " " + resultSet.getDouble(4));
                    }
                }
            }

            String sql2 = "INSERT INTO Orders (customer_id, restaurant_id, order_date) VALUES (?, ?, ?)"
            ;

            try (PreparedStatement statement = connection.prepareStatement(sql2))
                 {

                Scanner sc = new Scanner(System.in);
                     System.out.println("Enter a Customer ID:");

                int customerId = Integer.parseInt(sc.nextLine());
                     System.out.println("Enter a restaurant ID:");

                     int restaurantId = Integer.parseInt(sc.nextLine());

                statement.setInt(1, customerId);
                statement.setInt(2, restaurantId);
                statement.setDate(3, Date.valueOf(LocalDate.now()));
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("order placed successfully");
                } else {
                    System.out.println("order not placed");
                }
            }

            String sql3 = "SELECT * FROM orders  join restaurants  on orders.customer_id = restaurants.id where orders.customer_id=?" ;
            try (PreparedStatement statement = connection.prepareStatement(sql3)) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a customer ID:");
                int id = Integer.parseInt(sc.nextLine());
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int orderId = resultSet.getInt("order_id");
                        int restaurantId = resultSet.getInt("restaurant_id");
                        Date orderDate = resultSet.getDate("order_date");

                        System.out.println(resultSet.getInt(1) + " "+ resultSet.getInt(2)+"  " + resultSet.getInt(3)+ " " + resultSet.getDate(4) + " " + resultSet.getInt(5) +
                                " " + resultSet.getString(6)+resultSet.getString(7));
                    }
                }
            }



            //resultSet.close();
            //statement.close();
            connection.close();

            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}














create database food_delivery;

use food_delivery;

CREATE TABLE restaurants (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  address VARCHAR(255),
  latitude DECIMAL(9,6),
  longitude DECIMAL(9,6)
);


insert into restaurants(id,name, address, latitude,longitude) 
values(1, 'sachin' , '2nd block main street bangalore India' , '40.7128',
 '-74.0060' );
 
 insert into restaurants (id, name, address, latitude, longitude)
values
  (2, 'The veg House', '123 Main Street, India', 40.7128, -74.0060),
  (3, 'the bangalore House', '321 Pine Road, India', 48.8566, 2.3522),
  (4, 'The Seafood S', '159 Maple Street, India', 37.3382, -121.8863),
  (5, 'Veggies house', '852 Olive Avenue, India', 33.7490, -84.3880),
  (6, 'BBQ Joint', '741 Cedar Lane, India', 39.9526, -75.1652),
  (7, 'The coimbatore house', '369 Pineapple Street, India', 42.3601, -71.0589);


CREATE TABLE menu (
  menu_id INT PRIMARY KEY,
  restaurant_id INT,
  item_name VARCHAR(255),
  item_price DECIMAL(10, 2),
  FOREIGN KEY (restaurant_id) REFERENCES restaurants(id)
);


INSERT INTO menu (menu_id, restaurant_id, item_name, item_price)
VALUES
  (1, 1, 'upma', 12.99),
  (2, 1, 'vada', 9.99),
  (3, 2, 'chicken', 24.99),
  (4, 2, 'Soup', 3.99),
  (5, 3, 'Salad', 8.99),
  (6, 3, 'Lasagna', 14.99),
  (7, 4, 'aloo parata', 29.99),
  (8, 4, 'Garlic Butter bread', 18.99),
  (9, 5, ' chai', 11.99),
  (10, 5, 'Green Curry', 13.99),
  (11, 6, 'upma', 12.99),
  (12, 6, 'vada', 9.99),
  (13, 7, 'chicken', 24.99),
  (14, 7, ' mutton Soup', 3.99),
  (15, 3, 'Salad', 8.99),
  (16, 3, 'Lasagna', 14.99),
  (17, 2, 'aloo parata', 29.99),
  (18, 2, 'Garlic Butter bread', 18.99),
  (19, 1, ' chai', 11.99),
  (20, 1, 'Green Curry', 13.99);
  
  
  CREATE TABLE customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(255),
  address VARCHAR(255),
  contact_number VARCHAR(20)
);


INSERT INTO customer (customer_id, customer_name, address, contact_number)
VALUES 
  (1, 'nkdebug', '123 Main Street, India', '8861736510'),
  (2, 'youdebug', '456 Elm Street, India', '9877787678'),
  (3, 'medebug', '789 Oak Avenue,  India', '9878887657');
  
  


CREATE TABLE orders (
  order_id INT PRIMARY KEY,
  customer_id INT,
  restaurant_id INT,
  order_date DATE,
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
  FOREIGN KEY (restaurant_id) REFERENCES restaurants(id)
);


INSERT INTO orders (order_id, customer_id, restaurant_id, order_date)
VALUES
  (1, 1, 1, '2023-05-10'),
  (2, 2, 1, '2023-05-11'),
  (3, 1, 2, '2023-05-12');
  
  
  



