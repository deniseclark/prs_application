import java.util.Scanner;

// ****************************************************************************
// ***                                                                      ***
// *** Class Name:  PRSApp  (Purchase Request System)                       ***
// ***                                                                      ***
// *** Description: The PRS Application is a Purchase Request System that   ***
// ***              will Enable the Creation and Management of Purchase     ***
// ***              Orders within the PRS Database.                         ***
// ***                                                                      ***
// ****************************************************************************
public class PRSApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menuOption = 0;
		boolean exitApp = false;

		// ********************
		// *** Menu Display ***
		// ********************
		System.out.println();
		System.out.println("**************************************");
		System.out.println("*** Purchase  Request  Application ***");
		System.out.println("**************************************");
		System.out.println();
		System.out.println("  1.) Add a New User");
		System.out.println("  2.) Add a New Status");
		System.out.println("  3.) Add a New Vendor");
		System.out.println("  4.) Add a New Product");
		System.out.println("  5.) Add a New Purchase Request");
		System.out.println("  6.) Add a New Purchase Request Line Item");
		System.out.println("  7.) Exit");

		// *******************************************************
		// *** While User Continues to Select a Menu Option... ***
		// *******************************************************
		while (!exitApp) {
			System.out.println();
			menuOption = Console.getInt(sc, "Menu Option: ", 1, 7);
			switch (menuOption) {
			case 1:
				// **********************
				// *** Add a New User ***
				// **********************
				User user = UserDB.insertUser(sc);
				user.displayUser();
				break;
			case 2:
				// ************************
				// *** Add a New Status ***
				// ************************
				Status status = StatusDB.insertStatus(sc);
				status.displayStatus();
				break;
			case 3:
				// ************************
				// *** Add a New Vendor ***
				// ************************
				Vendor vendor = VendorDB.insertVendor(sc);
				vendor.displayVendor();
				break;
			case 4:
				// *************************
				// *** Add a New Product ***
				// *************************
				Product product = ProductDB.insertProduct(sc);
				product.displayProduct();
				break;
			case 5:
				// **********************************
				// *** Add a New Purchase Request ***
				// **********************************
				PurchaseRequest pr = PurchaseRequestDB.insertPurchaseRequest(sc);;
				pr.displayPurchaseRequest();
				break;
			case 6:
				// *********************************************
				// *** Add a New Purchase Request Line Items ***
				// *********************************************
				PurchaseRequestLineItem lineItem = PurchaseRequestLineItemDB.insertPurchaseRequestLineItem(sc);
				lineItem.displayPurchaseRequestLineItem();
				break;
			case 7:
			default:
				// ************************
				// *** Exit Application ***
				// ************************
				System.out.println("\nGoodbye");
				exitApp = true;
				break;
			} // end switch
		} // end while
	} // end main

} // end class
