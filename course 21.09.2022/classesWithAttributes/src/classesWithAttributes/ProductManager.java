package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC
		System.out.println("�r�n eklendi " + product.name);
	}
	//hatal� kullan�m ��nk� yeni bir �zellik eklendi�inde her kullan�m yerinde d�zenleme ihtiyac� do�ar
	public void Add2(int id, String name, String description, int stockAmount, double price, String renk ) {
		
	}
}
