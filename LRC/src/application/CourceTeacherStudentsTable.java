package application;

public class CourceTeacherStudentsTable {
public String name, phone, email, password, gender , status;
	
CourceTeacherStudentsTable(){
		this.name="";
		this.phone="";
		this.email="";
		this.password="";
		this.gender="";
		this.status="";
	}
	
CourceTeacherStudentsTable(String fullName, String phone, String email, String password, String sex, String status){
		this.name=fullName;
		this.phone=phone;
		this.email=email;
		this.password=password; 
		this.gender=sex;
		this.status=status;
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
	public String getStatus() {
		return status;
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
	public void setStatus(String status) {
		this.status = status;
	}
}
