/**
 * @author Ricardo Hernandez
 * 
 * [PLACEHOLDER] Represents a course inside of a database
 */
public class CourseDBElement implements Comparable {
	private String id;
	private int crn;
	private int credits;
	private String roomNum;
	private String instructor;
	
	public CourseDBElement() {
		id = "";
		crn = -1;
		credits = -1;
		roomNum = "";
		instructor = "";
	}
	
	public CourseDBElement(String id, int crn, int credits, String roomNum, String instructor) {
		this.id = id;
		this.crn = crn;
		this.credits = credits;
		this.roomNum = roomNum;
		this.instructor = instructor;
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public int getCRN() {
		return crn;
	}
	public void setCRN(int crn) {
		this.crn = crn;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getRoomNum() {
		// TODO Auto-generated method stub
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
}
