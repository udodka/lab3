package com.company;
import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern datePattern = Pattern.compile(
                "^(31|30|([0-2]\\d))\\/" +
                "((0\\d)|(1[0-2]))\\/" +
                "((19)|([2-9][0-9])([0-9]{2}))$");
        System.out.print("Enter the date: ");
        String date = in.nextLine();
        Matcher dateMatcher = datePattern.matcher(date);
        if (dateMatcher.matches()) {
            System.out.println("The date is dd/mm/yyyy!");
        } else {
            System.out.println("The date is invalid.");
        }
        in.close();
    }
}
