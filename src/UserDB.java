import java.util.Scanner;

// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  UserDB                                                   ***
// ***                                                                       ***
// *** Description: The UserDB Class Contains Functionality for Selecting,   ***
// ***              Inserting, Updating and Deleting Data from the USER      ***
// ***              Table in the PRS Database based on the Java User Class.  ***
// ***                                                                       ***
// *** Note -->     There is Currently no GUI or DB Functionality            ***
// ***                                                                       ***
// *****************************************************************************
public class UserDB {

	// *************************
	// *** Method: queryUser ***
	// *************************

	// **************************
	// *** Method: updateUser ***
	// **************************

	// **************************
	// *** Method: deleteUser ***
	// **************************

	// **************************
	// *** Method: insertUser ***
	// **************************
	public static User insertUser(Scanner sc) {
		System.out.println();
		System.out.println("******************************");
		System.out.println("*** Create a New User...   ***");
		System.out.println("******************************");
		int id             = Console.getInt      (sc, "Enter UserID:          ", 1, 9999);
		String userName    = Console.getString   (sc, "Enter UserName:        ", 6, 20);
		userName = Format.fmtToLowerCase(userName);
		String password    = Console.getPassword (sc, "Enter Password:        ", userName, 8, 15);
		String firstName   = Console.getString   (sc, "Enter First Name:      ");
		  firstName = Format.fmtToCamelCase(firstName);
		String lastName    = Console.getString   (sc, "Enter Last Name:       ");
		  lastName = Format.fmtToCamelCase(lastName);
		long phoneNumber   = Console.getLong     (sc, "Enter 10 Digit Phone#: ", 10);
		String phone = Format.fmtPhoneNumber(phoneNumber);
		String email       = Console.getEmail    (sc, "Enter Email Address:   ");
		   email = Format.fmtToLowerCase(email);
		boolean isReviewer = Console.getYNBoolean(sc, "Reviewer? Y/N:         ");
		boolean isAdmin = Console.getYNBoolean   (sc, "Administrtor? Y/N:     ");
		boolean isActive = Console.getYNBoolean  (sc, "Active? Y/N:           ");

		// *******************************************************
		// *** Create a new Instance User based on Data Entry ***
		// *******************************************************
		User user = new User(id, userName, password, firstName, lastName, phone, email, isReviewer, isAdmin, isActive);
		return user;
	}
}
