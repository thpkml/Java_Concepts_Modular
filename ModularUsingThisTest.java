/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author luisadominguez
 */
public class ModularUsingThisTest {
    public static void main(String[] args){
        ModularUsingThis emp1 = new ModularUsingThis("John Taylor", 45.5, 12.35, 14.55);
        ModularUsingThis emp2 = new ModularUsingThis("Luisa Smith", 40.05, 15.5, 15.65);
        ModularUsingThis emp3 = new ModularUsingThis("Brad Traversy", 40.75, 12.35, 14.55);
        
//        Display the employee information using the method defined in previous class
    emp1.display();
    emp2.display();
    emp3.display();
    }
}
