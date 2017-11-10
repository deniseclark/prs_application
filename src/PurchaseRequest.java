//*****************************************************************************
//***                                                                       ***
//*** Class Name:  PurchaseRequest                                          ***
//***                                                                       ***
//*** Description: The PurchaseRequest Class Corresponds to the             ***
//***              PURCHASE_REQUEST Table in the PRS Database.              ***
//***              All of the Functionality in the Purchase Request Class   ***
//***              is Applicable to Creating an Object Instance of a        ***
//***              Purchase Request Class.   See also the Class             ***
//***              PurchaseRequestDB for Performing DML Applicable to the   ***
//***              PURCHASE_REQUEST Table based on the Purchase Request     ***
//***              Class.                                                   ***
//***                                                                       ***
//*****************************************************************************
public class PurchaseRequest {

	// **************************
	// *** Instance Variables ***
	// **************************
	private int id;
	private int userId;
	private String description;
	private String justification;
	private String dateNeeded; // Coming from DB as DATE ???
	private String deliveryMode;
	private int statusId;
	private double total;
	private String submittedDate; // Coming from DB as DATE ???
	private String reasonForRejection;
	private boolean isActive;

	// ***************************
	// *** Default Constructor ***
	// ***************************
	public PurchaseRequest() {
		id = 0;
		userId = 0;
		description = "";
		justification = "";
		dateNeeded = "";
		deliveryMode = "";
		statusId = 0;
		total = 0.0;
		submittedDate = "";
		reasonForRejection = "";
		isActive = true;
	}

	// ***********************************
	// *** Fully Qualified Constructor ***
	// ***********************************
	public PurchaseRequest(int id, int userId, String description, String justification, String dateNeeded,
			String deliveryMode, int statusId, double total, String submittedDate, String reasonForRejection,
			boolean isActive) {
		this.id = id;
		this.userId = userId;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.statusId = statusId;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
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
		result = prime * result + ((dateNeeded == null) ? 0 : dateNeeded.hashCode());
		result = prime * result + ((deliveryMode == null) ? 0 : deliveryMode.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((justification == null) ? 0 : justification.hashCode());
		result = prime * result + ((reasonForRejection == null) ? 0 : reasonForRejection.hashCode());
		result = prime * result + statusId;
		result = prime * result + ((submittedDate == null) ? 0 : submittedDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + userId;
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
		PurchaseRequest other = (PurchaseRequest) obj;
		if (dateNeeded == null) {
			if (other.dateNeeded != null)
				return false;
		} else if (!dateNeeded.equals(other.dateNeeded))
			return false;
		if (deliveryMode == null) {
			if (other.deliveryMode != null)
				return false;
		} else if (!deliveryMode.equals(other.deliveryMode))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		if (justification == null) {
			if (other.justification != null)
				return false;
		} else if (!justification.equals(other.justification))
			return false;
		if (reasonForRejection == null) {
			if (other.reasonForRejection != null)
				return false;
		} else if (!reasonForRejection.equals(other.reasonForRejection))
			return false;
		if (statusId != other.statusId)
			return false;
		if (submittedDate == null) {
			if (other.submittedDate != null)
				return false;
		} else if (!submittedDate.equals(other.submittedDate))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	// **********************************
	// ***@Override - toString Method ***
	// **********************************
	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", userId=" + userId + ", description=" + description + ", "
				+ "justification=" + justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode
				+ ", " + "statusID=" + statusId + ", total=" + total + ", submittedDate=" + submittedDate + ", "
				+ "reasonForRejection=" + reasonForRejection + ", isActive=" + isActive + "]";
	}

	// *************************************************************************
	// *** Display the Content of the Object - More Formatted than toString ***
	// *************************************************************************
	public void displayPurchaseRequest() {
		System.out.println();
		System.out.println("Current Purchase Request Values");
		System.out.println("-------------------------------");
		System.out.println("ID:                   " + this.id);
		System.out.println("UserID:               " + this.userId);
		System.out.println("Description:          " + this.description);
		System.out.println("Justification:        " + this.justification);
		System.out.println("DateNeeded:           " + this.dateNeeded);
		System.out.println("DeliveryMode:         " + this.deliveryMode);
		System.out.println("StatusID:             " + this.statusId);
		System.out.println("Total:                " + this.total);
		System.out.println("SubmittedDate:        " + this.submittedDate);
		System.out.println("Reason for Rejection: " + this.reasonForRejection);
		System.out.println("Active:               " + this.isActive);
	}

}
