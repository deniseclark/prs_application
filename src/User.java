
// *****************************************************************************
// ***                                                                       ***
// *** Class Name:  User                                                     ***
// ***                                                                       ***
// *** Description: The User Class Corresponds to the USER Table in the      ***
// ***              PRS Database.  All of the Functionality in the User      ***
// ***              Class is Applicable to Creating an Object Instance of    ***
// ***              the User Class.   See also the Class UserDB for          ***
// ***              Performing DML Applicable to the USER Table based on     ***
// ***              the User Class                                           ***
// ***                                                                       ***
// *****************************************************************************
public class User {

	// **************************
	// *** Instance Variables ***
	// **************************
	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private boolean isReviewer;
	private boolean isAdmin;
	private boolean isActive;

	// ***************************
	// *** Default Constructor ***
	// ***************************
	public User() {
		id = 0;
		userName = "";
		password = "";
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
		isReviewer = false;
		isAdmin = false;
		isActive = true;
	}

	// ***********************************
	// *** Fully Qualified Constructor ***
	// ***********************************
	public User(int id, String userName, String password, String firstName, String lastName, String phone, String email,
			boolean isReviewer, boolean isAdmin, boolean isActive) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.isReviewer = isReviewer;
		this.isAdmin = isAdmin;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isReviewer() {
		return isReviewer;
	}

	public void setReviewer(boolean isReviewer) {
		this.isReviewer = isReviewer;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + (isAdmin ? 1231 : 1237);
		result = prime * result + (isReviewer ? 1231 : 1237);
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		if (isAdmin != other.isAdmin)
			return false;
		if (isReviewer != other.isReviewer)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	// **********************************
	// ***@Override - toString Method ***
	// **********************************
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", " + "firstName=" + firstName
				+ ", lastName=" + lastName + ", " + "phone=" + phone + ", email=" + email + ", isReviewer=" + isReviewer
				+ ", isAdmin=" + isAdmin + ", isActive=" + isActive + "]";
	}

	// ************************************************************************
	// *** Display the Content of the Object - More Formatted than toString ***
	// ************************************************************************
	public void displayUser() {
		System.out.println();
		System.out.println("Current User Values");
		System.out.println("-------------------");
		System.out.println("ID:            " + this.id);
		System.out.println("UserName:      " + this.userName);
		System.out.println("Password:      " + this.password);
		System.out.println("Full Name:     " + this.firstName + " " + this.lastName);
		System.out.println("Phone#:        " + this.phone);
		System.out.println("Email:         " + this.email);
		System.out.println("Reviewer:      " + this.isReviewer);
		System.out.println("Administrator: " + this.isAdmin);
		System.out.println("Active:        " + this.isActive);
	}
}
