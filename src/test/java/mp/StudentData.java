package mp;

import java.util.LinkedList;

public class StudentData {
	
	private String name;
    private int SAISID;
    private int studentNumber;
    private String StudentAddress;
    
    LinkedList<StudentData> list= new LinkedList<StudentData>();
    
    public StudentData (String name, int SAISID, int studentNumber, String StudentAddress) {
        this.name = name;
        this.SAISID= SAISID;
        this.studentNumber = studentNumber;
        this.StudentAddress = StudentAddress;
    }
    
   
    
    public StudentData(){
        super();
    }
    
    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSAISID() {
		return SAISID;
	}



	public void setSAISID(int SAISID) {
		this.SAISID =SAISID;
	}



	public int getStudentNumber() {
		return studentNumber;
	}



	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}



	public String getStudentAddress() {
		return StudentAddress;
	}



	public void setStudentAddress(String studentAddress) {
		this.StudentAddress = studentAddress;
	}

}
