package dto;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String bookId;
	private String name;
	private Integer unitPrice;
	private String author;
	private String description;
	private String publisher;
	private String category;
	private long unitInStock;
	private long totalPages;
	private String releaseDate;
	private String condition;
	private String filename;
	private int quantity;
	
	public Book() {
		super();
	}
	public Book(String bookId, String name, int unitprice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitprice;
	}
	// bookId
	public String getbookId() {
		return bookId;
	}
	public void setbookId(String s) {
		this.bookId =s;
	}
	
	// name
	public String getName() {
		return name;
	}
	public void setName(String s) {
		this.name = s;
	}
	
	// unitPrice
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int s) {
		this.unitPrice = s;
	}
	
	//author
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String s) {
		this.author = s;
	}
	
	//description
	public String getDescription() {
		return description;
	}
	public void setDescription(String s) {
		this.description = s;
	}
	
	//publisher
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String s) {
		this.publisher = s;
	}
	
	//category
	public String getCategory() {
		return category;
	}
	public void setCategory(String s) {
		this.category = s;
	}
	// unitInStock
	public long getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(long s) {
		this.unitInStock = s;
	}
	//totalPages
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long s) {
		this.totalPages = s;
	}
	//releaseDate
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String s) {
		this.releaseDate = s;
	}
	//condition
	public String getCondition() {
		return condition;
	}
	public void setCondition(String s) {
		this.condition = s;
	}
	
	//images
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
