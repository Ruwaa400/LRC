package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.xml.JRXmlDigesterFactory;
import net.sf.jasperreports.view.JasperViewer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class AdminController implements Initializable{

	public static String AdminEmail="ruwaa.tareq@gmail.com"; 
	
	public static void setEmail(String email) {
		AdminEmail = email;
	}
	
    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane ActivitiesPane;

    @FXML
    private Button NewActivityButton;

    @FXML
    private AnchorPane AboutUsPane;

    @FXML
    private AnchorPane SignOutPane;

    @FXML
    private AnchorPane CourcesPane;

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
    private AnchorPane ContactPane;

    @FXML
    private AnchorPane FrontPane;

    @FXML
    private AnchorPane MainMenuBar;

    @FXML
    private Button login_Button;

    @FXML
    private ImageView ProfileButton;

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
    private AnchorPane HomePane;

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
    private AnchorPane LoginPane;

    @FXML
    private Label studentUserNameLabel_1;

    @FXML
    private Button MyProfileButton;

    @FXML
    private Button CourcesButton;

    @FXML
    private Button StudentsButton;

    @FXML
    private Button ContactStaffButton1;

    @FXML
    private Button ContactStaffButton;

    @FXML
    private Pane ContactStaffPane;

    @FXML
    private Pane ChartsPane;

    @FXML
    private PieChart PieChart;

    @FXML
    private Pane RegisterNewStudentPane;

    @FXML
    private TextField studentFullNameTextField;

    @FXML
    private TextArea studentAddressTextArea;

    @FXML
    private TextField studentEmailTextField;

    @FXML
    private TextField studentPhoneTextField;

    @FXML
    private RadioButton FemaleRadioButton;

    @FXML
    private ToggleGroup MaleFemale;

    @FXML
    private RadioButton MaleRadioButton;

    @FXML
    private RadioButton UStudentRadioButton;

    @FXML
    private ToggleGroup StuStaffNeither;

    @FXML
    private RadioButton UStaffRadioButton;

    @FXML
    private RadioButton NeitherRadioButton;

    @FXML
    private Pane UniversityExtraInfoPane;

    @FXML
    private TextField UnivercityNumTextField;

    @FXML
    private ComboBox<String> DepartmentComboBox;

    @FXML
    private Button BackToAllStudentsPaneButton;

    @FXML
    private Button AddNewStudentToDBButton;

    @FXML
    private Pane allStudentsPane;

    @FXML
    private TableView<AllStudentsTable> AllStudentsTable;

    @FXML
    private TableColumn<AllStudentsTable, String> col_StudentName12;

    @FXML
    private TableColumn<AllStudentsTable, String> col_StudentPhone1;

    @FXML
    private TableColumn<AllStudentsTable, String> col_StudentEmail1;

    @FXML
    private TableColumn<AllStudentsTable, String> col_StudentPassword1;

    @FXML
    private TableColumn<AllStudentsTable, String> col_StudentGender1;

    @FXML
    private TableColumn<AllStudentsTable, String> col_StudentAddress1;

    @FXML
    private TableColumn<AllStudentsTable, String> col_CompletedCources1;

    @FXML
    private TableColumn<AllStudentsTable, String> col_CourcesCurrentlyTaking;

    @FXML
    private Button RemoveStudentRecordButton;

    @FXML
    private Button RegisterNewStudentsButton;

    @FXML
    private TextField SearchStudentTextField;

    @FXML
    private Button SearchStudentButton;

    @FXML
    private Pane CourceStudentsPane;

    @FXML
    private Button BackToMyCourcesButton;

    @FXML
    private TableView<CourceStudentTable> courceStudentsTable;

    @FXML
    private TableColumn<CourceStudentTable, String> col_StudentName;

    @FXML
    private TableColumn<CourceStudentTable, String> col_StudentPhone;

    @FXML
    private TableColumn<CourceStudentTable, String> col_StudentEmail;

    @FXML
    private TableColumn<CourceStudentTable, String> col_StudentPassword;

    @FXML
    private TableColumn<CourceStudentTable, String> col_StudentGender;

    @FXML
    private TableColumn<CourceStudentTable, String> col_StudentAddress;

    @FXML
    private Label courceNameLable;

    @FXML
    private Button AddStudentToThisCourceButton;

    @FXML
    private Pane ThisSemesterCourcesPane;

    @FXML
    private Label CourceNameLable_1;

    @FXML
    private Label StartDateLabel_1;

    @FXML
    private Label EndDateLabel_1;

    @FXML
    private Label StartTimeLabel_1;

    @FXML
    private Label EndTimeLabel_1;

    @FXML
    private Label DaysInWeekLabel_1;

    @FXML
    private Button CourceStudentsButton_1;

    @FXML
    private Label CourceNameLable_2;

    @FXML
    private Label StartDateLabel_2;

    @FXML
    private Label EndDateLabel_2;

    @FXML
    private Label StartTimeLabel_2;

    @FXML
    private Label EndTimeLabel_2;

    @FXML
    private Label DaysInWeekLabel_2;

    @FXML
    private Button CourceStudentsButton_2;

    @FXML
    private Label CourceNameLable_3;

    @FXML
    private Label StartDateLabel_3;

    @FXML
    private Label EndDateLabel_3;

    @FXML
    private Label StartTimeLabel_3;

    @FXML
    private Label EndTimeLabel_3;

    @FXML
    private Label DaysInWeekLabel_3;

    @FXML
    private Button CourceStudentsButton_3;

    @FXML
    private Label CourceNameLable_4;

    @FXML
    private Label StartDateLabel_4;

    @FXML
    private Label EndDateLabel_4;

    @FXML
    private Label StartTimeLabel_4;

    @FXML
    private Label EndTimeLabel_4;

    @FXML
    private Label DaysInWeekLabel_4;

    @FXML
    private Button CourceStudentsButton_4;

    @FXML
    private Label CourceNameLable_5;

    @FXML
    private Label StartDateLabel_5;

    @FXML
    private Label EndDateLabel_5;

    @FXML
    private Label StartTimeLabel_5;

    @FXML
    private Label EndTimeLabel_5;

    @FXML
    private Label DaysInWeekLabel_5;

    @FXML
    private Button CourceStudentsButton_5;

    @FXML
    private Label CourceNameLable_6;

    @FXML
    private Label StartDateLabel_6;

    @FXML
    private Label EndDateLabel_6;

    @FXML
    private Label StartTimeLabel_6;

    @FXML
    private Label EndTimeLabel_6;

    @FXML
    private Label DaysInWeekLabel_6;

    @FXML
    private Button CourceStudentsButton_6;

    @FXML
    private Label CourceNameLable_7;

    @FXML
    private Label StartDateLabel_7;

    @FXML
    private Label EndDateLabel_7;

    @FXML
    private Label StartTimeLabel_7;

    @FXML
    private Label EndTimeLabel_7;

    @FXML
    private Label DaysInWeekLabel_7;

    @FXML
    private Button CourceStudentsButton_7;

    @FXML
    private Label CourceNameLable_8;

    @FXML
    private Label StartDateLabel_8;

    @FXML
    private Label EndDateLabel_8;

    @FXML
    private Label StartTimeLabel_8;

    @FXML
    private Label EndTimeLabel_8;

    @FXML
    private Label DaysInWeekLabel_8;

    @FXML
    private Button CourceStudentsButton_8;

    @FXML
    private Label CourceNameLable_9;

    @FXML
    private Label StartDateLabel_9;

    @FXML
    private Label EndDateLabel_9;

    @FXML
    private Label StartTimeLabel_9;

    @FXML
    private Label EndTimeLabel_9;

    @FXML
    private Label DaysInWeekLabel_9;

    @FXML
    private Button CourceStudentsButton_9;

    @FXML
    private Label CourceNameLable_10;

    @FXML
    private Label StartDateLabel_10;

    @FXML
    private Label EndDateLabel_10;

    @FXML
    private Label StartTimeLabel_10;

    @FXML
    private Label EndTimeLabel_10;

    @FXML
    private Label DaysInWeekLabel_10;

    @FXML
    private Button CourceStudentsButton_10;

    @FXML
    private ComboBox<String> CourceLevelComboBox;

    @FXML
    private ComboBox<String> CourceLevelComboBox1;

    @FXML
    private TextField addLanguageTextField;

    @FXML
    private DatePicker StartDatePicker;

    @FXML
    private DatePicker EndDatePicker;

    @FXML
    private ComboBox<String> StartTimeComboBox_h;

    @FXML
    private ComboBox<String> StartTimeComboBox_m;

    @FXML
    private ComboBox<String> StartTimeComboBox_am;

    @FXML
    private ComboBox<String> EndTimeComboBox_h;

    @FXML
    private ComboBox<String> EndTimeComboBox_m;

    @FXML
    private ComboBox<String> EndTimeComboBox_am;

    @FXML
    private Button AddCourceButton;

    @FXML
    private Button DeleteCourceButton, ChartsButton1;

    @FXML
    private Pane MyProfilePane;

    @FXML
    private Label studentUserNameLabel_2;

    @FXML
    private Label studentNameEnLabel, studentEmailLabel1;

    @FXML
    private Label studentGenderLabel;

    @FXML
    private Label studentEmailLabel;

    @FXML
    private Button studentEditPhoneButton;

    @FXML
    private Button studentChangePasswordButton;

    @FXML
    private Pane studentChangePasswordPane;

    @FXML
    private TextField studentPasswordTextField_1;

    @FXML
    private TextField studentPasswordTextField_2; 

    @FXML
    private TextField DepartmentTextField;
 
    @FXML
    private TextField studentPasswordTextField;
    
    @FXML
    private Button studentSaveNewPasswordButton;

    @FXML
	private Button ChartsButton, RemoveStudentRecordButton1;
    
    @FXML
    private Pane courceInfoPane_1;
    
    @FXML
    private Pane courceInfoPane_2;

    @FXML
    private Pane courceInfoPane_3;
    
    @FXML
    private Pane courceInfoPane_4;
    
    @FXML
    private Pane courceInfoPane_5;
    
    @FXML
    private Pane courceInfoPane_6;
    
    @FXML
    private Pane courceInfoPane_7;
    
    @FXML
    private Pane courceInfoPane_8;
    
    @FXML
    private Pane courceInfoPane_9;
    
    @FXML
    private Pane courceInfoPane_10;
    
    @FXML
    private Label CourceNameLable_11, CourceNameLable_21, CourceNameLable_31, CourceNameLable_41, CourceNameLable_51, CourceNameLable_61, CourceNameLable_71, CourceNameLable_81, CourceNameLable_91, CourceNameLable_101;
    
    Boolean alreadySet = false;
    Boolean alreadySet2 = false;
    @FXML
    void ProfileStuff(ActionEvent event) { //DONE 
    	removeLine_2();
    	if(event.getSource()==MyProfileButton) {
    		if(!alreadySet2) { setMyProfileInfo();  alreadySet2=true;}
    		MyProfileButton.setUnderline(true);
    		MyProfilePane.toFront();
    	}	    	
    	else if(event.getSource()==CourcesButton) {
    		CourcesButton.setUnderline(true);
    		if(!alreadySet) { setComboboxsData();  alreadySet=true;}
    		setCourcesInThisSemesterCourcesPane();
    		ThisSemesterCourcesPane.toFront();
    	}    	
    	else if(event.getSource()==StudentsButton) {
    		StudentsButton.setUnderline(true);
    		obList.clear();
    		initialize(null, null); 
    		RemoveStudentRecordButton1.setVisible(false); 
    		RemoveStudentRecordButton.setVisible(true); 
    		RegisterNewStudentsButton.setVisible(true); 
    		SearchStudentTextField.setText(null); 
    		allStudentsPane.toFront();
    	}
    	else if(event.getSource()==ContactStaffButton) {
    		ContactStaffButton.setUnderline(true);
    		ContactStaffPane.toFront();
    	}  	
    	else if(event.getSource()==ChartsButton) {
    		ChartsButton.setUnderline(true);
    		ChartsPane.toFront();
    	}  	
    }
    
    @FXML
    private void removeLine_2() { //DONE 
    	MyProfileButton.setUnderline(false);
    	CourcesButton.setUnderline(false);
    	StudentsButton.setUnderline(false);
    	ChartsButton.setUnderline(false);
    	ContactStaffButton.setUnderline(false);
    }

    @FXML
    void UnderLine(ActionEvent event) throws Exception { //DONE 
    	removeLine();
    	if(event.getSource()==login_Button) {
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
    private void removeLine() { //DONE 
    	login_Button.setUnderline(false);
    	Activities_Button.setUnderline(false);
    	AboutUs_Button.setUnderline(false);
    	Home_Button.setUnderline(false);
    	Courses_Button.setUnderline(false);   	
    }

    @FXML
    void addNewStudentToDB(ActionEvent event) { //DONE 
    	if(studentFullNameTextField.getText().equals("") || studentEmailTextField.getText().equals("") || studentPhoneTextField.getText().equals("") || studentAddressTextArea.getText().equals("") || studentPasswordTextField.getText().equals("")) {
    		JOptionPane.showMessageDialog(null, "Some Fields are Missing.", "ERROR", JOptionPane.ERROR_MESSAGE);
    	}
    	else if((UStudentRadioButton.isSelected() || UStaffRadioButton.isSelected()) && (UnivercityNumTextField.getText().equals("") || DepartmentTextField.getText().equals(""))){
    		JOptionPane.showMessageDialog(null, "Some Fields are Missing.", "ERROR", JOptionPane.ERROR_MESSAGE);	
    	}
    	else {
    		try {
    			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");	//"++"	
    			String [] name = studentFullNameTextField.getText().split(" ");
    			String [] address = studentAddressTextArea.getText().split(",");
    			String sex= "";
    			if(FemaleRadioButton.isSelected()) sex="F";
    			else if(MaleRadioButton.isSelected()) sex="M";
    			conn.createStatement().executeQuery("INSERT INTO student VALUES ('"+studentEmailTextField.getText()+"', '"+name[0]+"','"+name[1]+"','"+name[2]+"','"+name[3]+"',"
    					+ " '"+studentPhoneTextField.getText()+"', '"+address[0]+"', '"+address[1]+"', '"+address[2]+"','"+studentPasswordTextField.getText()+"', '"+sex+"')");
    			if(UStudentRadioButton.isSelected()) {
    				conn.createStatement().executeQuery("INSERT INTO ustudent VALUES('"+studentEmailTextField.getText()+"','"+DepartmentTextField.getText()+"', '"+UnivercityNumTextField.getText()+"')");
    			}
    			else if(UStaffRadioButton.isSelected()) {
    				conn.createStatement().executeQuery("INSERT INTO uemployee VALUES('"+studentEmailTextField.getText()+"', '"+UnivercityNumTextField.getText()+"')");
    			}
    			conn.close();
        		JOptionPane.showMessageDialog(null, "Saved.", "ALL GOOD", JOptionPane.PLAIN_MESSAGE);	
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		studentFullNameTextField.clear();
    		studentEmailTextField.clear();
    		studentPhoneTextField.clear();
    		studentAddressTextArea.clear();
    		studentPasswordTextField.clear();
    		UnivercityNumTextField.clear();
    		DepartmentTextField.clear();
    	}
    	
    }
    
    @FXML
    void addCourcetoDB(ActionEvent event) { //DONE 
    	try {
    	if(addLanguageTextField.getText().equals("") || CourceLevelComboBox.getValue().equals(null) ||
    			CourceLevelComboBox1.getValue().equals(null) || 
    			StartDatePicker.getValue().equals(null) || 
    			EndDatePicker.getValue().equals(null)
    			|| StartTimeComboBox_h.getValue().equals(null) || StartTimeComboBox_m.getValue().equals(null) || StartTimeComboBox_am.getValue().equals(null) || 
    			EndTimeComboBox_h.getValue().equals(null) || EndTimeComboBox_m.getValue().equals(null) || EndTimeComboBox_am.getValue().equals(null) ) {
    		
    		JOptionPane.showMessageDialog(null, "Some Fields are Missing.", "ERROR", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		try {
    			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
    			conn.createStatement().executeQuery("INSERT INTO cource VALUES(Cource_id.nextval, '"+addLanguageTextField.getText()+" "+CourceLevelComboBox.getValue()+"' )");
    			ResultSet rs = conn.createStatement().executeQuery("select* from cource");
    			int cource_id=0;
    			while (rs.next()) {
    				ResultSet rs2=conn.createStatement().executeQuery("select * from schedule");
    				boolean exist=false;
    				while (rs2.next()) {
						if(rs.getInt(1)==rs2.getInt(1)) {
							exist=true;  break;
						}
					}
    				if(!exist) {
    					cource_id=rs.getInt(1);
        				break;
    				}	
				}
    			conn.createStatement().executeQuery("INSERT INTO schedule VALUES("+cource_id+", '"+addLanguageTextField.getText()+" "+CourceLevelComboBox.getValue()+"', '"+""+(StartDatePicker.getValue())+"' ,'"+""+(EndDatePicker.getValue())+"',"  
    					   					+ "'"+StartTimeComboBox_h.getValue()+":"+StartTimeComboBox_m.getValue()+" "+StartTimeComboBox_am.getValue()+"' ," + 
    					  							"'"+EndTimeComboBox_h.getValue()+":"+EndTimeComboBox_m.getValue()+" "+EndTimeComboBox_am.getValue()+"','"+CourceLevelComboBox1.getValue()+"')");
    			conn.close();
        		JOptionPane.showMessageDialog(null, "Saved.", "ALL GOOD", JOptionPane.PLAIN_MESSAGE);
        		 addLanguageTextField.setText(null); 
        		 CourceLevelComboBox.setValue(null); 
        		 CourceLevelComboBox1.setValue(null); 
        		 StartDatePicker.setValue(null); 
        		 EndDatePicker.setValue(null); 
        		 StartTimeComboBox_h.setValue(null); 
        		 StartTimeComboBox_m.setValue(null); 
        		 StartTimeComboBox_am.setValue(null); 
        		 EndTimeComboBox_h.setValue(null); 
        		 EndTimeComboBox_m.setValue(null); 
        		 EndTimeComboBox_am.setValue(null); 
        		 
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}	
    	}
    	catch(Exception exception) {
    		JOptionPane.showMessageDialog(null, "Some Fields are Missing.", "ERROR", JOptionPane.ERROR_MESSAGE);
    		
    	}
    	
    }

    @FXML
    void SearchFromAllStudentsTable(ActionEvent event) { //DONE 
    	String searchName = SearchStudentTextField.getText();
    	if(searchName.contentEquals("")) { initialize(null, null);   return;}
    	else {
    		obList.clear();
    		try {
    			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
    			ResultSet rs = conn.createStatement().executeQuery("SELECT * from student");
    			
    			while (rs.next()) {
    				if((rs.getNString(2)+" "+rs.getNString(3)+" "+rs.getNString(4)+" "+rs.getNString(5)).contains(searchName)) {
    					String keyEmail = rs.getNString(1);
    					String currentCources = "-";
    					String finishedCources = "-";
    					ResultSet rsCources = conn.createStatement().executeQuery("SELECT DISTINCT cource.cource_name, student_cources.status\r\n" + 
    							"FROM student, student_cources, cource\r\n" + 
    							"WHERE student.email = student_cources.email and cource.cource_id=student_cources.s_cource_id and student.email='"+ keyEmail+"'");
    					while (rsCources.next()) {
    						if(rsCources.getInt(2)==2) currentCources+="/"+rsCources.getNString(1);
    						else if(rsCources.getInt(2)==1) finishedCources+="/"+rsCources.getNString(1);
    					}
    					obList.add(new AllStudentsTable(rs.getNString(2)+" "+rs.getNString(3)+" "+rs.getNString(4)+" "+rs.getNString(5),
    								rs.getNString(6), rs.getNString(1), rs.getNString(10), rs.getNString(11) ,
    								rs.getNString(7)+", "+rs.getNString(8)+", "+rs.getNString(9), currentCources, finishedCources));
    				}		
    			}
    			conn.close();			
    		} catch (Exception e) {
    		}
    		
    		col_StudentName12.setCellValueFactory(new PropertyValueFactory<>("Name"));
    		col_StudentPhone1.setCellValueFactory(new PropertyValueFactory<>("Phone"));
    		col_StudentEmail1.setCellValueFactory(new PropertyValueFactory<>("Email"));
    		col_StudentPassword1.setCellValueFactory(new PropertyValueFactory<>("Password"));
    		col_StudentGender1.setCellValueFactory(new PropertyValueFactory<>("Gender"));
    		col_StudentAddress1.setCellValueFactory(new PropertyValueFactory<>("Address"));
    		col_CompletedCources1.setCellValueFactory(new PropertyValueFactory<>("Completed"));
    		col_CourcesCurrentlyTaking.setCellValueFactory(new PropertyValueFactory<>("Currently"));
    		
    		AllStudentsTable.setItems(obList); 
		}
    }

    @FXML
    void goBackToAllStudentsPane(ActionEvent event) { //DONE 
    	allStudentsPane.toFront();
    }

    @FXML
    void hideUniversityExtraInfoPane(ActionEvent event) { //DONE 
    	UniversityExtraInfoPane.setVisible(false); 
    }

    @FXML
    void removeRecordFromAllStudentsTable(ActionEvent event) { //DONE !! 
    	AllStudentsTable record = AllStudentsTable.getSelectionModel().getSelectedItem();
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000"); System.out.println(record.email);
			conn.createStatement().executeQuery("DELETE FROM student WHERE email='"+record.email+"'");
			conn.close();
			initialize(null, null); 
    		JOptionPane.showMessageDialog(null, "Removed.", "ALL GOOD", JOptionPane.PLAIN_MESSAGE);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void showAddStudentToThisCourceWindow(ActionEvent event) { //DONE 
		initialize(null, null); 
    	RemoveStudentRecordButton1.setVisible(true);
		RemoveStudentRecordButton.setVisible(false); 
		RegisterNewStudentsButton.setVisible(false); 
		allStudentsPane.toFront();
    }
    
    public void addSelectedStudentToCource() { //DONE 
    	AllStudentsTable record = AllStudentsTable.getSelectionModel().getSelectedItem();
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000"); System.out.println(record.email);
			conn.createStatement().executeQuery("insert into student_cources VALUES("+Cource_id+", '"+record.email+"', null, 2)");
			conn.close();
			initialize(null, null); 
    		JOptionPane.showMessageDialog(null, "Student Added.", "ALL GOOD", JOptionPane.PLAIN_MESSAGE);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    @FXML
    void showDeleteCourceWindow(ActionEvent event) { //DONE 
    	Integer idDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Write The Cource ID Number Please."));
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			conn.createStatement().executeQuery("delete from cource where cource_id="+idDelete+"");
			conn.close();
	    	JOptionPane.showMessageDialog(null, "Removed.", "ALL GOOD", JOptionPane.PLAIN_MESSAGE);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void showNewActivityWindow(ActionEvent event) {
    	//design it please..
    }

    @FXML
    void showRegisterNewStudentPane(ActionEvent event) { //DONE 
    	RegisterNewStudentPane.toFront();
    }

    @FXML
    void showThisSemesterCourcesPane(ActionEvent event) {
    	ThisSemesterCourcesPane.toFront(); 
    }

    @FXML
    void showUniversityExtraInfoPane(ActionEvent event) {
    	UniversityExtraInfoPane.setVisible(true); 
    }
    
    ObservableList<CourceStudentTable> obListCS = FXCollections.observableArrayList();
    
    int Cource_id=0;
    @FXML
    void viewCourceStudents(ActionEvent event) { //DONE 
    	
    	if(event.getSource()==CourceStudentsButton_1) {
    		Cource_id=Integer.parseInt(labelListCourcePane1.get(0).getText());
    		courceNameLable.setText(labelListCourcePane1.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_2) {
    		Cource_id=Integer.parseInt(labelListCourcePane2.get(0).getText());
    		courceNameLable.setText(labelListCourcePane2.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_3) {
    		Cource_id=Integer.parseInt(labelListCourcePane3.get(0).getText());
    		courceNameLable.setText(labelListCourcePane3.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_4) {
    		Cource_id=Integer.parseInt(labelListCourcePane4.get(0).getText());
    		courceNameLable.setText(labelListCourcePane4.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_5) {
    		Cource_id=Integer.parseInt(labelListCourcePane5.get(0).getText());
    		courceNameLable.setText(labelListCourcePane5.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_6) {
    		Cource_id=Integer.parseInt(labelListCourcePane6.get(0).getText());
    		courceNameLable.setText(labelListCourcePane6.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_7) {
    		Cource_id=Integer.parseInt(labelListCourcePane7.get(0).getText());
    		courceNameLable.setText(labelListCourcePane7.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_8) {
    		Cource_id=Integer.parseInt(labelListCourcePane8.get(0).getText());
    		courceNameLable.setText(labelListCourcePane8.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_9) {
    		Cource_id=Integer.parseInt(labelListCourcePane9.get(0).getText());
    		courceNameLable.setText(labelListCourcePane9.get(1).getText());
    	}
    	else if(event.getSource()==CourceStudentsButton_10) {
    		Cource_id=Integer.parseInt(labelListCourcePane10.get(0).getText());
    		courceNameLable.setText(labelListCourcePane10.get(1).getText());
    	}    	
    	obListCS.clear();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			ResultSet rs = conn.createStatement().executeQuery("select * from student, student_cources\r\n" + 
					"where student.email=student_cources.email and student_cources.s_cource_id="+Cource_id+" and status = 2");
			while (rs.next()) {
				obListCS.add(new CourceStudentTable(rs.getNString(2)+" "+rs.getNString(3)+" "+rs.getNString(4)+" "+rs.getNString(5),
							rs.getNString(6), rs.getNString(1), rs.getNString(10), rs.getNString(11) ,
							rs.getNString(7)+", "+rs.getNString(8)+", "+rs.getNString(9)));
			}
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		col_StudentName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		col_StudentPhone.setCellValueFactory(new PropertyValueFactory<>("Phone"));
		col_StudentEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
		col_StudentPassword.setCellValueFactory(new PropertyValueFactory<>("Password"));
		col_StudentGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
		col_StudentAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
		
		courceStudentsTable.setItems(obListCS); 
    	
    	CourceStudentsPane.toFront();
    }

//*************************************************************************************************************
    
    ObservableList<AllStudentsTable> obList = FXCollections.observableArrayList();
    ObservableList<PieChart.Data> chartList = FXCollections.observableArrayList();
    
	@Override
	public void initialize(URL location, ResourceBundle resources) { //DONE
		setMyProfileInfo();
		obList.clear();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			ResultSet rs = conn.createStatement().executeQuery("SELECT * from student");
			
			while (rs.next()) {
				String keyEmail = rs.getNString(1);
				String currentCources = "-";
				String finishedCources = "-";
				ResultSet rsCources = conn.createStatement().executeQuery("SELECT cource.cource_name, student_cources.status\r\n" + 
						"FROM student, student_cources, cource\r\n" + 
						"WHERE student.email = student_cources.email and cource.cource_id=student_cources.s_cource_id and student.email='"+ keyEmail+"'");
				while (rsCources.next()) {
					if(rsCources.getInt(2)==2) currentCources+="/"+rsCources.getNString(1);
					else if(rsCources.getInt(2)==1) finishedCources+="/"+rsCources.getNString(1);
				}
				obList.add(new AllStudentsTable(rs.getNString(2)+" "+rs.getNString(3)+" "+rs.getNString(4)+" "+rs.getNString(5),
							rs.getNString(6), rs.getNString(1), rs.getNString(10), rs.getNString(11) ,
							rs.getNString(7)+", "+rs.getNString(8)+", "+rs.getNString(9), finishedCources, currentCources));
			}
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		col_StudentName12.setCellValueFactory(new PropertyValueFactory<>("Name"));
		col_StudentPhone1.setCellValueFactory(new PropertyValueFactory<>("Phone"));
		col_StudentEmail1.setCellValueFactory(new PropertyValueFactory<>("Email"));
		col_StudentPassword1.setCellValueFactory(new PropertyValueFactory<>("Password"));
		col_StudentGender1.setCellValueFactory(new PropertyValueFactory<>("Gender"));
		col_StudentAddress1.setCellValueFactory(new PropertyValueFactory<>("Address"));
		col_CompletedCources1.setCellValueFactory(new PropertyValueFactory<>("Completed"));
		col_CourcesCurrentlyTaking.setCellValueFactory(new PropertyValueFactory<>("Currently"));
		
		AllStudentsTable.setItems(obList);
		
	//-------------PieChart stuff-----------------
		
		chartList.clear();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			ResultSet rsCource = conn.createStatement().executeQuery("select * from cource");
			while (rsCource.next()) {
				ResultSet rsStudents = conn.createStatement().executeQuery("select * from student, student_cources\r\n" + 
						"where student.email=student_cources.email and student_cources.s_cource_id = "+rsCource.getInt(1)+"");
				int studentCount=0;
				while (rsStudents.next()) {
					studentCount++;
				}
				chartList.add(new PieChart.Data(rsCource.getString(2), studentCount));
			}
			conn.close();
			PieChart.setData(chartList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void setComboboxsData() { //DONE 
		CourceLevelComboBox1.getItems().addAll("Sun-Tus-Thu", "Mon-Wed");		
		CourceLevelComboBox.getItems().addAll("A1","A2","B1","B2","C1","C2");
		StartTimeComboBox_h.getItems().addAll("01","02","03","04","05","06","07","08","09","10","11","12");
		StartTimeComboBox_m.getItems().addAll("00","30");
		StartTimeComboBox_am.getItems().addAll("am","pm");
		EndTimeComboBox_h.getItems().addAll("01","02","03","04","05","06","07","08","09","10","11","12");
		EndTimeComboBox_m.getItems().addAll("00","30"); 
		EndTimeComboBox_am.getItems().addAll("am","pm");
		
		 addLanguageTextField.setText(null); 
		 CourceLevelComboBox.setValue(null); 
		 CourceLevelComboBox1.setValue(null); 
		 StartDatePicker.setValue(null); 
		 EndDatePicker.setValue(null); 
		 StartTimeComboBox_h.setValue(null); 
		 StartTimeComboBox_m.setValue(null); 
		 StartTimeComboBox_am.setValue(null); 
		 EndTimeComboBox_h.setValue(null); 
		 EndTimeComboBox_m.setValue(null); 
		 EndTimeComboBox_am.setValue(null); 
		 
	}
	
	@FXML
	private List<Label> labelListCourcePane1;
	
	@FXML
	private List<Label> labelListCourcePane2;
	
	@FXML
	private List<Label> labelListCourcePane3;
	
	@FXML
	private List<Label> labelListCourcePane4;
	
	@FXML
	private List<Label> labelListCourcePane5;
	
	@FXML
	private List<Label> labelListCourcePane6;
	
	@FXML
	private List<Label> labelListCourcePane7;
	
	@FXML
	private List<Label> labelListCourcePane8;
	
	@FXML
	private List<Label> labelListCourcePane9;
	
	@FXML
	private List<Label> labelListCourcePane10;
	
	@FXML
	private List<Button> buttonListCourceStudents;
	
	@FXML
	private List<Pane> PaneListCourceInfo;
	
	public void setCourcesInThisSemesterCourcesPane() { //DONE 
		hideThisSemesterCourcePanes();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM schedule");
			int i=0;			
			while (rs.next()) {
				if(i==0) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane1.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==1) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane2.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==2) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane3.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==3) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane4.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==4) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane5.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==5) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane6.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==6) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane7.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==7) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane8.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==8) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane9.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
				if(i==9) {
					PaneListCourceInfo.get(i).setVisible(true);
					for (int y=0; y<7; y++) {
						labelListCourcePane10.get(y).setText(rs.getNString(y+1));
					} i++; continue;
				}
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void hideThisSemesterCourcePanes() { //DONE 
		for (Pane pane : PaneListCourceInfo) {
			pane.setVisible(false); 
		}
	}

    public void setMyProfileInfo() {
    	try {
    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
    		ResultSet rs = conn.createStatement().executeQuery("select * from staff where email = '"+AdminEmail+"'");
    		while (rs.next()) {
    			studentUserNameLabel_1.setText(rs.getString(2));
    			studentUserNameLabel_2.setText(rs.getString(2));
    			studentNameEnLabel.setText(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
    			studentGenderLabel.setText(rs.getString(10));
    			studentEmailLabel.setText(rs.getString(1));
    			studentEmailLabel1.setText(rs.getString(6));
    		}
    		conn.close();
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    
    @FXML
    void showJasperChart(ActionEvent event) { //DONE 
    	resetTableCOURCE_STU_NUM();
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			//show the report..
			JasperReport jr = JasperCompileManager.compileReport("chart.jrxml");
			JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
			JasperViewer.viewReport(jp); 
			
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
    public void resetTableCOURCE_STU_NUM() { //DONE 
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
			conn.createStatement().execute("delete from COURCE_STU_NUM where s_num>-1");
			ResultSet rsCourceNames = conn.createStatement().executeQuery("select DISTINCT cource_name from cource");
			while (rsCourceNames.next()) {
				ResultSet rsStudents = conn.createStatement().executeQuery("select * from cource, student_cources\r\n" + 
						"where student_cources.s_cource_id = cource.cource_id and cource_name='"+rsCourceNames.getString("cource_name")+"'");
				int countStudent=0;
				while (rsStudents.next()) {
					countStudent++;
				}
				conn.createStatement().execute("insert into COURCE_STU_NUM values ('"+rsCourceNames.getString("cource_name")+"', "+countStudent+")");				
			}
			
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
