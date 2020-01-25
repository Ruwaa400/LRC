package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerMain implements Initializable {

    @FXML
    private AnchorPane MainMenuBar;

    @FXML
    private Button login_Button;

    @FXML
    private Button Activities_Button;

    @FXML
    private Button AboutUs_Button;

    @FXML
    private Button Home_Button;

    @FXML
    private Button Courses_Button;

    @FXML
    private AnchorPane root;
    
    @FXML
    private AnchorPane HomePane;

    @FXML
    private AnchorPane AboutUsPane;

    @FXML
    private AnchorPane CourcesPane;

    @FXML
    private AnchorPane ActivitiesPane;

    @FXML
    private AnchorPane LoginPane;
    
    @FXML
    private AnchorPane ContactPane;
    
    @FXML
    private AnchorPane FrontPane;
    
    @FXML
    private VBox BoxOfFrontane;
     
    @FXML
    private Button checkOutActivityButtonUp_1;

    @FXML
    private Button checkOutActivityButton_1;

    @FXML
    private Button checkOutActivityButtonUp_3;

    @FXML
    private Button checkOutActivityButton_3;

    @FXML
    private Button checkOutActivityButtonUp_2;

    @FXML
    private Button checkOutActivityButton_2;
    
    ///newwwwwwwwwww
    @FXML
    private Label activityName1 ;
    
    @FXML
    private Label activityName2 ;
    @FXML
    private Label activityName3 ;
    @FXML
    private Label activDate1 ;
    @FXML
    private Label activDate2 ;
    @FXML
    private Label activDate3 ;
    @FXML
    private Label activSTime1 ;
    @FXML
    private Label activSTime2 ;
    @FXML
    private Label activSTime3 ;
    
    @FXML
    private Label activTitel1;
    @FXML
    private Label activTitel2;
    @FXML
    private Label activTitel3;
    @FXML
    private Label activTitel4;
    @FXML
    private Label activTitel5;
    @FXML
    private Label activTitel6;
    @FXML
    private Label activTitel7;
    @FXML
    private Label activTitel8;
    @FXML
    private Label activTitel9;
    
    
    @FXML
    private Label aDate1;
    @FXML
    private Label aDate2;
    @FXML
    private Label aDate3;
    @FXML
    private Label aDate4;
    @FXML
    private Label aDate5;
    @FXML
    private Label aDate6;
    @FXML
    private Label aDate7;
    @FXML
    private Label aDate8;
    @FXML
    private Label aDate9;
    
    
    @FXML
    private Label aTime1;
    @FXML
    private Label aTime2;
    @FXML
    private Label aTime3;
    @FXML
    private Label aTime4;
    @FXML
    private Label aTime5;
    @FXML
    private Label aTime6;
    @FXML
    private Label aTime7;
    @FXML
    private Label aTime8;
    @FXML
    private Label aTime9;
    
    @FXML
    private Text aDetails1;
    @FXML
    private Text aDetails2;
    @FXML
    private Text aDetails3;
    @FXML
    private Text aDetails4;
    @FXML
    private Text aDetails5;
    @FXML
    private Text aDetails6;
    @FXML
    private Text aDetails7;
    @FXML
    private Text aDetails8;
    @FXML
    private Text aDetails9;
    
    @FXML  private Label aPlace1;
    @FXML   private Label aPlace2;
    @FXML   private Label aPlace3;
    @FXML   private Label aPlace4;
    @FXML  private Label aPlace5;
    @FXML  private Label aPlace6;
    @FXML  private Label aPlace7;
    @FXML   private Label aPlace8;
    @FXML   private Label aPlace9;
    
    @FXML   private Pane activity1;
    @FXML   private Pane activity2;
    @FXML   private Pane activity3;
    @FXML   private Pane activity4;
    @FXML   private Pane activity5;
    @FXML   private Pane activity6;
    @FXML   private Pane activity7;
    @FXML   private Pane activity8;
    @FXML   private Pane activity9;
    
    @FXML   private Label cName1;
    @FXML   private Label cName2;
    @FXML   private Label cName3;
    @FXML   private Label cName4;
    @FXML   private Label cName5;
    @FXML   private Label cName6;
    @FXML   private Label cName7;
    @FXML   private Label cName8;
    @FXML   private Label cName9;
    @FXML   private Label cName10;
    @FXML   private Label cName11;
    @FXML   private Label cName12;
    @FXML   private Label cName13;
    @FXML   private Label cName14;
    @FXML   private Label cName15;
    
    
    @FXML   private Label level1;
    @FXML   private Label level2;
    @FXML   private Label level3;
    @FXML   private Label level4;
    @FXML   private Label level5;
    @FXML   private Label level6;
    @FXML   private Label level7;
    @FXML   private Label level8;
    @FXML   private Label level9;
    @FXML   private Label level10;
    @FXML   private Label level11;
    @FXML   private Label level12;
    @FXML   private Label level13;
    @FXML   private Label level14;
    @FXML   private Label level15;
   
    @FXML   private Label days1;
    @FXML   private Label days2;
    @FXML   private Label days3;
    @FXML   private Label days4;
    @FXML   private Label days5;
    @FXML   private Label days6;
    @FXML   private Label days7;
    @FXML   private Label days8;
    @FXML   private Label days9;
    @FXML   private Label days10;
    @FXML   private Label days11;
    @FXML   private Label days12;
    @FXML   private Label days13;
    @FXML   private Label days14;
    @FXML   private Label days15;
    
    @FXML   private Label time1;
    @FXML   private Label time2;
    @FXML   private Label time3;
    @FXML   private Label time4;
    @FXML   private Label time5;
    @FXML   private Label time6;
    @FXML   private Label time7;
    @FXML   private Label time8;
    @FXML   private Label time9;
    @FXML   private Label time10;
    @FXML   private Label time11;
    @FXML   private Label time12;
    @FXML   private Label time13;
    @FXML   private Label time14;
    @FXML   private Label time15;
    
    
    @FXML   private Pane cour1;
    @FXML   private Pane cour2;
    @FXML   private Pane cour3;
    @FXML   private Pane cour4;
    @FXML   private Pane cour5;
    @FXML   private Pane cour6;
    @FXML   private Pane cour7;
    @FXML   private Pane cour8;
    @FXML   private Pane cour9;
    @FXML   private Pane cour11;
    @FXML   private Pane cour12;
    @FXML   private Pane cour10;
    @FXML   private Pane cour13;
    @FXML   private Pane cour14;
    @FXML   private Pane cour15;
    
    //******************************************************************************************************
    @FXML
    void UnderLine(ActionEvent event) throws Exception {
    	removeLine(); 
    	if(event.getSource()==login_Button) {
        	login_Button.setUnderline(true);
        	ContactPane.toFront();
        	MainMenuBar.toFront();
        	LoginPane.toFront();
        	
        	Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        	Scene tableViewScene = new Scene(tableViewParent);
        	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        	window.setScene(tableViewScene);
        	window.show();

    	}
    
    	else if(event.getSource()==Activities_Button) {
    		Activities_Button.setUnderline(true);
    		ActivitiesPane.toFront();
    	}
    	else if((event.getSource()==checkOutActivityButtonUp_1)||(event.getSource()==checkOutActivityButtonUp_2)||(event.getSource()==checkOutActivityButtonUp_3)
    			||(event.getSource()==checkOutActivityButton_1)||(event.getSource()==checkOutActivityButton_2)||(event.getSource()==checkOutActivityButton_3)) {
    		
    		Activities_Button.setUnderline(true);
    		ActivitiesPane.toFront();
    	}
    	
    	else if(event.getSource()==AboutUs_Button) {
    		AboutUs_Button.setUnderline(true);
    		AboutUsPane.toFront();
    	}
    	
    	else if(event.getSource()==Home_Button) {
    		Home_Button.setUnderline(true);
    		FrontPane.toFront();
    		MainMenuBar.toFront();
    		HomePane.toFront();
    		
    		
    		
    	}
    	
    	else if(event.getSource()==Courses_Button) {
    		Courses_Button.setUnderline(true);
    		CourcesPane.toFront();
    	}
    }
    
    @FXML
    private void removeLine() {
    	login_Button.setUnderline(false);
    	Activities_Button.setUnderline(false);
    	AboutUs_Button.setUnderline(false);
    	Home_Button.setUnderline(false);
    	Courses_Button.setUnderline(false);   	
    }
  
   
    ///////neeeeeeeeeeeeeeeeewwwwwww
    ResultSet cource1;
    ObservableList<AllActivity> activList = FXCollections.observableArrayList();
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Label cName[]=new Label[15];
		cName[0]=cName1;
		cName[1]=cName2;
		cName[2]=cName3;
		cName[3]=cName4;
		cName[4]=cName5;
		cName[5]=cName6;
		cName[6]=cName7;
		cName[7]=cName8;
		cName[8]=cName9;
		cName[9]=cName10;
		cName[10]=cName11;
		cName[11]=cName12;
		cName[12]=cName13;
		cName[13]=cName14;
		cName[14]=cName15;
		
		Label days[]=new Label[15];
		days[0]=days1;
		days[1]=days2;
		days[2]=days3;
		days[3]=days4;
		days[4]=days5;
		days[5]=days6;
		days[6]=days7;
		days[7]=days8;
		days[8]=days9;
		days[9]=days10;
		days[10]=days11;
		days[11]=days12;
		days[12]=days13;
		days[13]=days14;
		days[14]=days15;
		
		Label level[]=new Label[15];
		level[0]=level1;
		level[1]=level2;
		level[2]=level3;
		level[3]=level4;
		level[4]=level5;
		level[5]=level6;
		level[6]=level7;
		level[7]=level8;
		level[8]=level9;
		level[9]=level10;
		level[10]=level11;
		level[11]=level12;
		level[12]=level13;
		level[13]=level14;
		level[14]=level15;
		
		
		Label cTime[]=new Label[15];
		cTime[0]=time1;
		cTime[1]=time2;
		cTime[2]=time3;
		cTime[3]=time4;
		cTime[4]=time5;
		cTime[5]=time6;
		cTime[6]=time7;
		cTime[7]=time8;
		cTime[8]=time9;
		cTime[9]=time10;
		cTime[10]=time11;
		cTime[11]=time12;
		cTime[12]=time13;
		cTime[13]=time14;
		cTime[14]=time15;	
		
		Pane cour[]=new Pane[15];
		cour[0]=cour1;
		cour[1]=cour2;
		cour[2]=cour3;
		cour[3]=cour4;
		cour[4]=cour5;
		cour[5]=cour6;
		cour[6]=cour7;
		cour[7]=cour8;
		cour[8]=cour9;
		cour[9]=cour10;
		cour[10]=cour11;
		cour[11]=cour12;
		cour[12]=cour13;
		cour[13]=cour14;
		cour[14]=cour15;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa","0000");
			ResultSet activ = conn.createStatement().executeQuery("select * FROM activity");
			ResultSet cource1=conn.createStatement().executeQuery("select * FROM schedule");
			
			while (activ.next()) {
				activList.add(new AllActivity(Integer.parseInt(activ.getNString("activity_id")),activ.getString("name"),
						activ.getString("detailes"), activ.getString("activity_Date"), activ.getString("place"), 
						activ.getString("start_time"),activ.getString("end_time")
						));
				
			}
			int i=0;
			int A;
			int B;
			int C;
			String s;
			while(cource1.next()) {
				s=	cource1.getString("cource_name");
				A=s.lastIndexOf("A");
				B=s.lastIndexOf("B");
				C=s.lastIndexOf("C");
				
				if(A>B&&A>C) {
					cName[i].setText(s.substring(0,A));
					level[i].setText(s.substring(A));
					
				}
				else if(B>A&&B>C) {
					cName[i].setText(s.substring(0,B));
					level[i].setText(s.substring(B));
					
				}
				else if(C>B&&C>A) {
					cName[i].setText(s.substring(0,C));
					level[i].setText(s.substring(C));
					
				}
				days[i].setText(cource1.getString("days_in_week"));
				cTime[i].setText(cource1.getString("start_time")+"-"+cource1.getString("end_time"));
				cour[i].setVisible(true);
				i++;
				
			}
			
			for(int c=i;c<15;c++) {
				cour[c].setVisible(false);
			}
			activityName1.setText(activList.get(0).getname());
			activityName2.setText(activList.get(1).getname());
			activityName3.setText(activList.get(2).getname());
			
			activSTime1.setText(activList.get(0).getstartT());
			activSTime2.setText(activList.get(1).getstartT());
			activSTime3.setText(activList.get(2).getstartT());
			

			activDate1.setText(activList.get(0).getsDate());
			activDate2.setText(activList.get(1).getsDate());
			activDate3.setText(activList.get(2).getsDate());
			
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Label titel[]	=new Label[9];
			titel[0]=activTitel1;
			titel[1]=activTitel2;
			titel[2]=activTitel3;
			titel[3]=activTitel4;
			titel[4]=activTitel5;
			titel[5]=activTitel6;
			titel[6]=activTitel7;
			titel[7]=activTitel8;
			titel[8]=activTitel9;

		
		Label date[]	=new Label[9];
			date[0]=aDate1;
			date[1]=aDate2;
			date[2]=aDate3;
			date[3]=aDate4;
			date[4]=aDate5;
			date[5]=aDate6;
			date[6]=aDate7;
			date[7]=aDate8;
			date[8]=aDate9;
		
		
		Label time[]	=new Label[9];
			time[0]=aTime1;
			time[1]=aTime2;
			time[2]=aTime3;
			time[3]=aTime4;
			time[4]=aTime5;
			time[5]=aTime6;
			time[6]=aTime7;
			time[7]=aTime8;
			time[8]=aTime9;
		
		Label place []=new Label[9];
			place[0]= aPlace1;
			place[1]= aPlace2;
			place[2]= aPlace3;
			place[3]= aPlace4;
			place[4]= aPlace5;
			place[5]= aPlace6;
			place[6]= aPlace7;
			place[7]= aPlace8;
			place[8]= aPlace9;
		
		
		Text details[]=new Text[9];
			details[0]=aDetails1;
			details[1]=aDetails2;
			details[2]=aDetails3;
			details[3]=aDetails4;
			details[4]=aDetails5;
			details[5]=aDetails6;
			details[6]=aDetails7;
			details[7]=aDetails8;
			details[8]=aDetails9;
	
		
		Pane activ []=new Pane[9];
			activ[0]=activity1;
			activ[1]=activity2;
			activ[2]=activity3;
			activ[3]=activity4;
			activ[4]=activity5;
			activ[5]=activity6;
			activ[6]=activity7;
			activ[7]=activity8;
			activ[8]=activity9;
		
		for(int i=0;i<activList.size();i++) {
			titel[i].setText(activList.get(i).getname());
			date[i].setText(activList.get(i).getsDate());
			time[i].setText(activList.get(i).getstartT());
			details[i].setText(activList.get(i).getdetails());
			place[i].setText(activList.get(i).getsplace());
			activ[i].setVisible(true);
		}
		
		for(int i=8; i>=activList.size(); i--) {
			activ[i].setVisible(false);
			
		}
		
	}
}