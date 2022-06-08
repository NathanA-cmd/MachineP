package mp;

public class StudentList {
	
	private Node head, tail;
	
	public StudentList() {
		this.head= this.tail=null;
	}
	 
	public boolean isEmpty() {
		return this.head==null;
	}
	
	
	public void addNewStudent(StudentData newStudent) {
		if(isEmpty()) {
			this.head= this.tail= new Node(newStudent);
			return;
		}
		Node newNode= new Node(newStudent);
		this.tail.setNext(newNode);
		this.tail= newNode;
	}
	
	public void showListOfStudents() {
		Node selectedNode=this.head;
		while(selectedNode != null) {
			System.out.println(selectedNode.getStudent().getName() + "-" +
					selectedNode.getStudent().getSAISID() + "-" +
					selectedNode.getStudent().getStudentNumber() + "-"+selectedNode.getStudent().getStudentAddress() + "-");
					selectedNode = selectedNode.getNext();
		}	
	}
	
	public void addManyStudents(StudentData...listofStudents) {
		for(StudentData newStudent: listofStudents) {
			addNewStudent(newStudent);
		}
	}
}
