package com.example.demo;

public class TestData {
	private String data;
	
	private boolean check;
    
	public TestData() {
		
	}
	
	public TestData(String data, boolean check) {
		super();
		this.data = data;
		this.check = check;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
}
