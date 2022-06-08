package mp;

public class Node {
	
	private  StudentData student;
	private Node next;
	
	public Node(StudentData student) {
		this.student=student;
		this.next=null;
	}

	public StudentData getStudent() {
		return student;
	}

	public void setDbd(StudentData student) {
		this.student = student;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
