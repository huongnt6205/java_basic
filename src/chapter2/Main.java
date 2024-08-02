package chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);      

        System.out.print("Nhập vào một dòng văn bản: ");
        String input = scanner.nextLine();
        
        System.out.println("Bạn đã nhập: " + input);
        
        String intString = "123";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);
        
        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);
        //khai báo hằng
        final double PI = 3.14159;
        System.out.println(PI);
        scanner.close();
    }
}