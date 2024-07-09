package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    

    private static String url="jdbc:mysql://localhost:3306/hotel_db";
    private static String user="root";
    private static String password="";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (Exception e){
            System.out.println(e);
        }

        try {
            DriverManager.getConnection(url,user,password);
            while (true){
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner scanner=new Scanner(System.in);
                System.out.println("1. Add new room");
                System.out.println("2. Show all rooms");
                System.out.println("3. Edit room data");
                System.out.println("4. Add new guest");
                System.out.println("5. Show all guests");
                System.out.println("6. Search guest by name");
                System.out.println("7. Edit guest data");
                System.out.println("8. Create new reservation");
                System.out.println("9. Show all reservations");
                System.out.println("10. Get reservation by guest name");
                System.out.println("11. Get reservation by guest id");
                System.out.println("12. Edit reservation");
                System.out.println("13. Pay reservation");
                System.out.println("14. Add new Employee");
                System.out.println("15. Show all employees");
                System.out.println("16. Edit employee data");
                System.out.println("17. Quit");
                int choice=scanner.nextInt();

                switch (choice){
                    case 1:
                        RoomController.addroom( connection,scanner );
                }



            }


        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                if(connection!=null){
                    statement.close();
                    resultSet.close();
                    connection.close();

                }

            }catch (Exception e){
                System.out.println(e);
            }
        }



    }




}












