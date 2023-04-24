/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ajay Bandi
 */
public class CustomerMappingTest {
    CustomerMapping instance;
    
    public CustomerMappingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CustomerMapping();
        instance.addProduct(new Customer("Jon Snow"), new Product("Chips", "Lay's"));
        instance.addProduct(new Customer("Jon Snow"), new Product("Drinks", "Pepsi"));
        instance.addProduct(new Customer("Sansa Stark"), new Product("Drinks", "Pepsi"));
        instance.addProduct(new Customer("Jaime Lannister"), new Product("Bread", "Wonder"));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMarketBasket method, of class CustomerMapping.
     */
    @Test
    public void testGetMarketBasket() {
        int expResult = 4;
        HashMap<Customer, LinkedList<Product>> result = instance.getMarketBasket();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of addProduct method, of class CustomerMapping.
     */
    @Test
    public void testAddProduct() {
        instance.addProduct(new Customer("Jon Snow"), new Product("Drinks", "Pepsi"));
        int result = instance.size();
        int expResult = 5;
        assertEquals(expResult, result);
    }

    /**
     * Test of findNoOfCustomers method, of class CustomerMapping.
     */
    @Test
    public void testFindNoOfCustomers() {
        instance.addProduct(new Customer("Jon Snow"), new Product("Drinks", "Pepsi"));
        String productName = "Drinks";
        String brandName = "Pepsi";
        int expResult = 3;
        int result = instance.findNoOfCustomers(productName, brandName);
        assertEquals(expResult, result);
    }

    /**
     * Test of whoPurchasedProduct method, of class CustomerMapping.
     */
    @Test
    public void testWhoPurchasedProduct() {
        String brandName = "Pepsi";
        Set<String> expResult = new TreeSet<>();
        expResult.add("Jon Snow");
        expResult.add("Sansa Stark");
        Set<String> result = instance.whoPurchasedProduct(brandName);
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of getProducts method, of class CustomerMapping.
     */
    @Test
    public void testGetProducts() {
        List<Product> expResult = new ArrayList<>();
        expResult.add(new Product("Bread", "Wonder"));
        expResult.add(new Product("Chips", "Lay's"));
        expResult.add(new Product("Drinks", "Pepsi"));
        List<Product> result = instance.getProducts();
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of findAllBrands method, of class CustomerMapping.
     */
    @Test
    public void testFindAllBrands() {
        instance.addProduct(new Customer("Jon Snow"), new Product("Drinks", "CocaCola"));
        Set<String> expResult = new TreeSet<>();
        expResult.add("Pepsi");
        expResult.add("CocaCola");
        Set<String> result = instance.findAllBrands("Drinks");
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of size method, of class CustomerMapping.
     */
    @Test
    public void testSize() {
        int result = instance.size();
        int expResult = 4;
        assertEquals(expResult, result);
    }
    
}
