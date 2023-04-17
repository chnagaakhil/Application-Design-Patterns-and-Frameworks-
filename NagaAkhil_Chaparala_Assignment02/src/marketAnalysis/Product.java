/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketAnalysis;

import java.util.Objects;

/**
 *
 * @author Ajay Bandi
 */
public class Product {
    private String productName;
    private String productBrand;

    public Product(String productName, String productBrand){
        this.productName = productName;
        this.productBrand = productBrand;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductBrand() {
        return this.productBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productBrand);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
        	return true;
        } else if(!(obj instanceof Product)) {
        	return false;
        } else {
        	Product p = (Product)obj;
        	return (this.productBrand == p.productBrand) && 
        			(this.productName == p.productName);
        }
    }
    
    @Override
    public String toString(){
        return this.productName + "-" + this.productBrand;
    }
}
