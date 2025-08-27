package cust_ord_prod.cop.prod;

public class Product {
	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
}
