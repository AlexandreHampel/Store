package hello;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private double price;
	
	public Product() {
	
	}
public Product(int id, String name, double price) {
	this.id = id;
	this.name = name;
	this.price = price;
}
public int getId() {
	return id;
}

public void setId(int value) {
	id	= value;
}

public String getName() {
	return name;
}

public void setName(String value) {
	name = value;
}

public double getPrice() {
	return price;
}

public void setPrice(double value) {
	price = value;
}
}