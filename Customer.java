class Customer{
	
	private String phoneNum;
	private String name;
	private String address;
	private String email;
	
	Customer(String phoneNum, String name, String address, String email){
		this.phoneNum = phoneNum;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public void setPhoneNum(String phoneNum){this.phoneNum = phoneNum;}
	public void setName(String name){this.name = name;}
	public void setAddress(String address){this.address = address;}
	public void setEmail(String email){this.email = email;}
	
	public String getPhoneNum(){return this.phoneNum;}
	public String getName(){return this.name;}
	public String getAddress(){return this.address;}
	public String getEmail(){return this.email;}

	public String toString(){
		String data = "("+phoneNum+","+name+","+address+","+email+")";
		return data;
	}
	
}
