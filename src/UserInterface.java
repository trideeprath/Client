import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class UserInterface extends JFrame{
	private JTextField textField_id;
	private JTextField textField_name;
	private JTextField textField_exam;
	private JTextField textField_feedback;
	private JTextField textField_grade;
	private JTextField textField_percentage;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblName;
	private JLabel lblExam;
	private JLabel lblFeedback;
	private JLabel lblGrade;
	private JLabel lblPercentage;
	private JRadioButton rdbtnGetAllStudent;
	private JRadioButton rdbtnGetStudent;
	private JRadioButton rdbtnAddStudent;
	private JRadioButton rdbtnEnterMarks;
	private JRadioButton rdbtnDeleteMarks;
	private JRadioButton rdbtnAddExam;
	private JRadioButton rdbtnDeleteExam;
	private JTextField textField_code;
	private JButton btnSubmit;
	public JTextArea textArea;
	ArrayList<JTextField> textFieldArray = new ArrayList<JTextField>();
	
	public UserInterface() {

		super("GradeBook Client");
		getContentPane().setLayout(null);
		
		textField_id = new JTextField();
		textField_id.setBounds(279, 13, 116, 22);
		getContentPane().add(textField_id);
		textField_id.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setBounds(279, 48, 116, 22);
		getContentPane().add(textField_name);
		textField_name.setColumns(10);
		
		textField_exam = new JTextField();
		textField_exam.setBounds(279, 83, 116, 22);
		getContentPane().add(textField_exam);
		textField_exam.setColumns(10);
		
		textField_feedback = new JTextField();
		textField_feedback.setBounds(279, 118, 116, 22);
		getContentPane().add(textField_feedback);
		textField_feedback.setColumns(10);
		
		textField_grade = new JTextField();
		textField_grade.setBounds(279, 153, 116, 22);
		getContentPane().add(textField_grade);
		textField_grade.setColumns(10);
		
		textField_percentage = new JTextField();
		textField_percentage.setBounds(279, 189, 116, 22);
		getContentPane().add(textField_percentage);
		textField_percentage.setColumns(10);
		
		rdbtnGetAllStudent = new JRadioButton("Get All Student");
		buttonGroup.add(rdbtnGetAllStudent);
		rdbtnGetAllStudent.setBounds(8, 12, 127, 25);
		getContentPane().add(rdbtnGetAllStudent);
		
		rdbtnGetStudent = new JRadioButton("Get One Student");
		buttonGroup.add(rdbtnGetStudent);
		rdbtnGetStudent.setBounds(8, 42, 127, 25);
		getContentPane().add(rdbtnGetStudent);
		getContentPane().setLayout(null);
		
		JLabel lblSid = new JLabel("S_ID");
		lblSid.setBounds(211, 13, 56, 22);
		getContentPane().add(lblSid);
		
		lblName = new JLabel("Name");
		lblName.setBounds(211, 48, 56, 22);
		getContentPane().add(lblName);
		
		lblExam = new JLabel("Exam");
		lblExam.setBounds(211, 83, 56, 22);
		getContentPane().add(lblExam);
		
		lblFeedback = new JLabel("Feedback");
		lblFeedback.setBounds(211, 118, 56, 22);
		getContentPane().add(lblFeedback);
		
		lblGrade = new JLabel("Grade");
		lblGrade.setBounds(211, 153, 56, 22);
		getContentPane().add(lblGrade);
		
		lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(195, 189, 72, 22);
		getContentPane().add(lblPercentage);
		
		rdbtnAddStudent = new JRadioButton("Add Student");
		buttonGroup.add(rdbtnAddStudent);
		rdbtnAddStudent.setBounds(8, 72, 127, 25);
		getContentPane().add(rdbtnAddStudent);
		
		rdbtnEnterMarks = new JRadioButton("Enter Marks");
		buttonGroup.add(rdbtnEnterMarks);
		rdbtnEnterMarks.setBounds(8, 102, 127, 25);
		getContentPane().add(rdbtnEnterMarks);
		
		rdbtnDeleteMarks = new JRadioButton("Delete Marks");
		buttonGroup.add(rdbtnDeleteMarks);
		rdbtnDeleteMarks.setBounds(8, 132, 127, 25);
		getContentPane().add(rdbtnDeleteMarks);
		
		rdbtnAddExam = new JRadioButton("Add Exam");
		buttonGroup.add(rdbtnAddExam);
		rdbtnAddExam.setBounds(8, 162, 127, 25);
		getContentPane().add(rdbtnAddExam);
		
		rdbtnDeleteExam = new JRadioButton("Delete Exam");
		buttonGroup.add(rdbtnDeleteExam);
		rdbtnDeleteExam.setBounds(8, 188, 127, 25);
		getContentPane().add(rdbtnDeleteExam);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(8, 228, 97, 25);
		getContentPane().add(btnSubmit);
		
		textField_code = new JTextField();
		textField_code.setBounds(342, 239, 116, 22);
		getContentPane().add(textField_code);
		textField_code.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(8, 266, 450, 157);
		getContentPane().add(textArea);
		
		Handler handler = new Handler();
		btnSubmit.addActionListener(handler);
		
		rdbtnGetAllStudent.addActionListener(handler);
		rdbtnGetStudent.addActionListener(handler);
		rdbtnAddStudent.addActionListener(handler); 
		rdbtnEnterMarks.addActionListener(handler);
		rdbtnDeleteMarks.addActionListener(handler);
		rdbtnAddExam.addActionListener(handler); 
		rdbtnDeleteExam.addActionListener(handler);
		
		
		buttonGroup.setSelected(rdbtnGetAllStudent.getModel(), true);
		setTextArrayList();
	
	}
	
	private void setTextArrayList() {
		// TODO Auto-generated method stub
		textFieldArray.add(textField_id);
		textFieldArray.add(textField_name);
		textFieldArray.add(textField_exam);
		textFieldArray.add(textField_feedback);
		textFieldArray.add(textField_grade);
		textFieldArray.add(textField_percentage);
		
	}

	private class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if((e.getSource() == rdbtnGetAllStudent )||
					(e.getSource() == rdbtnGetStudent ) || (e.getSource() == rdbtnAddStudent ) || 
					(e.getSource() == rdbtnEnterMarks ) || (e.getSource() == rdbtnDeleteMarks ) ||
					(e.getSource() == rdbtnAddExam ) || (e.getSource() == rdbtnDeleteExam )){
					
				SetTextFields(e.getSource());
				System.out.println("RDN Button Pressed");
					
			}
			
		
			
			//Submit Button is selected
			if(e.getSource() == btnSubmit){
				ButtonModel selectedAction = buttonGroup.getSelection();
			   
				if(selectedAction.equals(rdbtnGetAllStudent.getModel())){
					System.out.println("Get All Students");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.getAllStudents();
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if(selectedAction.equals(rdbtnGetStudent.getModel())){
					System.out.println("Get One Student");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.getStudent(textField_id.getText());
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						textArea.setText("");
						textField_code.setText("400");
						e1.printStackTrace();
					}
				}
				if(selectedAction.equals(rdbtnAddStudent.getModel())){
					System.out.println("Add Student");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.addStudent(textField_id.getText(),textField_name.getText());
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						textArea.setText("");
						textField_code.setText("400");
						e1.printStackTrace();
					}
				}
				if(selectedAction.equals(rdbtnEnterMarks.getModel())){
					System.out.println("Enter Marks");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.enterMarks(textField_id.getText(),textField_exam.getText(), 
								textField_feedback.getText(), textField_grade.getText());
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						textArea.setText("");
						textField_code.setText("400");
						e1.printStackTrace();
					}
					
				}
				if(selectedAction.equals(rdbtnDeleteMarks.getModel())){
					System.out.println("Delete Marks");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.deleteMarks(textField_id.getText(),textField_exam.getText());
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						textArea.setText("");
						textField_code.setText("400");
						e1.printStackTrace();
					}
					
				}
				if(selectedAction.equals(rdbtnAddExam.getModel())){
					System.out.println("Add Exam");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.addExam(textField_exam.getText(),textField_percentage.getText());
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						textArea.setText("");
						textField_code.setText("400");
						e1.printStackTrace();
					}
				}
				if(selectedAction.equals(rdbtnDeleteExam.getModel())){
					System.out.println("Delete Exam");
					System.out.println("Add Exam");
					HttpCalls httpCalls = new HttpCalls();
					try {
						Response response = httpCalls.deleteExam(textField_exam.getText());
						textArea.setText("");
						textArea.append(response.getResponse());
						textField_code.setText(String.valueOf(response.getCode()));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						textArea.setText("");
						textField_code.setText("400");
						e1.printStackTrace();
					}
					
				}
			}
			
		}

		private void SetTextFields(Object source) {
			// TODO Auto-generated method stub
			if(source == rdbtnGetAllStudent){
				enableAllTextFields();
				disableTextFields(0,1,2,3,4,5);
			}
			if(source == rdbtnGetStudent){
				enableAllTextFields();
				disableTextFields(1,2,3,4,5);
			}
			if(source == rdbtnAddStudent){
				enableAllTextFields();
				disableTextFields(2,3,4,5);
			}
			if(source == rdbtnEnterMarks){
				enableAllTextFields();
				disableTextFields(1,5);
			}
			if(source == rdbtnDeleteMarks){
				enableAllTextFields();
				disableTextFields(1,3,4,5);
			}
			if(source == rdbtnAddExam){
				enableAllTextFields();
				disableTextFields(0,1,3,4);
			}
			if(source == rdbtnDeleteExam){
				enableAllTextFields();
				disableTextFields(0,1,3,4,5);
			}
			
			
		}

		private void disableTextFields(int... args) {
			// TODO Auto-generated method stub
			for(int index :args)
				textFieldArray.get(index).setEnabled(false);
			
		}

		private void enableAllTextFields() {
			// TODO Auto-generated method stub
			for(JTextField text : textFieldArray){
				text.setEnabled(true);
			}
			
		}
		
	}
	
	
}
