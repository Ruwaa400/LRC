package application;

public class AllStudentsTable {
public String name, phone, email, password, gender, address, completed, currently;
	
	AllStudentsTable(){
		this.name="";
		this.phone="";
		this.email="";
		this.password="";
		this.gender="";
		this.address="";
		this.completed="";
		this.currently="";
	}
	
	AllStudentsTable(String fullName, String phone, String email, String password, String sex, String address, String completedCources, String currentlyTaking){
		this.name=fullName;
		this.phone=phone;
		this.email=email;
		this.password=password; 
		this.gender=sex;
		this.address=address;
		this.completed=completedCources;
		this.currently=currentlyTaking;

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
	public String getCompleted() {
		return completed;
	}
	public String getCurrently() {
		return currently;
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
	public void setCompleted(String completedCources) {
		this.completed = completedCources;
	}
	public void setCurrently(String currentlyTaking) {
		this.currently = currentlyTaking;
	}
}
