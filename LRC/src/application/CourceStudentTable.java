package application;

public class CourceStudentTable {
	public String name, phone, email, password, gender, address;
	
	CourceStudentTable(){
		this.name="";
		this.phone="";
		this.email="";
		this.password="";
		this.gender="";
		this.address="";
	}
	
	CourceStudentTable(String fullName, String phone, String email, String password, String sex, String address){
		this.name=fullName;
		this.phone=phone;
		this.email=email;
		this.password=password;
		this.gender=sex;
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	public String getGender() {
		return gender;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String fullName) {
		this.name = fullName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(String sex) {
		this.gender = sex;
	}
}
