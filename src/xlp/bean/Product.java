package xlp.bean;

public class Product {
	private String code;
	private String name; 
	private String dueDate;
	private Double price;
	private String type;
	
	public Product(){}
	
	public Product(String code, String name, String dueDate, Double price, String type) {
		super();
		this.code = code;
		this.name = name;
		this.dueDate = dueDate;
		this.price = price;
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}