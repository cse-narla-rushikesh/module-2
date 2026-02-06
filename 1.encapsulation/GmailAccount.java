class GmailAccount{
	private String firstName;
	private String lastName;
	private Long contactNumber;
	private String mailId;
	private String password;

	GmailAccount(){

	}

	public GmailAccount(String firstName,String lastName, Long contactNumber, String mailId, String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		this.password = password;
	} 
	public void setPassword(String password){
		this.password = password;
	}

	public String getDetails(String str){
		if(str.equals("firstName")) return firstName;
		if(str.equals("lastName")) return lastName;
		if(str.equals("contactNumber")) return String.valueOf(contactNumber);
		if(str.equals("mailId")) return mailId;
		return "Invalid Option";
	}

	public void showDetails() {
        System.out.println("First Name      : " + firstName);
        System.out.println("Last Name       : " + lastName);
        System.out.println("Contact Number  : " + contactNumber);
        System.out.println("Mail ID         : " + mailId);
        System.out.println("Password        : " + password);
    }

   public void updateDetails(String str, String value) {

    if (str.equals("firstName")) {
        this.firstName = value;

    } else if (str.equals("lastName")) {
        this.lastName = value;

    } else if (str.equals("contactNumber")) {
        this.contactNumber = Long.parseLong(value);

    } else if (str.equals("mailId")) {
        this.mailId = value;

    } else {
        System.out.println("Invalid Option");
    }
}

  public void setDetails(String firstName,
                           String lastName,
                           Long contactNumber,
                           String mailId,
                           String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.mailId = mailId;
        this.password = password;
    }

}

/** POJO - Plain Old Java Object
 * public class
 * public no arguemented constructor
 * prevate non static variables
 * public getter settter methods
*/