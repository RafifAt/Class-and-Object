/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author asus
 */
public class Latihan1 extends Vehicle{
    
    public void walk(){
        System.out.println("Flying");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Latihan1 masuk = new Latihan1();
    masuk.function();
    masuk.fuel();
    masuk.walk();
    }
    
}
