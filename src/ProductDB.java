import java.util.Scanner;

// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  ProductDB                                                ***
// ***                                                                       ***
// *** Description: The ProductDB Class Contains Functionality for Selecting,***
// ***              Inserting, Updating and Deleting Data from the PRODUCT   ***
// ***              Table in the PRS Database based on the Java Product Class***
// ***                                                                       ***
// *** Note -->     There is Currently no GUI or DB Functionality            ***
// ***                                                                       ***
// *****************************************************************************
public class ProductDB {

	// ****************************
	// *** Method: queryProduct ***
	// ****************************

	// *****************************
	// *** Method: updateProduct ***
	// *****************************

	// *****************************
	// *** Method: deleteProduct ***
	// *****************************

	// *****************************
	// *** Method: insertProduct ***
	// *****************************
	public static Product insertProduct(Scanner sc) {
		System.out.println();
		System.out.println("*******************************");
		System.out.println("*** Create a New Product... ***");
		System.out.println("*******************************");
		int id            = Console.getInt      (sc, "Enter ProductID:   ", 1, 9999);
		int vendorId      = Console.getInt      (sc, "Enter VendorID:    ", 1, 9999);
		String partNumber = Console.getString   (sc, "Enter Part Number: ", 1, 50);
		partNumber        = Format.fmtToUpperCase(partNumber);
		String name       = Console.getString   (sc, "Enter Part Name:   ", 1, 150);
		double price      = Console.getDouble   (sc, "Enter Price:       ");
		int unit          = Console.getInt      (sc, "Enter Units:       ", 1, 255);
		String photoPath  = Console.getString   (sc, "Enter Photo URL:   ", 0, 255);
		boolean isActive  = Console.getYNBoolean(sc, "Active? Y/N:       ");

		// *********************************************************
		// *** Create a new Instance Product based on Data Entry ***
		// *********************************************************
		Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath, isActive);
		return product;

	}
}