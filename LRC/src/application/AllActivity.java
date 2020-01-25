package application;

public class AllActivity {
	
		private  String name, details, startT, endT,place,  sDate;
		private int id;
			
		public AllActivity(){
			name= details= startT= endT=place=sDate="";	
			id=0;
		}
		
		AllActivity(int id,String name, String details, String sDate,String place, String startT, String endT){
			this.name=name;
			this.details=details;
			this.startT=startT;
				this.endT=endT; 
			this.sDate=sDate;
			this.id=id;
			this.place=place;
		
		}
		
		public String getname() {
			return name;
		}
		public int getId() {
			return id;
		}
		public String getdetails() {
			return details;
		}
		public String getstartT() {
			return startT;
		}
		public String getendT() {
			return endT;
		}
		public String getsDate() {
			return sDate;
		}
		
		public void setId(int Id) {
			this.id=Id;
		}
		public String getsplace() {
			return place;
		}
		
		public void setId(String place) {
			this.place=place;
		}
		public void setname(String name) {
			this.name = name;
		}
		public void setdetails(String d) {
			 details=d;
		}
		public void setstartT(String s) {
			 startT=s;
		}
		public void setendT(String e) {
			endT=e;
		}
		public void setsDate(String sd) {
			sDate=sd;
		}


}
