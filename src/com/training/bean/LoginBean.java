package com.training.bean;

public class LoginBean {
	// private String userName;
	// private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String telephone;
	private String address1;
	private String address2;
	private String city;
	private String postalcode;
	private String country;
	private String state;
	private String password;
	private String confirmpassword;

	public LoginBean() {
	}

	public LoginBean(String firstname, String lastname, String email, String telephone, String address1,
			String address2, String city, String postalcode, String country, String state, String password,
			String confirmpassword) {
		super();
		// this.userName = userName;
		// this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telephone = telephone;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.postalcode = postalcode;
		this.country = country;
		this.state = state;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	// public String getUserName() {
	// return userName;
	// }
	//
	// public void setUserName(String userName) {
	// this.userName = userName;
	// }
	//
	// public String getPassword() {
	// return password;
	// }
	//
	// public void setPassword(String password) {
	// this.password = password;
	// }

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String geteMail() {
		return email;
	}

	public void seteMail(String email) {
		this.email = email;
	}

	public String gettelePhone() {
		return telephone;
	}

	public void settelePhone(String telephone) {
		this.telephone = telephone;
	}

	public String getaddress1() {
		return address1;
	}

	public void setaddress1(String address1) {
		this.address1 = address1;
	}

	public String getaddress2() {
		return address2;
	}

	public void setaddress2(String address2) {
		this.address2 = address2;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getpostalCode() {
		return postalcode;
	}

	public void setpostalCode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;

	}

	public String getconfirmpassword() {
		return confirmpassword;
	}

	public void setconfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		// return "LoginBean [userName=" + userName + ", password=" + password + "]";
		return "LoginBean[firstName=" + firstname + ",lastName=" + lastname + ",eMail=" + email + ",telePhone="
				+ telephone + ",address1=" + address1 + ",address2=" + address2 + ",city=" + city + ",postalcode="
				+ postalcode + ",country=" + country + ",state=" + state + ",password=" + password + ",confirmpassword="
				+ confirmpassword + "]";
	}

}
