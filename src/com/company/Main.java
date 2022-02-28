package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a =scanner.nextLine();

            switch (Days.valueOf(a.toUpperCase())){
                case MONDAY -> System.out.println("On monday we have a lesson");
                case TUESDAY -> System.out.println("On tuesday we have a session");
                case WEDNESDAY -> System.out.println("On wednesday we have a lesson");
                case THURSDAY -> System.out.println("On thursday we have a session");
                case FRIDAY -> System.out.println("On friday we have a lesson");
                case SATURDAY -> System.out.println("On Saturday we rest");
                case SUNDAY -> System.out.println("On sunday we rest");
            }


    }
}
