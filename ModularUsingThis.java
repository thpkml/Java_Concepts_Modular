/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class ModularUsingThis {
    private String name;
    private double hours;
    private double rate;
    private double tax;
    
//    constructor
    public ModularUsingThis(String name, double hours, double rate, double tax){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.tax = tax;
    }
    
    public double grossPay(){
        double gross = hours * rate;
        return gross;
    }
    public double netPay(){
        double net = hours * rate * (1 - tax/100);
        return net;
    }
    void display(){
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: " + rate);
        System.out.println("Tax rate: " + tax);
        System.out.println("Gross pay: " + grossPay());
        System.out.println("Net pay: " + netPay());
    }
}
