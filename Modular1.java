/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
import java.util.Scanner;

public class Modular1 {
//    methods to collect user input
    static Scanner sc = new Scanner(System.in);
    public static double getHours(){
        System.out.println("Enter your hours: ");
        double x = sc.nextDouble();
        return x;
    }
    public static double getRate(){
        System.out.println("Enter your pay rate per hour: ");
        double r = sc.nextDouble();
        return r;
    }
    public static int getAge(){
        System.out.println("How old are you?");
        int age = sc.nextInt();
        return age;
    }
    public static boolean isMarried(){
        boolean married = false;
        System.out.println("Are you married? y/n : ");
        String answer = sc.next();
        if (answer.equals('y')){
            married = true;
        } else if (answer.equals('n')){
            married = false;
        } 
        return married;
    }
}
