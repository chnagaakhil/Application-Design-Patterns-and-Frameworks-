/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

/**
 *
 * @author AJAY
 */
public class CatDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c1 = new Cat("Kit", 2);
        Cat c2 = new Cat("Kit", 2);
        Cat c3 = new Cat("Kitten", 2);

        System.out.println("***** .equals *****");
        System.out.println(c1.equals(c2));//t
        System.out.println(c1.equals(c3));//f
        System.out.println(c2.equals(c3));//f

        System.out.println("***** == *****");
        System.out.println((c1 == c2));//f
        System.out.println((c1 == c3));//f
        System.out.println((c2 == c3));//f

        System.out.println("***** hashcode *****");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        
        System.out.println("*****address*****");
        System.out.println(Integer.toHexString(System.identityHashCode(c1)));
        System.out.println(Integer.toHexString(System.identityHashCode(c2)));
        System.out.println(Integer.toHexString(System.identityHashCode(c3)));
    }

}
