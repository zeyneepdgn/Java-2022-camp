package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yap�c� blok �al��t�");
		this.id=id;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.description=description;
		this.stockAmount=stockAmount;
		
	}
	
	public Product() { //overloading
		
	}
	// attribute | field

	private int id; // _ koyman�n amac� kar���kl��� engellemektir
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;


	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}



	/*
	// attribute | field
	// asl�nda public her sat�rda var.
	private int id; // _ koyman�n amac� kar���kl��� engellemektir
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	 * //de�i�kenlerimiz ba�ka classlar i�inde g�r�nmesi i�in get/set fonksiyonlar�
	 * kullan�l�r
	 * 
	 * //getter public int getId() { //�r�n �dsini okuyabilir.Set ya da get yaz�lmak
	 * zorunda de�il. return _id; }
	 * 
	 * //setter public void setId(int id) { //this i�erisinde bulundu�un id'yi
	 * g�sterir _id = id; }
	 * 
	 * public String getName() { return _name; }
	 * 
	 * public void setName(String name) { this._name = name; }
	 * 
	 * public String getDescription() { return _description; }
	 * 
	 * public void setDescription(String description) { this._description =
	 * description; }
	 * 
	 * public double getPrice() { return _price; }
	 * 
	 * public void setPrice(double price) { this._price = price; }
	 * 
	 * public int getStockAmount() { return _stockAmount; }
	 * 
	 * public void setStockAmount(int stockAmount) { this._stockAmount =
	 * stockAmount; }
	 * 
	 * public String getRenk() { return _renk; }
	 * 
	 * public void setRenk(String renk) { this._renk = renk; }
	 * 
	 * public String getKod() { return _kod; }
	 * 
	 * public void setKod(String kod) { this._kod = kod; }
	 * 
	 */

}
