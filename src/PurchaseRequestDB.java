import java.util.Scanner;

// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  PurchaseRequestDB                                        ***
// ***                                                                       ***
// *** Description: The PurchaseRequestDB Class Contains Functionality for   ***
// ***              Selecting, Inserting, Updating and Deleting Data from    ***
// ***              the PURCHASE_REQUEST Table in the PRS Database based on  ***
// ***              the Java PurchaseRequest Class.                          ***
// ***                                                                       ***
// *** Note -->     There is Currently no GUI or DB Functionality            ***
// ***                                                                       ***
// *****************************************************************************
public class PurchaseRequestDB {

	// ************************************
	// *** Method: queryPurchaseRequest ***
	// ************************************

	// *************************************
	// *** Method: updatePurchaseRequest ***
	// *************************************

	// *************************************
	// *** Method: deletePurchaseRequest ***
	// *************************************
	
	// *************************************
	// *** Method: insertPurchaseRequest ***
	// *************************************	
	public static PurchaseRequest insertPurchaseRequest(Scanner sc) {
		System.out.println();
		System.out.println("****************************************");
		System.out.println("*** Create a New Purchase Request... ***");
		System.out.println("****************************************");
		int id                    = Console.getInt      (sc, "Enter PurchaseRequestID:          ", 1, 9999);
		int userId                = Console.getInt      (sc, "Enter UserID:                     ", 1, 9999);
		String description        = Console.getString   (sc, "Enter Description                 ", 1, 100);
		String justification      = Console.getString   (sc, "Enter Justification               ", 1, 255);
		String dateNeeded         = Console.getString   (sc, "Enter Date Needed DD-MON-YYYY:    ", 11);
		dateNeeded = Format.fmtToUpperCase(dateNeeded);
	    String deliveryMode       = Console.getString   (sc, "Enter Delivery Mode:              ", 1,25);
	    deliveryMode  = Format.fmtToUpperCase(deliveryMode);
		int statusId              = Console.getInt      (sc, "Enter StatusID:                   ", 1, 9999);
		double total              = Console.getDouble   (sc, "Enter Total:                      ");
		String submittedDate      = Console.getString   (sc, "Enter Date Submitted DD-MON-YYYY: ", 11);
		submittedDate = Format.fmtToUpperCase(submittedDate);
	    String reasonForRejection = Console.getString   (sc, "Enter Reason for Rejection:       ");
		boolean isActive          = Console.getYNBoolean(sc, "Active? Y/N:                      ");

		// *******************************************************
		// *** Create a new Instance User based on Data Entry ***
		// *******************************************************
		PurchaseRequest pr = new PurchaseRequest 
				(id, userId, description, justification, dateNeeded, deliveryMode, statusId, total,
				 submittedDate, reasonForRejection, isActive);
		return pr;
	}
}