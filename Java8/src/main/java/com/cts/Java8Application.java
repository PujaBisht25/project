package com.cts;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.calculator.Add;
import com.cts.calculator.Division;
import com.cts.calculator.Product;
import com.cts.calculator.Subtract;

interface Plan{
	 public void welcome() ;
}
@SpringBootApplication
public class Java8Application {
	
 
	public static void main(String[] args) {
		//SpringApplication.run(Java8Application.class, args);
		Plan obj=()->System.out.println("hlw world");
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter the 1st number");
		int x=sc.nextInt();
		System.out.println("enter the 2nd number");
		int y=sc.nextInt();
		
		obj.welcome();
		Add obj1=(a,b)-> a+b;
		System.out.println(x+"+"+y+" = "+obj1.add(x, y));
		Division obj2=(a,b)-> a/b;
		System.out.println(x+"/"+y+" = "+obj2.divide(x, y));
		System.out.println(obj2.divide(45, 89));
        Product obj3=(a,b)-> a*b;
        System.out.println(x+"*"+y+" = "+obj3.product(x, y));
        Subtract obj4=(a,b)-> a-b;
        System.out.println(x+"-"+y+" = "+obj4.subtract(x,y));
        
}
}
