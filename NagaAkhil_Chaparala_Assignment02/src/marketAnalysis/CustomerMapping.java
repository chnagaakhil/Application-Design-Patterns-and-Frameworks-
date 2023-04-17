/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Ajay Bandi
 */
public class CustomerMapping {
     private HashMap<Customer, LinkedList<Product>> marketBasket;
     
    /**
     * No-arg constructor
     */ 
    public CustomerMapping() {
        this.marketBasket = new HashMap<>();
    }
    /**
     * Getter method
     * @return marketBasket hashmap
     */
    public HashMap<Customer, LinkedList<Product>> getMarketBasket() {
        return this.marketBasket;
    }

    /**
     *This method add the given product to the customer key of the marketBasket 
     * hashmap. If the customer does not exist, create a new entry in the 
     * marketBasket hashmap.
     * @param customer
     * @param product
     */
    public void addProduct(Customer customer, Product product) {
    	LinkedList<Product> p;
        if(this.marketBasket.containsKey(customer)) {
        	p = this.marketBasket.get(customer);
        	p.add(product);
        	this.marketBasket.put(customer, p);
        } else {
        	p = new LinkedList<Product>();
        	p.add(product);
        	this.marketBasket.put(customer, p);
        }
    }

    /**
     * This method finds the total number of customers in the marketBasket 
     * hashmap who purchased the given product with given brand.
     * @param productName
     * @param brandName
     * @return total number of the customers
     */
    public int findNoOfCustomers(String productName, String brandName) {
        int count = 0;
        for(Map.Entry<Customer, LinkedList<Product>> entry: this.marketBasket.entrySet()) {
        	for(Product p: entry.getValue()) {
        		if(p.getProductBrand().equals(brandName) &&
        				p.getProductName().equals(productName)) {
        			count += 1;
        		}
        	}
        }
        return count;
    }
    
    /**
     * This method finds the customer names those who purchased the products with 
     * the given brandName. 
     * @param brandName
     * @return Set of customer names.
     */
    public Set<String> whoPurchasedProduct(String brandName) {
       Set<String> customers = new TreeSet<>();
       for(Map.Entry<Customer, LinkedList<Product>> entry: this.marketBasket.entrySet()) {
    	   for(Product p: entry.getValue()) {
       		if(p.getProductBrand().equals(brandName)) {
       			customers.add(entry.getKey().toString());
       		}
       	}
       }
       return customers;
    }

    /**
     *This method returns all the unique products in the marketBasket hashmap.
     * @return all the unique products in the marketBasket.
     */
    public List<Product> getProducts() {
        List<Product> products = new LinkedList<>();
        Set<String> p = new TreeSet<>();
        for(Map.Entry<Customer, LinkedList<Product>> entry: marketBasket.entrySet()) {
        	for(Product prod: entry.getValue()) {
        		p.add(prod.toString());
        	}
        }
        for(String s: p) {
        	products.add(new Product(s.split("-")[0], s.split("-")[1]));
        }
        return products;
    }

    /**
     * This method returns all the available brands for a given product.
     * @param productName
     * @return Set of brand names of the given product.
     */
    public Set<String> findAllBrands(String productName) {
        Set<String> brands = new TreeSet<>();
        for(Map.Entry<Customer, LinkedList<Product>> entry: this.marketBasket.entrySet()) {
        	LinkedList<Product> p = entry.getValue();
        	for(Product product: p) {
        		if(product.getProductName().equals(productName)) {
        			brands.add(product.getProductBrand());
        		}
        	}
        }
        return brands;
    }
    
    /**
     * This method returns the size of the marketBasket hashmap.
     * @return the size of the marketBasket
     */
    public int size() {
        return this.marketBasket.size();
    }
}
