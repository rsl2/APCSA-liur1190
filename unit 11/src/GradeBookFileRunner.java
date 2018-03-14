//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCS\\APCSA-liur1190\\unit 11\\src\\gradebook.dat"));
		String className = file.nextLine();
		int classSize = file.nextInt();file.nextLine();
		Class test = new Class(className, classSize);
		for (int i = 0; i < classSize; i++)
		{
			String studentName = file.nextLine();
			String studentGrades = file.nextLine();
			test.addStudent(new Student(studentName, studentGrades));
		}
		out.println("\n\n" + test);
		test.sort();
		out.println("\n\n" + test);
		
		out.println("Failure List = " + test.getFailureList(70));
		out.println("Highest average = " + test.getStudentWithHighestAverage());
		out.println("Lowest average = " + test.getStudentWithLowestAverage());
		out.println("Class average = " + test.getClassAverage());
		
		String className2 = "AP Stats";
		int classSize2 = 3;
		Class test2 = new Class(className2, classSize2);
		Student a = new Student("Jen", "4 - 90.0 85.5 91.3 86.1");
		Student b = new Student("Praneeth", "4 - 65.3 70.8 52.4 67.8");
		Student c = new Student("Ash", "4 - 87.5 90.5 82.4 84.3");
		test2.addStudent(a);
		test2.addStudent(b);
		test2.addStudent(c);
		
		
		ArrayList<Class> one = new ArrayList<Class>();
		one.add(test);
		one.add(test2);
		out.println(one);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	













	}		
}