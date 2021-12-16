package student;

public class Class {
	private int id;
	private String name;
	private String devision;
	
	public Class(int id, String name, String devision) {
		this.id = id;
		this.name = name;
		this.devision = devision;
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

	public String getDevision() {
		return devision;
	}

	public void setDevision(String devision) {
		this.devision = devision;
	}
	
	
}
