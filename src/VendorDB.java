import java.util.Scanner;

// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  VendorDB                                                 ***
// ***                                                                       ***
// *** Description: The VendorDB Class Contains Functionality for Selecting, ***
// ***              Inserting, Updating and Deleting Data from the VENDOR    ***
// ***              Table in the PRS Database based on the Java Vendor Class.***
// ***                                                                       ***
// *** Note -->     There is Currently no GUI or DB Functionality            ***
// ***                                                                       ***
// *****************************************************************************
public class VendorDB {

	// ***************************
	// *** Method: queryVendor ***
	// ***************************

	// ****************************
	// *** Method: updateVendor ***
	// ****************************

	// ****************************
	// *** Method: deleteVendor ***
	// ****************************

	// ****************************
	// *** Method: insertVendor ***
	// ****************************
	public static Vendor insertVendor(Scanner sc) {
		System.out.println();
		System.out.println("******************************");
		System.out.println("*** Create a New Vendor... ***");
		System.out.println("******************************");
		int id                = Console.getInt      (sc, "Enter VendorID:       ", 1, 9999);
		String code           = Console.getString   (sc, "Enter Vendor Code:     ", 2, 10);
	    code = Format.fmtToUpperCase(code);
		String name           = Console.getString   (sc, "Enter Vendor Name:     ", 2, 255);
		name = Format.fmtToTitleCase(name);
		String address        = Console.getString   (sc, "Enter Address:         ", 2, 255);
		address = Format.fmtToCamelCase(address);
		String city           = Console.getString   (sc, "Enter City:            ", 2, 255);
		city = Format.fmtToUpperCase(city);
		String state          = Console.getString   (sc, "Enter State Code:      ", 2);
		state = Format.fmtToUpperCase(state);
		int zipNum            = Console.getInt      (sc, "Enter 5 Digit ZipCode: ", 5);
		String zip = String.valueOf(zipNum);
		long phoneNumber      = Console.getLong     (sc, "Enter 10 Digit Phone#: ", 10);
		String phone = Format.fmtPhoneNumber(phoneNumber);
		String email          = Console.getEmail    (sc, "Enter Email Address:   ");
		email = Format.fmtToLowerCase(email);
		boolean isPreApproved = Console.getYNBoolean(sc, "Pre-Approved? Y/N:     ");
		boolean isActive      = Console.getYNBoolean(sc, "Active? Y/N:           ");

		// ********************************************************
		// *** Create a new Instance Vendor based on Data Entry ***
		// ********************************************************
		Vendor vendor = new Vendor(id, code, name, address, city, state, zip, phone, email, isPreApproved, isActive);
		return vendor;

	}
}