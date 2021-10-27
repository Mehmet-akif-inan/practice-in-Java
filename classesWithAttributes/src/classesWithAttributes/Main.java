package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product= new Product(123, "Akif", 499, 1, "Hello");
		
		/*
	 	product.setId(123) ;
		product.setName("Akif");
		product.setPrice(499);
		product.setDescription("hello");
		product.setStockAmount(1);
		*/
		
		productManager productManager= new productManager();
		productManager.Add(product);
		
		
	}

}
