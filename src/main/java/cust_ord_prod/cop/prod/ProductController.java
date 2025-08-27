package cust_ord_prod.cop.prod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/cop")
public class ProductController {
	
	@Autowired 
	ProductService productService;
	
	@GetMapping(value="/products", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Product> getProduct(){
		return productService.getProducts();
	}

}
