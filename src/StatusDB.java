import java.util.Scanner;

// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  StatusDB                                                 ***
// ***                                                                       ***
// *** Description: The StatusDB Class Contains Functionality for Selecting, ***
// ***              Inserting, Updating and Deleting Data from the STATUS    ***
// ***              Table in the PRS Database based on the Java Status Class.***
// ***                                                                       ***
// *** Note -->     There is Currently no GUI or DB Functionality            ***
// ***                                                                       ***
// *****************************************************************************
public class StatusDB {

	// ***************************
	// *** Method: queryStatus ***
	// ***************************

	// ****************************
	// *** Method: updateStatus ***
	// ****************************

	// ****************************
	// *** Method: deleteStatus ***
	// ****************************

	// **************************************************
	// *** Method: insertStatus ***
	// *** Note -> No GUI or Working DB at this time) ***
	// **************************************************
	public static Status insertStatus(Scanner sc) {
		System.out.println();
		System.out.println("******************************");
		System.out.println("*** Create a New Status... ***");
		System.out.println("******************************");
		int id             = Console.getInt      (sc, "Enter StatusID:    ", 1, 9999);
		String description = Console.getString   (sc, "Enter Description: ", 5, 20);
		description = Format.fmtToUpperCase(description);
		boolean isActive   = Console.getYNBoolean(sc, "Active? Y/N:       ");

		// ********************************************************
		// *** Create a new Instance Status based on Data Entry ***
		// ********************************************************
		Status status = new Status(id, description, isActive);
		return status;
	}
}