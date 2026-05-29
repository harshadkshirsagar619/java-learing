package CollectionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapCRUD {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1. add book");
            System.out.println("2. update book");
            System.out.println("3. view book");
            System.out.println("4. delete book");
            System.out.println("Enter the choice : ");
            int choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("enetr the book name :");
                String book = sc.next();
                if (map.containsKey(book))
                {
                    System.out.println("Book already Exits");
                }else {
                    System.out.println("Enetr the book price");
                    int price = sc.nextInt();
                    map.put(book,price);
                    System.out.println("Book added Successfully");
                }
            } else if (choice == 2) {
                System.out.println("enetr the book name :");
                String name = sc.next();
                if (map.containsKey(name))
                {

                    System.out.println("Enetr the price to update:");
                    int price = sc.nextInt();
                    map.replace(name,price);
                    System.out.println("Book Updated successfully");

                }else {
                    System.out.println("Book not exits");
                }
            } else if (choice == 3) {

                System.out.println("Details");
                map.forEach((key,values)->{
                    System.out.println("Book Name :"+key+" | Price : "+values);
                });
            } else if (choice == 4) {
                System.out.println("Eentr the book name to remove");
                String book = sc.next();
                if (map.containsKey(book))
                {
                    map.remove(book);
                    System.out.println("Book removed");
                }
            }else {
                System.exit(0);
            }

        }
    }
}
