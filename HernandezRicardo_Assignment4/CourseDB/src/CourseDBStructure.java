import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CourseDBStructure implements CourseDBStructureInterface {
	private LinkedList<CourseDBElement>[] hashTable;
	
	/**
	 * The add method of CourseDBStructure will take a CourseDBElement object and 
	 * add it to the data structure based on the calculated hashcode
	 */
	@Override
	public void add(CourseDBElement element) {
		
	}
	
	/**
	 * 
	 * @param n Estimated number of courses
	 */
	public CourseDBStructure(int n) {
		hashTable = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			hashTable[i] = new LinkedList<CourseDBElement>();
		}
	}
	
	public CourseDBStructure(String str, int hashtableSize) {
		new CourseDBStructure(hashtableSize);
	}
	
	@Override
	public CourseDBElement get(int crn) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTableSize() {
		return hashTable.length;
	}

}
