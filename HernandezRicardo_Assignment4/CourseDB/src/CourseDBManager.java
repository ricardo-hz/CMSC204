import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDBManager implements CourseDBManagerInterface {
	private CourseDBStructure cdbs = new CourseDBStructure(10);

	@Override
	public void add(String id, int crn, int credits, String roomNum, String instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseDBElement get(int crn) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	//Format: ("CMSC203 30504 4 SC450 Joey Bag-O-Donuts")
	public void readFile(File input) throws FileNotFoundException {
		try {
			Scanner scan = new Scanner(input);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		}
		catch (Exception e) {
			System.out.print("Should not have thrown an exception");
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<String> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
