package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;

public class TeacherController implements Initializable {

		public static String TeacherEmail="sam123@gmail.com";
		
		public static void setEmail(String email) {
			TeacherEmail = email;
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
	    

	    //*******************************************************************8

	    @FXML
	    private Pane teacherCourcePane_1;

	    @FXML
	    private Label teacherCourceNameLable_1;

	    @FXML
	    private Button teacherCourceStudentsButton_1;

	    @FXML
	    private Pane teacherCourcePane_2;

	    @FXML
	    private Label teacherCourceNameLable_2;

	    @FXML
	    private Button teacherCourceStudentsButton_2;

	    @FXML
	    private Pane teacherCourcePane_3;

	    @FXML
	    private Label teacherCourceNameLable_3;

	    @FXML
	    private Button teacherCourceStudentsButton_3;

	    @FXML
	    private Pane teacherCourcePane_4;

	    @FXML
	    private Label teacherCourceNameLable_4;

	    @FXML
	    private Button teacherCourceStudentsButton_4;

	    @FXML
	    private Pane teacherCourcePane_5;

	    @FXML
	    private Label teacherCourceNameLable_5;

	    @FXML
	    private Button teacherCourceStudentsButton_5;

	    @FXML
	    private Pane teacherCourcePane_6;

	    @FXML
	    private Label teacherCourceNameLable_6;
	    
	    @FXML
	    private Button teacherCourceStudentsButton_6;

	    @FXML
	    private Pane CourceStudentsPane;

	    @FXML
	    private Button BackToMyCourcesButton;
	    
	    @FXML
	    private Pane MyCourcesPane;
	    
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

	    @FXML
	    private TableView<CourceTeacherStudentsTable> courceStudentsTable_teacher;

	    @FXML
	    private TableColumn<CourceTeacherStudentsTable, String> col_StudentName;

	    @FXML
	    private TableColumn<CourceTeacherStudentsTable, String> col_Email;

	    @FXML
	    private TableColumn<CourceTeacherStudentsTable, String> col_Phone;

	    @FXML
	    private TableColumn<CourceTeacherStudentsTable, String> col_Gender;

	    @FXML
	    private TableColumn<CourceTeacherStudentsTable, String> col_Status;

	    @FXML
	    private Label CurrentCourceNameLabel, studentPhoneLabel;
	    
	    @FXML
	    private Label teacherCourceNameLable_11, teacherCourceNameLable_111, teacherCourceNameLable_112,teacherCourceNameLable_113, teacherCourceNameLable_114, teacherCourceNameLable_115;
//***********************************************************************************************************
	    
	    @FXML
	    void BackToMyCources(ActionEvent event) { //DONE 
	    	CompletedCourcesPane.toFront();
	    }
	    
	    ObservableList<CourceTeacherStudentsTable> obList = FXCollections.observableArrayList();

	    int cource_id=0;
	    @FXML
	    void viewCourceStudents(ActionEvent event) { //DONE  	
	    	if(event.getSource()==teacherCourceStudentsButton_1) {
	    		CurrentCourceNameLabel.setText(teacherCourceNameLable_1.getText());
	    		cource_id=Integer.parseInt(teacherCourceNameLable_11.getText());
	    	}
	    	else if(event.getSource()==teacherCourceStudentsButton_2) {
	    		CurrentCourceNameLabel.setText(teacherCourceNameLable_2.getText());
	    		cource_id=Integer.parseInt(teacherCourceNameLable_111.getText());	 
	    		}
	    	else if(event.getSource()==teacherCourceStudentsButton_3) {
	    		CurrentCourceNameLabel.setText(teacherCourceNameLable_3.getText());
	    		cource_id=Integer.parseInt(teacherCourceNameLable_112.getText());	  
	    		}
	    	else if(event.getSource()==teacherCourceStudentsButton_4) {
	    		CurrentCourceNameLabel.setText(teacherCourceNameLable_4.getText());
	    		cource_id=Integer.parseInt(teacherCourceNameLable_113.getText());	 
	    		}
	    	else if(event.getSource()==teacherCourceStudentsButton_5) {
	    		CurrentCourceNameLabel.setText(teacherCourceNameLable_5.getText());
	    		cource_id=Integer.parseInt(teacherCourceNameLable_114.getText());	   
	    		}
	    	else if(event.getSource()==teacherCourceStudentsButton_6) {
	    		CurrentCourceNameLabel.setText(teacherCourceNameLable_6.getText());
	    		cource_id=Integer.parseInt(teacherCourceNameLable_115.getText());	    
	    		}
	    	
	    	obList.clear();
			try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select * from student, student_cources\r\n" + 
						"where student.email=student_cources.email and student_cources.s_cource_id="+cource_id+"");				
				while (rs.next()) {
					String keyEmail = rs.getNString(1);
					String currentCources = "";
					ResultSet rsCources = conn.createStatement().executeQuery("SELECT cource.cource_name, student_cources.status\r\n" + 
							"FROM student, student_cources, cource\r\n" + 
							"WHERE student.email = student_cources.email and cource.cource_id=student_cources.s_cource_id and cource.cource_id= "+cource_id+" and student.email='"+ keyEmail+"'");
					while (rsCources.next()) {
						if(rsCources.getInt(2)==2) currentCources= "-";
						else if(rsCources.getInt(2)==1) currentCources="PASSED";
						else if(rsCources.getInt(2)==0) currentCources="FAILED";
					}
					obList.add(new CourceTeacherStudentsTable(rs.getNString(2)+" "+rs.getNString(3)+" "+rs.getNString(4)+" "+rs.getNString(5),
								rs.getNString(6), rs.getNString(1), rs.getNString(10), rs.getNString(11) ,currentCources));
				}
				conn.close();			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			col_StudentName.setCellValueFactory(new PropertyValueFactory<>("Name"));
			col_Phone.setCellValueFactory(new PropertyValueFactory<>("Phone"));
			col_Email.setCellValueFactory(new PropertyValueFactory<>("Email"));
			col_Gender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
			col_Status.setCellValueFactory(new PropertyValueFactory<>("Status"));
			
			courceStudentsTable_teacher.setItems(obList); 
			courceStudentsTable_teacher.setEditable(true); 
			col_Status.setCellFactory(TextFieldTableCell.forTableColumn());
			
    		CourceStudentsPane.toFront();
	    }
	    
	    @FXML
	    void UnderLine(ActionEvent event) throws Exception {
	    	removeLine();
	    	if(event.getSource()==login_Button) {
	    	//	pane.setStyle("-fx-background-color: #" + "AD1457");
	    		studentChangePasswordPane.setVisible(false);
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
	    		MyCourcesPane.toFront();
	    	}    	
	    	else if(event.getSource()==CompletedCourcesButton) {
	    		CompletedCourcesButton.setUnderline(true);
	    		showTeacherCources();
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
	    
	    public void showTeacherCources() { //DONE 
	    	teacherCourcePane_1.setVisible(false);
	    	teacherCourcePane_2.setVisible(false);
	    	teacherCourcePane_3.setVisible(false);
	    	teacherCourcePane_4.setVisible(false);
	    	teacherCourcePane_5.setVisible(false);
	    	teacherCourcePane_6.setVisible(false);
	    	
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select * from teaches, cource\r\n" + 
						"where cource.cource_id= teaches.t_cource_id and teaches.email = '"+TeacherEmail+"'");
				int i=1;
				while (rs.next()) {
					if(i==1) {
				    	teacherCourcePane_1.setVisible(true);
				    	teacherCourceNameLable_11.setText(""+rs.getInt(1));
				    	teacherCourceNameLable_1.setText(rs.getNString(4));
				    	i++;
				    	continue;
					}
					if(i==2) {
				    	teacherCourcePane_2.setVisible(true);
				    	teacherCourceNameLable_111.setText(""+rs.getInt(1));
				    	teacherCourceNameLable_2.setText(rs.getNString(4));
				    	i++;
				    	continue;
					}
					if(i==3) {
				    	teacherCourcePane_3.setVisible(true);
				    	teacherCourceNameLable_112.setText(""+rs.getInt(1));
				    	teacherCourceNameLable_3.setText(rs.getNString(4));
				    	i++;
				    	continue;
					}
					if(i==4) {
				    	teacherCourcePane_4.setVisible(true);
				    	teacherCourceNameLable_113.setText(""+rs.getInt(1));
				    	teacherCourceNameLable_4.setText(rs.getNString(4));
				    	i++;
				    	continue;
					}
					if(i==5) {
				    	teacherCourcePane_5.setVisible(true);
				    	teacherCourceNameLable_114.setText(""+rs.getInt(1));
				    	teacherCourceNameLable_5.setText(rs.getNString(4));
				    	i++;
				    	continue;
					}
					if(i==6) {
				    	teacherCourcePane_6.setVisible(true);
				    	teacherCourceNameLable_115.setText(""+rs.getInt(1));
				    	teacherCourceNameLable_6.setText(rs.getNString(4));
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
	    void showChangePasswordPane(ActionEvent event) {
	    	studentChangePasswordPane.setVisible(true);
	    	
	    }
	    
	    @FXML
	    public void changeStudentStatus(CellEditEvent<CourceTeacherStudentsTable, String> cellEditEvent) { //DONE 
	    	CourceTeacherStudentsTable editedRecord = courceStudentsTable_teacher.getSelectionModel().getSelectedItem();
	    	String newVal = cellEditEvent.getNewValue();
	    	int newStat = 2;
	    	if(newVal.equals("PASSED") || newVal.equals("Passed") || newVal.equals("passed") || newVal.equals("1") || newVal.equals("PASS") || newVal.equals("Pass") || newVal.equals("pass")) {
	    		newStat=1;
	    	}
	    	else if(newVal.equals("FAILED") || newVal.equals("Failed") || newVal.equals("failed") || newVal.equals("0") || newVal.equals("FAIL") || newVal.equals("Fail") || newVal.equals("fail")) {
	    		newStat=0;
	    	}
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				conn.createStatement().executeQuery("UPDATE student_cources SET student_cources.status = "+newStat+" \r\n" + 
						"where s_cource_id = "+cource_id+" and email = '"+editedRecord.email+"'");
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

		
	    @Override
		public void initialize(URL location, ResourceBundle resources) { //DONE I THINK.. 
	    	setMyProfileInfo();
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
				ResultSet rs = conn.createStatement().executeQuery("select * from teaches, schedule\r\n" + 
						"WHERE schedule.s_cource_id = teaches.t_cource_id and teaches.email='"+TeacherEmail+"'");
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
					if(i==3) {
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
	    
	    public void setMyProfileInfo() {
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select * from staff where email = '"+TeacherEmail+"'");
				while (rs.next()) {
					studentUserNameLabel_1.setText(rs.getString(2));
					studentUserNameLabel_2.setText(rs.getString(2));
					studentNameEnLabel.setText(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
					studentGenderLabel.setText(rs.getString(10));
					studentEmailLabel.setText(rs.getString(1));
					studentPhoneLabel.setText(rs.getString(6));
				}
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

