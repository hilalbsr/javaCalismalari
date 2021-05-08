package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] products = new Product[2];
		
		
		
		Product product1 = new Product();
		
		product1.setId(1);
		product1.setName("Laptop");
		product1.setUnitPrice(100);

		products[0] = product1;
		
		System.out.println(products[0].getName());
		System.out.println(product1.getId() + " " + product1.getName());
	}
}
