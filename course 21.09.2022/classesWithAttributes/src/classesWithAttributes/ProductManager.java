package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC
		System.out.println("Ürün eklendi " + product.name);
	}
	//hatalý kullaným çünkü yeni bir özellik eklendiðinde her kullaným yerinde düzenleme ihtiyacý doðar
	public void Add2(int id, String name, String description, int stockAmount, double price, String renk ) {
		
	}
}
