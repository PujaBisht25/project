package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.model.Product;

@SpringBootApplication
public class StreamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamApiApplication.class, args);
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"Laptop",25000f));  
        productsList.add(new Product(2,"Table",30000f));  
        productsList.add(new Product(3,"Leneno Tv",88000f));  
        productsList.add(new Product(4,"Computer",30000f));  
        productsList.add(new Product(5,"WashingMachine",90000f));
        productsList.add(new Product(4,"Chimney",38000f));  
        productsList.add(new Product(5,"Refrigerator",90000f));
        productsList.add(new Product(4,"Desk",58000f));  
        productsList.add(new Product(5,"Laviender",90000f));
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2); 
        
        productsList.stream()  
        .filter(product -> product.price == 30000)  
        .forEach(product -> System.out.println(product.name));  
        
     // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
        
     // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println(productA.price);  
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println(productB.price);  
	}

}
