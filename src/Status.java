// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  Status                                                   ***
// ***                                                                       ***
// *** Description: The Status Class Corresponds to the the STATUS Table in  ***
// ***              the PRS Database.  The STATUS Table is a LookUp Table    ***
// ***              for the Status of a Give Purchase Order.                 ***
// ***                                                                       ***
// *****************************************************************************
public class Status {

	// **************************
	// *** Instance Variables ***
	// **************************
	private int id;
	private String description;
	private boolean isActive;

	// ***************************
	// *** Default Constructor ***
	// ***************************
	public Status() {
		id = 0;
		description = "";
		isActive = true;
	}

	// ************************************
	// *** Fully Qualified Constructor ***
	// ************************************
	public Status(int id, String description, boolean isActive) {
		this.id = id;
		this.description = description;
		this.isActive = isActive;
	}

	// *****************************
	// *** Setters and Getters ***
	// *****************************
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
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
		Status other = (Status) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		return true;
	}

	// **********************************
	// ***@Override - toString Method ***
	// **********************************
	@Override
	public String toString() {
		return "Status [id=" + id + ", description=" + description + ", isActive=" + isActive + "]";
	}

	// *************************************************************
	// *** Display Object Content - More Formatted than toString ***
	// *************************************************************
	public void displayStatus() {
		System.out.println();
		System.out.println("Current Status Values");
		System.out.println("---------------------");
		System.out.println("ID:          " + this.id);
		System.out.println("Description: " + this.description);
		System.out.println("Active:      " + this.isActive);
	}

}