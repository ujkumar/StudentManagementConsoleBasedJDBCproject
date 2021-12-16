package student;

public class TeascherUtility {
	private int id;
	private String name;
	private String userName;
	private String password;
	private String phoneNo;
	
	public TeascherUtility(int id, String name, String userName, String password, String phoneNo) {
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
