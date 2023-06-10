package Assignment4;

/*       Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, 
by id & name,
by email & phoneNumber
 * 
 */

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student id  "+ id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id  "+ id +"\n"+ "Student Name: "+name);
	}
	
	public void getStudentInfo(String email, long ph)
	{
		System.out.println("email:  "+ email+ "\n"+"HandPhone: "+ph);
	}
	
	public static void main(String[] args) {
		
		Students s1=new Students();
		
		s1.getStudentInfo(21," ShakthiPriya");
		s1.getStudentInfo("shakthi@yahoo.com", 987654321);
		s1.getStudentInfo(72);
	}

}
