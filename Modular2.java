/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class Modular2 {
    static double a;
    static double b;
    static int age;
    static boolean married;
    static double pay;
    static double deduction;
    static double[] tax = {0.05, 0.1, 0.12, 0.15, 0.03 };
//    the method to calculate the payroll
    public static double getPay(){
         a = Modular1.getHours();
         b = Modular1.getRate();
         age = Modular1.getAge();
         married = Modular1.isMarried();
         pay = a * b;
        if (age > 60 && married == true){
//            pay for old married person
            deduction = pay * tax[0];
            pay = pay - deduction;
            
        } else if (age > 60 && married == false){
//            pay for old single person
            deduction = pay * tax[1];
            pay = pay - deduction;
        } else if (age > 22 && married == true){
//            pay for young married person
            deduction = pay * tax[2];
            pay = pay - deduction;
        } else if (age > 22 && married == false){
//            pay for young single person
            deduction = pay * tax[3];
            pay = pay - deduction;
        } else {
//            pay for a minor
            deduction = pay * tax[4];
            pay = pay - deduction;
        }
        System.out.println("You have paid: £" + deduction + " in taxes.");
        return pay;
    }
}
