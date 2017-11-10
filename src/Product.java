//*****************************************************************************
//***                                                                       ***
//*** Class Name:  Product                                                  ***
//***                                                                       ***
//*** Description: The Product Class Corresponds to the PRODUCT Table in the***
//***              PRS Database.  All of the Functionality in the Product   ***
//***              Class is Applicable to Creating an Object Instance of    ***
//***              the Product Class.   See also the Class ProductDB for    ***
//***              Performing DML Applicable to the PRODUCT Table based on  ***
//***              the Product Class                                        ***
//***                                                                       ***
//*****************************************************************************
public class Product {

	// **************************
	// *** Instance Variables ***
	// **************************
	private int id;
	private int vendorId;
	private String partNumber;
	private String name;
	private double price;
	private int unit;
	private String photoPath;
	private boolean isActive;

	// ***************************
	// *** Default Constructor ***
	// ***************************
	public Product() {
		id = 0;
		vendorId = 0;
		partNumber = "";
		name = "";
		price = 0.0;
		unit = 0;
		photoPath = "";
		isActive = true;
	}

	// ************************************
	// *** Fully Qualified Constructor ***
	// ************************************
	public Product(int id, int vendorId, String partNumber, String name, double price, int unit, String photoPath,
			boolean isActive) {
		this.id = id;
		this.vendorId = vendorId;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
		this.isActive = isActive;
	}

	// ***************************
	// *** Setters and Getters ***
	// ***************************
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	// **********************************
	// ***@Override - hashCode Method ***
	// **********************************
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((partNumber == null) ? 0 : partNumber.hashCode());
		result = prime * result + ((photoPath == null) ? 0 : photoPath.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + unit;
		result = prime * result + vendorId;
		return result;
	}

	// ********************************
	// ***@Override - equals Method ***
	// ********************************
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (partNumber == null) {
			if (other.partNumber != null)
				return false;
		} else if (!partNumber.equals(other.partNumber))
			return false;
		if (photoPath == null) {
			if (other.photoPath != null)
				return false;
		} else if (!photoPath.equals(other.photoPath))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (unit != other.unit)
			return false;
		if (vendorId != other.vendorId)
			return false;
		return true;
	}

	// **********************************
	// ***@Override - toString Method ***
	// **********************************
	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorId=" + vendorId + ", partNumber=" + partNumber + ", name=" + name
				+ ", price=" + price + ", unit=" + unit + ", photoPath=" + photoPath + ", isActive=" + isActive + "]";
	}

	// ************************************************************************
	// *** Display the Content of the Object - More Formatted than toString ***
	// ************************************************************************
	public void displayProduct() {
		System.out.println();
		System.out.println("Current Product Values");
		System.out.println("----------------------");
		System.out.println("ID:            " + this.id);
		System.out.println("VendorID:      " + this.vendorId);
		System.out.println("Part Number:   " + this.partNumber);
		System.out.println("Product Name:  " + this.name);
		System.out.println("Price:         " + this.price);
		System.out.println("Unit:          " + this.unit);
		System.out.println("PhotoPath:     " + this.photoPath);
		System.out.println("Active:        " + this.isActive);
	}

}
