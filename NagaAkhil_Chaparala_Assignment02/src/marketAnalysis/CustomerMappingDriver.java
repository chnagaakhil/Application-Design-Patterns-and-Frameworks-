/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Ajay Bandi
 */
public class CustomerMappingDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        CustomerMapping inventory = new CustomerMapping();
        Scanner scan = new Scanner(new File("input.txt"));
        /**
         * Read the given input file and populate the inventory using addProduct
         * method.
         */
        String line = scan.nextLine();
        while(scan.hasNext()) {
        	String name = scan.nextLine();
        	Customer customer = new Customer(name);
        	while(scan.hasNext()) {
        		String productDetails = scan.nextLine();
        		if(!productDetails.equals(line)) {
        			Product p = new Product(productDetails.split("-")[0], 
    						productDetails.split("-")[1]);
        			inventory.addProduct(customer, p);
        		}
        		else {
        			break;
        		}
        	}
        }
        System.out.println("All the available brands for the product 'Chips' are:");
        System.out.println(inventory.findAllBrands("Chips"));
        System.out.print("The number of customers who purchased Oreo cookies: ");
        System.out.println(inventory.findNoOfCustomers("Cookies", "Oreo"));
        System.out.println("The customers who purchased Kellogg's products: ");
        System.out.println(inventory.whoPurchasedProduct("Kellogg's"));
        System.out.print("The number of unique products in inventory are: ");
        System.out.println(inventory.getProducts().size());
    }
    
}
