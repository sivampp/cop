package cust_ord_prod.cop.prod;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	
	List<Product> getProducts(){
		
		List<Product> products = new ArrayList();
		products.add(new Product("101","Tracfone"));
		products.add(new Product("102","Totalwireless"));
		products.add(new Product("103","SimpleMoble"));
		products.add(new Product("104","Avaya"));
		products.add(new Product("105","Verizon"));
		
		return products;
	}

}
