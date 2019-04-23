package main.entity;

public class TestTable {
	private String name;
	private String password;
	
	 public TestTable(String name,String password) {
		// TODO Auto-generated constructor stub
		 this.name=name;
		 this.password=password;
	}
	 
	 public void setName(String name) {
		 this.name=name;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	


}
