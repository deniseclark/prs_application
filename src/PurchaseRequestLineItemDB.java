import java.util.Scanner;

// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  PurchaseRequestLineItemDB                                ***
// ***                                                                       ***
// *** Description: The PurchaseRequestLineItemDB Class Contains             ***
// ***              Functionality for Selecting, Inserting, Updating and     ***
// ***              Deleting Data from the PURCHASE_REQUEST_LINE_ITEM Table  ***
// ***              in the PRS Database based on the Java                    ***
// ***              PurchaseRequestLineItem Class.                           ***
// ***                                                                       ***
// *** Note -->     There is Currently no GUI or DB Functionality            ***
// ***                                                                       ***
// *****************************************************************************
public class PurchaseRequestLineItemDB {

	// ********************************************
	// *** Method: queryPurchaseRequestLineItem ***
	// ********************************************

	// *********************************************
	// *** Method: updatePurchaseRequestLineItem ***
	// *********************************************

	// *********************************************
	// *** Method: deletePurchaseRequestLineItem ***
	// *********************************************

	// *********************************************
	// *** Method: insertPurchaseRequestLineItem ***
	// *********************************************
	public static PurchaseRequestLineItem insertPurchaseRequestLineItem(Scanner sc) {
		System.out.println();
		System.out.println("**************************************************");
		System.out.println("*** Create a New Purchase Request Line Item... ***");
		System.out.println("**************************************************");
		int id                    = Console.getInt      (sc, "Enter LineItemID:           ", 1, 9999);
		int purchaseRequestId     = Console.getInt      (sc, "Enter PurchaseRequestID:    ", 1, 9999);
		int productId             = Console.getInt      (sc, "Enter ProductID             ", 1, 9999);
		int quantity              = Console.getInt      (sc, "Enter Quantity:             ", 1, 99);
		String reasonForRejection = Console.getString   (sc, "Enter Reason for Rejection: ", 0, 255);
		boolean isActive          = Console.getYNBoolean(sc, "Active? Y/N:                ");

		// *******************************************************
		// *** Create a new Instance User based on Data Entry ***
		// *******************************************************
		PurchaseRequestLineItem lineItem = new PurchaseRequestLineItem(id, purchaseRequestId, productId, quantity,
				reasonForRejection, isActive);
		return lineItem;
	}
}