package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;
import java.util.ResourceBundle;

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
import javafx.stage.Modality;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class StudentController implements Initializable{

		public static String StudentEmail="kamal123@gmail.com";
		
		public static void setEmail(String email) {
			StudentEmail = email;
		} 
		
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
	    private Button SignOut_Button;

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
	    private AnchorPane SignOutPane;	    

	    @FXML
	    private ImageView ProfileButton;

	    @FXML
	    private Label studentUserNameLabel_1;

	    @FXML
	    private Button MyProfileButton;

	    @FXML
	    private Button studentCourcesButton;

	    @FXML
	    private Button ContactStaffButton;

	    @FXML
	    private Pane ContactStaffPane;

	    @FXML
	    private Pane studentCourcesPane;

	    @FXML
	    private Pane schedulePane_130Tus;

	    @FXML
	    private Pane schedulePane_2Tus;

	    @FXML
	    private Pane schedulePane_2Sun;

	    @FXML
	    private Pane schedulePane_130Sun;

	    @FXML
	    private Pane schedulePane_1Sun;

	    @FXML
	    private Pane schedulePane_12Sun;

	    @FXML
	    private Pane schedulePane_1130Sun;

	    @FXML
	    private Pane schedulePane_11Sun;

	    @FXML
	    private Pane schedulePane_1030Sun;

	    @FXML
	    private Pane schedulePane_10Sun;

	    @FXML
	    private Pane schedulePane_9Sun;

	    @FXML
	    private Pane schedulePane_830Sun;

	    @FXML
	    private Pane schedulePane_8Sun;

	    @FXML
	    private Pane schedulePane_930Sun;

	    @FXML
	    private Pane schedulePane_2Wed;

	    @FXML
	    private Pane schedulePane_2Mon;

	    @FXML
	    private Pane schedulePane_130Mon;

	    @FXML
	    private Pane schedulePane_1Mon;

	    @FXML
	    private Pane schedulePane_1230Mon;

	    @FXML
	    private Pane schedulePane_12Mon;

	    @FXML
	    private Pane schedulePane_1130Mon;

	    @FXML
	    private Pane schedulePane_11Mon;

	    @FXML
	    private Pane schedulePane_1030Mon;

	    @FXML
	    private Pane schedulePane_10Mon;

	    @FXML
	    private Pane schedulePane_930Mon;

	    @FXML
	    private Pane schedulePane_9Mon;

	    @FXML
	    private Pane schedulePane_830Mon;

	    @FXML
	    private Pane schedulePane_8Mon;

	    @FXML
	    private Pane schedulePane_1230Sun;

	    @FXML
	    private Pane schedulePane_2Thu;

	    @FXML
	    private Pane schedulePane_8Tus;

	    @FXML
	    private Pane schedulePane_830Tus;

	    @FXML
	    private Pane schedulePane_9Tus;

	    @FXML
	    private Pane schedulePane_930Tus;

	    @FXML
	    private Pane schedulePane_10Tus;

	    @FXML
	    private Pane schedulePane_1030Tus;

	    @FXML
	    private Pane schedulePane_11Tus;

	    @FXML
	    private Pane schedulePane_1130Tus;

	    @FXML
	    private Pane schedulePane_12Tus;

	    @FXML
	    private Pane schedulePane_1230Tus;

	    @FXML
	    private Pane schedulePane_1Tus;

	    @FXML
	    private Pane schedulePane_130Wed;

	    @FXML
	    private Pane schedulePane_1Wed;

	    @FXML
	    private Pane schedulePane_12Wed;

	    @FXML
	    private Pane schedulePane_1230Wed;

	    @FXML
	    private Pane schedulePane_9Wed;

	    @FXML
	    private Pane schedulePane_930Wed;

	    @FXML
	    private Pane schedulePane_10Wed;

	    @FXML
	    private Pane schedulePane_1030Wed;

	    @FXML
	    private Pane schedulePane_11Wed;

	    @FXML
	    private Pane schedulePane_1130Wed;

	    @FXML
	    private Pane schedulePane_11Thu;

	    @FXML
	    private Pane schedulePane_1130Thu;

	    @FXML
	    private Pane schedulePane_12Thu;

	    @FXML
	    private Pane schedulePane_1230Thu;

	    @FXML
	    private Pane schedulePane_1Thu;

	    @FXML
	    private Pane schedulePane_130Thu;

	    @FXML
	    private Pane schedulePane_8Wed;

	    @FXML
	    private Pane schedulePane_830Wed;

	    @FXML
	    private Pane schedulePane_8Thu;

	    @FXML
	    private Pane schedulePane_830Thu;

	    @FXML
	    private Pane schedulePane_9Thu;

	    @FXML
	    private Pane schedulePane_930Thu;

	    @FXML
	    private Pane schedulePane_10Thu;

	    @FXML
	    private Pane schedulePane_1030Thu;

	    @FXML
	    private Pane schedulePane_230Sun;

	    @FXML
	    private Pane schedulePane_230Mon;

	    @FXML
	    private Pane schedulePane_230Tus;

	    @FXML
	    private Pane schedulePane_230Wed;

	    @FXML
	    private Pane schedulePane_230Thu;

	    @FXML
	    private Pane courceColorMainPane_1;

	    @FXML
	    private Pane courceColor_1;

	    @FXML
	    private Label courceLableColor_1;

	    @FXML
	    private Pane courceColorMainPane_2;

	    @FXML
	    private Pane courceColor_2;

	    @FXML
	    private Label courceLableColor_2;

	    @FXML
	    private Pane courceColorMainPane_3;

	    @FXML
	    private Pane courceColor_3;

	    @FXML
	    private Label courceLableColor_3;

	    @FXML
	    private Pane courceColorMainPane_4;

	    @FXML
	    private Pane courceColor_4;

	    @FXML
	    private Label courceLableColor_4;

	    @FXML
	    private Pane courceColorMainPane_5;

	    @FXML
	    private Pane courceColor_5;

	    @FXML
	    private Label courceLableColor_5;

	    @FXML
	    private Pane courceColorMainPane_6;

	    @FXML
	    private Pane courceColor_6;

	    @FXML
	    private Label courceLableColor_6;

	    @FXML
	    private Pane courceColorMainPane_7;

	    @FXML
	    private Pane courceColor_7;

	    @FXML
	    private Label courceLableColor_7;

	    @FXML
	    private Pane courceColorMainPane_8;

	    @FXML
	    private Pane courceColor_8;

	    @FXML
	    private Label courceLableColor_8;

	    @FXML
	    private Pane MyProfilePane;

	    @FXML
	    private Label studentUserNameLabel_2;

	    @FXML
	    private Label studentEmailLabel;

	    @FXML
	    private TextField studentPhoneTextField;

	    @FXML
	    private Button studentEditPhoneButton;

	    @FXML
	    private Button studentChangePasswordButton;

	    @FXML
	    private TextField studentPasswordTextField_1;

	    @FXML
	    private TextField studentPasswordTextField_2;

	    @FXML
	    private Button studentSaveNewPasswordButton;

	    @FXML
	    private TextField searchCourceTextField;

	    @FXML
	    private Button searchCourceButton;

	    @FXML
	    private Pane langPane_1;

	    @FXML
	    private Pane langPane_11;

	    @FXML
	    private Pane langPane_12;

	    @FXML
	    private Pane langPane_13;

	    @FXML
	    private Pane langPane_14;

	    @FXML
	    private Pane langPane_21;

	    @FXML
	    private Pane langPane_22;

	    @FXML
	    private Pane langPane_23;

	    @FXML
	    private Pane langPane_24;

	    @FXML
	    private Pane langPane_25;

	    @FXML
	    private Pane langPane_31;

	    @FXML
	    private Pane langPane_32;

	    @FXML
	    private Pane langPane_33;

	    @FXML
	    private Pane langPane_34;

	    @FXML
	    private Pane langPane_35;
	    
	    @FXML
	    private Label studentNameEnLabel;

	    @FXML
	    private Label studentGenderLabel;    
	    
	    @FXML
	    private Pane studentChangePasswordPane, CompletedCourcesPane;
	    
	    @FXML
	    private Button CompletedCourcesButton;  
	    
	    @FXML
	    private Pane completedCourcePane_1;

	    @FXML
	    private Label completedCourceNameLable_1;

	    @FXML
	    private Button completedCourceCertificationButton_1;

	    @FXML
	    private Pane completedCourcePane_2;

	    @FXML
	    private Label completedCourceNameLable_2;

	    @FXML
	    private Button completedCourceCertificationButton_2;

	    @FXML
	    private Pane completedCourcePane_3;

	    @FXML
	    private Label completedCourceNameLable_3;

	    @FXML
	    private Button completedCourceCertificationButton_3;

	    @FXML
	    private Pane completedCourcePane_4;

	    @FXML
	    private Label completedCourceNameLable_4;

	    @FXML
	    private Button completedCourceCertificationButton_4;

	    @FXML
	    private Pane completedCourcePane_5;

	    @FXML
	    private Label completedCourceNameLable_5;

	    @FXML
	    private Button completedCourceCertificationButton_5;

	    @FXML
	    private Pane completedCourcePane_6;

	    @FXML
	    private Label completedCourceNameLable_6, studentPhoneLabel;

	    @FXML
	    private Button completedCourceCertificationButton_6;

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

	    //**************************************************************************************************
	    
	    @FXML
	    void UnderLine(ActionEvent event) throws Exception {
	    	removeLine();
	    	if(event.getSource()==login_Button) {
	    	//	pane.setStyle("-fx-background-color: #" + "AD1457");
	        	login_Button.setUnderline(true);
	        	ContactPane.toFront();
	        	MainMenuBar.toFront();
	        	LoginPane.toFront();
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
	    	
	    	else if(event.getSource()==SignOut_Button) {
	    		SignOut_Button.setUnderline(true);
	    		SignOutPane.toFront();
	    		
	    		//for switching scenes
	    		Parent tableViewParent = FXMLLoader.load(getClass().getResource("test.fxml"));
	    	    Scene tableViewScene = new Scene(tableViewParent);

	    	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

	    	    window.setScene(tableViewScene);
	    	    window.show();
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
	    
	    @FXML
	    void studentProfileStuff(ActionEvent event) {
	    	removeLine_2();
	    	if(event.getSource()==MyProfileButton) {
	    		MyProfileButton.setUnderline(true);
	    		MyProfilePane.toFront();
	    	}	    	
	    	else if(event.getSource()==studentCourcesButton) {
	    		studentCourcesButton.setUnderline(true);
	    		studentCourcesPane.toFront();
	    	}    	
	    	else if(event.getSource()==CompletedCourcesButton) {
	    		CompletedCourcesButton.setUnderline(true);
	    		CompletedCourcesPane.toFront();
	    	}
	    	else if(event.getSource()==ContactStaffButton) {
	    		ContactStaffButton.setUnderline(true);
	    		ContactStaffPane.toFront();
	    	}  	
	    }
	    
	    @FXML
	    private void removeLine_2() {
	    	MyProfileButton.setUnderline(false);
	    	studentCourcesButton.setUnderline(false);
	    	CompletedCourcesButton.setUnderline(false);
	    	ContactStaffButton.setUnderline(false);
	    }
	    
	    public void setMyProfileInfo() {
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select * from student where email = '"+StudentEmail+"'");
				while (rs.next()) {
					studentUserNameLabel_1.setText(rs.getString(2));
					studentUserNameLabel_2.setText(rs.getString(2));
					studentNameEnLabel.setText(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
					studentGenderLabel.setText(rs.getString(11));
					studentEmailLabel.setText(rs.getString(1));
					studentPhoneLabel.setText(rs.getString(6));
				}
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
	    public void showStudentFinishedCources() {/////////////////////////////////////////////////completedCourceCertificationButton_1
	    	
	    	completedCourcePane_1.setVisible(false);
	    	completedCourcePane_2.setVisible(false);
	    	completedCourcePane_3.setVisible(false);
	    	completedCourcePane_4.setVisible(false);
	    	completedCourcePane_5.setVisible(false);
	    	completedCourcePane_6.setVisible(false);
	    	
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select * from student_cources, schedule\r\n" + 
						"WHERE schedule.s_cource_id = student_cources.s_cource_id and student_cources.status=1 and student_cources.email='"+StudentEmail+"'");
				int i=1;
				while (rs.next()) {
					if(i==1) {
						completedCourcePane_1.setVisible(true);
						completedCourceNameLable_1.setText(rs.getNString(6));
				    	i++;
				    	continue;
					}
					if(i==2) {
						completedCourcePane_2.setVisible(true);
						completedCourceNameLable_2.setText(rs.getNString(6));
				    	i++;
				    	continue;
					}
					if(i==3) {
						completedCourcePane_3.setVisible(true);
						completedCourceNameLable_3.setText(rs.getNString(6));
				    	i++;
				    	continue;
					}
					if(i==4) {
						completedCourcePane_4.setVisible(true);
						completedCourceNameLable_4.setText(rs.getNString(6));
				    	i++;
				    	continue;
					}
					if(i==5) {
						completedCourcePane_5.setVisible(true);
						completedCourceNameLable_5.setText(rs.getNString(6));
				    	i++;
				    	continue;
					}
					if(i==6) {
						completedCourcePane_6.setVisible(true);
						completedCourceNameLable_6.setText(rs.getNString(6));
				    	i++;
				    	continue;
					}
				}
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
	    @FXML
	    void viewCertification(ActionEvent event) {
	    	//handling
	    	String courceName="";
	    	if(event.getSource()==completedCourceCertificationButton_1) {
	    		courceName=completedCourceNameLable_1.getText();
	    	}
	    	else if(event.getSource()==completedCourceCertificationButton_2) {
	    		courceName=completedCourceNameLable_2.getText();
	    	}
	    	else if(event.getSource()==completedCourceCertificationButton_3) {
	    		courceName=completedCourceNameLable_3.getText();
	    	}
	    	else if(event.getSource()==completedCourceCertificationButton_4) {
	    		courceName=completedCourceNameLable_4.getText();
	    	}
	    	else if(event.getSource()==completedCourceCertificationButton_5) {
	    		courceName=completedCourceNameLable_5.getText();
	    	}
	    	else if(event.getSource()==completedCourceCertificationButton_6) {
	    		courceName=completedCourceNameLable_6.getText();
	    	}
	    	
	    	String studentName="";
//	    	try {
//				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
//				conn.createStatement().executeQuery("delete from CERTIFICATION where CAN_DELETE=1");
//				ResultSet rs= conn.createStatement().executeQuery("select F_name,s_name,th_name,L_name from student where email='"+StudentEmail+"'");
//				while (rs.next()) {
//					studentName=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4);
//				}
//				conn.createStatement().executeQuery("insert into certification VALUES('"+studentName+"', '"+courceName+"', 1)");
//
//				//for report stuff..
//				JasperReport jr = JasperCompileManager.compileReport("certification.jrxml");
//				JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
//				JasperViewer.viewReport(jp); 
//				
	    	
	    	
//				conn.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	    	
	    	Stage stage;
	    	Parent root;
	    	stage=new Stage();
	    	try {
				root=FXMLLoader.load(getClass().getResource("certification.jrprint"));
				stage.setScene(new Scene(root));
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.initOwner(completedCourceCertificationButton_1.getScene().getWindow());
				stage.showAndWait();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) { //DONE I THINK.. 
	    	setMyProfileInfo();
	    	showStudentFinishedCources();
	    	courceColorMainPane_1.setVisible(false);
	    	courceColorMainPane_2.setVisible(false);
	    	courceColorMainPane_3.setVisible(false);
	    	courceColorMainPane_4.setVisible(false);
	    	courceColorMainPane_5.setVisible(false);
	    	courceColorMainPane_6.setVisible(false);
	    	courceColorMainPane_7.setVisible(false);
	    	courceColorMainPane_8.setVisible(false);
	    	
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select schedule.s_cource_id, student_cources.email, student_cources.s_cource_id, \r\n" + 
						"schedule.cource_name, schedule.start_date, schedule.end_date, schedule.start_time, schedule.end_time,\r\n" + 
						"schedule.days_in_week, student_cources.status\r\n" + 
						"from student_cources, schedule\r\n" + 
						"WHERE schedule.s_cource_id = student_cources.s_cource_id and student_cources.status=2 and student_cources.email='"+StudentEmail+"' ");
				int i=1;
				while (rs.next()) {
					if(i==1) {
						courceColorMainPane_1.setVisible(true);
						courceLableColor_1.setText(rs.getNString(4));
						int paneIndex1=convertToIndex(rs.getString(7)); 
						int paneIndex2=convertToIndex(rs.getString(8));
						for (int j = paneIndex1; j < paneIndex2; j++) {
							if(rs.getString(9).equals("Sun-Tus-Thu")) {
								SunPaneList.get(j).setStyle("-fx-background-color: #" + "AD1457");
								TusPaneList.get(j).setStyle("-fx-background-color: #" + "AD1457");
								ThuPaneList.get(j).setStyle("-fx-background-color: #" + "AD1457");
							}
							else if(rs.getString(9).equals("Mon-Wed")) { 
								MonPaneList.get(j).setStyle("-fx-background-color: #" + "AD1457");
								WedPaneList.get(j).setStyle("-fx-background-color: #" + "AD1457");
							}
						}
						
				    	i++;
				    	continue;
					}
					if(i==2) {
						courceColorMainPane_2.setVisible(true);
						courceLableColor_2.setText(rs.getNString(4));
						int paneIndex1=convertToIndex(rs.getString(7)); 
						int paneIndex2=convertToIndex(rs.getString(8));
						for (int j = paneIndex1; j < paneIndex2; j++) {
							if(rs.getString(9).equals("Sun-Tus-Thu")) { 
								SunPaneList.get(j).setStyle("-fx-background-color: #" + "7986CB");
								TusPaneList.get(j).setStyle("-fx-background-color: #" + "7986CB");
								ThuPaneList.get(j).setStyle("-fx-background-color: #" + "7986CB");
							}
							else if(rs.getString(9).equals("Mon-Wed")) { 
								MonPaneList.get(j).setStyle("-fx-background-color: #" + "7986CB");
								WedPaneList.get(j).setStyle("-fx-background-color: #" + "7986CB");
							}
						}
						
				    	i++;
				    	continue;
					}
					if(i==3) { System.out.println("Hi");
						courceColorMainPane_3.setVisible(true);
						courceLableColor_3.setText(rs.getNString(4));
						int paneIndex1=convertToIndex(rs.getString(7)); 
						int paneIndex2=convertToIndex(rs.getString(8)); 
						for (int j = paneIndex1; j < paneIndex2; j++) {
							if(rs.getString(9).equals("Sun-Tus-Thu")) { 
								SunPaneList.get(j).setStyle("-fx-background-color: #" + "80DEEA");
								TusPaneList.get(j).setStyle("-fx-background-color: #" + "80DEEA");
								ThuPaneList.get(j).setStyle("-fx-background-color: #" + "80DEEA");
							}
							else if(rs.getString(9).equals("Mon-Wed")) { 
								MonPaneList.get(j).setStyle("-fx-background-color: #" + "80DEEA");
								WedPaneList.get(j).setStyle("-fx-background-color: #" + "80DEEA");
							}
						}
						
				    	i++;
				    	continue;
					}
					if(i==4) {
						courceColorMainPane_4.setVisible(true);
						courceLableColor_4.setText(rs.getNString(4));
						int paneIndex1=convertToIndex(rs.getString(7));
						int paneIndex2=convertToIndex(rs.getString(8));
						for (int j = paneIndex1; j < paneIndex2; j++) {
							if(rs.getString(9).equals("Sun-Tus-Thu")) { 
								SunPaneList.get(j).setStyle("-fx-background-color: #" + "A5D6A7");
								TusPaneList.get(j).setStyle("-fx-background-color: #" + "A5D6A7");
								ThuPaneList.get(j).setStyle("-fx-background-color: #" + "A5D6A7");
							}
							else if(rs.getString(9).equals("Mon-Wed")) { 
								MonPaneList.get(j).setStyle("-fx-background-color: #" + "A5D6A7");
								WedPaneList.get(j).setStyle("-fx-background-color: #" + "A5D6A7");
							}
						}
						
				    	i++;
				    	continue;
					}
					if(i==5) {
						courceColorMainPane_5.setVisible(true);
						courceLableColor_5.setText(rs.getNString(4));
						int paneIndex1=convertToIndex(rs.getString(7));
						int paneIndex2=convertToIndex(rs.getString(8)); 
						for (int j = paneIndex1; j < paneIndex2; j++) {
							if(rs.getString(9).equals("Sun-Tus-Thu")) { 
								SunPaneList.get(j).setStyle("-fx-background-color: #" + "EF9A9A");
								TusPaneList.get(j).setStyle("-fx-background-color: #" + "EF9A9A");
								ThuPaneList.get(j).setStyle("-fx-background-color: #" + "EF9A9A");
							}
							else if(rs.getString(9).equals("Mon-Wed")) { 
								MonPaneList.get(j).setStyle("-fx-background-color: #" + "EF9A9A");
								WedPaneList.get(j).setStyle("-fx-background-color: #" + "EF9A9A");
							}
						}
						
				    	i++;
				    	continue;
					}
					if(i==6) {
						courceColorMainPane_6.setVisible(true);
						courceLableColor_6.setText(rs.getNString(4));
						int paneIndex1=convertToIndex(rs.getString(7)); 
						int paneIndex2=convertToIndex(rs.getString(8));
						for (int j = paneIndex1; j < paneIndex2; j++) {
							if(rs.getString(9).equals("Sun-Tus-Thu")) { 
								SunPaneList.get(j).setStyle("-fx-background-color: #" + "FFE082");
								TusPaneList.get(j).setStyle("-fx-background-color: #" + "FFE082");
								ThuPaneList.get(j).setStyle("-fx-background-color: #" + "FFE082");
							}
							else if(rs.getString(9).equals("Mon-Wed")) { 
								MonPaneList.get(j).setStyle("-fx-background-color: #" + "FFE082");
								WedPaneList.get(j).setStyle("-fx-background-color: #" + "FFE082");
							}
						}
						
				    	i++;
				    	continue;
					}
				}
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
		}
		
		int convertToIndex(String x) { //DONE .. used with init
	    	if(x.equals("08:00 am"))
	    		return 0;
	    	if(x.equals("08:30 am"))
	    		return 1;
	    	if(x.equals("09:00 am"))
	    		return 2;
	    	if(x.equals("09:30 am"))
	    		return 3;
	    	if(x.equals("10:00 am"))
	    		return 4;
	    	if(x.equals("10:30 am"))
	    		return 5;
	    	if(x.equals("11:00 am"))
	    		return 6;
	    	if(x.equals("11:30 am"))
	    		return 7;
	    	if(x.equals("12:00 pm"))
	    		return 8;
	    	if(x.equals("12:30 pm"))
	    		return 9;
	    	if(x.equals("01:00 pm"))
	    		return 10;
	    	if(x.equals("01:30 pm"))
	    		return 11;
	    	if(x.equals("02:00 pm"))
	    		return 12;
	    	if(x.equals("02:30 pm"))
	    		return 13;
	    	return 14;
	    }
	   		 
	    @FXML
		private List<Pane> SunPaneList ;
	    
	    @FXML
		private List<Pane> MonPaneList ;    

	    @FXML
		private List<Pane> TusPaneList ;

	    @FXML
		private List<Pane> WedPaneList ;

	    @FXML
		private List<Pane> ThuPaneList ;
}
