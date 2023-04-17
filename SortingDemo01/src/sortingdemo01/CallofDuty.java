package sortingdemo01;

public class CallofDuty implements Comparable<CallofDuty> {
	private int userID;
	private String lastName;
	private String firstName;
	private Double survival;
	private int level;
	
	public CallofDuty(int userID, String lastName, String firstName, Double survival, int level) {
		super();
		this.userID = userID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.survival = survival;
		this.level = level;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSurvival() {
		return survival;
	}

	public void setSurvival(Double survival) {
		this.survival = survival;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "CallofDuty [userID=" + userID + ", lastName=" + lastName + ", firstName=" + firstName + ", survival="
				+ survival + ", level=" + level + "]";
	}
	public int compareTo(CallofDuty user) {
		//return firstName.compareTo(user.getFirstName());
		return lastName.compareTo(user.getLastName());
        //return Integer.compare(this.userID, user.getUserID()); 
		//return Integer.compare(this.level, user.getLevel());
		//return Double.compare(this.survival, user.getSurvival());
	}
}
