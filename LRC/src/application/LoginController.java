package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	 	@FXML
	    private TextField UserNameTextField;

	    @FXML
	    private PasswordField passwordField;

	    @FXML
	    private Button LoginButton;

	    @FXML
	    void showMyProfileWindow(ActionEvent event) {
	    	String user = UserNameTextField.getText();
	    	String pass = passwordField.getText();
	    	boolean in = false;
	    	try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##ruwaa", "0000");
				ResultSet rs = conn.createStatement().executeQuery("select * from student");
				while (rs.next()) {
					if(rs.getString(1).equals(user)) {
						if(rs.getString(10).equals(pass)) {
							in = true;
							StudentController.setEmail(user);
							//for switching scenes
				    		Parent tableViewParent = FXMLLoader.load(getClass().getResource("Student.fxml"));
				    	    Scene tableViewScene = new Scene(tableViewParent);

				    	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

				    	    window.setScene(tableViewScene);
				    	    window.show();
						}
						else {
							JOptionPane.showMessageDialog(null, "Your Email or Password is Incorrect.", "Ooops", JOptionPane.ERROR_MESSAGE);
						}
						break;
					}
				}
				if(!in) {
					rs = conn.createStatement().executeQuery("select * from staff, admin where staff.email=admin.email");
					while (rs.next()) {
						if(rs.getString(1).equals(user)) {
							if(rs.getString(11).equals(pass)) {
								in = true;
								AdminController.setEmail(user);
								//for switching scenes
					    		Parent tableViewParent = FXMLLoader.load(getClass().getResource("Admin.fxml"));
					    	    Scene tableViewScene = new Scene(tableViewParent);

					    	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

					    	    window.setScene(tableViewScene);
					    	    window.show();
							}
							else {
								JOptionPane.showMessageDialog(null, "Your Email or Password is Incorrect.", "Ooops", JOptionPane.ERROR_MESSAGE);
							}
							break;
						}
					}
				}
				if(!in) {
					rs = conn.createStatement().executeQuery("select * from staff, teacher where staff.email=teacher.email");
					while (rs.next()) {
						if(rs.getString(1).equals(user)) {
							if(rs.getString(11).equals(pass)) {
								in = true;
								TeacherController.setEmail(user);
								//for switching scenes
					    		Parent tableViewParent = FXMLLoader.load(getClass().getResource("Teacher.fxml"));
					    	    Scene tableViewScene = new Scene(tableViewParent);

					    	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

					    	    window.setScene(tableViewScene);
					    	    window.show();
							}
							else {
								JOptionPane.showMessageDialog(null, "Your Email or Password is Incorrect.", "Ooops", JOptionPane.ERROR_MESSAGE);
							}
							break;
						}
					}
				}
				if(!in)								
					JOptionPane.showMessageDialog(null, "Your Email or Password is Incorrect.", "Ooops", JOptionPane.ERROR_MESSAGE);

				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

}
