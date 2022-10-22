/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e21pythagoreantriples;

/**
 * 5.21
 * @author jaz
 */
public class E21PythagoreanTriples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.printf("%s%10s%15s%n", "side1", "side2", "hypotenuse");
        for (int side1 = 1; side1 <= 500; side1++){
            for (int side2 = 1; side2 <= 500; side2++){
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++){
                    if ((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(hypotenuse, 2)){
                        System.out.printf("%5d%10d%15d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
    
}
