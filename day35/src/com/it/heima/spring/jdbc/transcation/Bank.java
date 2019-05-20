package com.it.heima.spring.jdbc.transcation;

public class Bank {
	private String Fname;
	private int Famount;
	
//	 public Bank(String name,int amount) {
//		// TODO Auto-generated constructor stub
//		 this.name=name;
//		 this.amount=amount;
//	}
	 

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Fname+"  "+this.Famount;
	}

	public Bank() {
		super();
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public int getFamount() {
		return Famount;
	}

	public void setFamount(int famount) {
		Famount = famount;
	}



}
