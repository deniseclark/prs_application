//*****************************************************************************
//***                                                                       ***
//*** Class Name:  PurchaseRequestLineItem                                  ***
//***                                                                       ***
//*** Description: The PurchaseRequestLineItem Class Corresponds to the     ***
//***              PURCHASE_REQUEST_LINE_ITME Table in the PRS Database.    ***
//***              All of the Functionality in the Purchase Request Line    ***
//***              Item Class is Applicable to Creating an Object Instance  ***
//***              of a  PurchaseRequestLineItem Class.   See also the      ***
//***              Class PurchaseRequestLineItemDB for Performing DML       ***
//***              Applicable to the PURCHASE_REQUEST_LINE_ITEM Table based ***
//***              on the Purchase Request Class.                           ***
//***                                                                       ***
//*****************************************************************************
public class PurchaseRequestLineItem {

	// **************************
	// *** Instance Variables ***
	// **************************
    private int id;
    private int purchaseRequestId;
    private int productId;
    private int quantity;
    private String reasonForRejection;
    private boolean isActive;
    
	// ***************************
	// *** Default Constructor ***
	// ***************************
	public PurchaseRequestLineItem() {
		id = 0;
		purchaseRequestId = 0;
		productId = 0;
		quantity = 0;
		reasonForRejection = "";
		isActive = true;
	}
    
	// ***********************************
	// *** Fully Qualified Constructor ***
	// ***********************************
	public PurchaseRequestLineItem(int id, int purchaseRequestId, int productId, int quantity,
			String reasonForRejection, boolean isActive) {
		this.id = id;
		this.purchaseRequestId = purchaseRequestId;
		this.productId = productId;
		this.quantity = quantity;
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
	public int getPurchaseRequestId() {
		return purchaseRequestId;
	}
	public void setPurchaseRequestId(int purchaseRequestId) {
		this.purchaseRequestId = purchaseRequestId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + productId;
		result = prime * result + purchaseRequestId;
		result = prime * result + quantity;
		result = prime * result + ((reasonForRejection == null) ? 0 : reasonForRejection.hashCode());
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
		PurchaseRequestLineItem other = (PurchaseRequestLineItem) obj;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		if (productId != other.productId)
			return false;
		if (purchaseRequestId != other.purchaseRequestId)
			return false;
		if (quantity != other.quantity)
			return false;
		if (reasonForRejection == null) {
			if (other.reasonForRejection != null)
				return false;
		} else if (!reasonForRejection.equals(other.reasonForRejection))
			return false;
		return true;
	}
	
	// **********************************
	// ***@Override - toString Method ***
	// **********************************
	@Override
	public String toString() {
		return "PurchaseRequestLineItem [id=" + id + ", purchaseRequestId=" + purchaseRequestId + ", productId="
				+ productId + ", quantity=" + quantity + ", reasonForRejection=" + reasonForRejection + ", isActive="
				+ isActive + "]";
	}
	
	// *************************************************************************
	// *** Display the Content of the Object - More Formatted than toString ***
	// *************************************************************************
	public void displayPurchaseRequestLineItem() {
		System.out.println();
		System.out.println("Current Purchase Request Line Item Values");
		System.out.println("-----------------------------------------");
		System.out.println("ID:                   " + this.id);
		System.out.println("Purchase Request ID:  " + this.purchaseRequestId);
		System.out.println("ProductID:            " + this.productId);
		System.out.println("Quantity:             " + this.quantity);
		System.out.println("Reason for Rejection: " + this.reasonForRejection);
		System.out.println("Active:               " + this.isActive);
	}
      
}
