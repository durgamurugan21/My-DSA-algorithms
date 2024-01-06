class School
{
	String schoolname="xyz";
	String location="chennai";
}
class Teacher extends School
{
	public String teachername="sdfsdf";
	public String subject;
	public void addTeacher(String teachername,String subject)
	{
	this.teachername=teachername;
	this.subject=subject;
	System.out.println("************Teacher Details*********************");
	System.out.println("schoolname : "+schoolname);
	System.out.println("location : "+location);
	System.out.println("Teacher name " +teachername);
	System.out.println("subject " +subject);
	}
}
class Student extends Teacher
{
	public void addStudent(String studentname,int stdclass)
	{	
	System.out.println("*************Student Details********************");
	System.out.println("schoolname : "+schoolname);
	System.out.println("location : "+location);
	System.out.println("Teacher name : " +super.teachername);
	System.out.println("subject : " +super.subject);
	System.out.println("Student name : " +studentname);
	System.out.println("Student class : " +stdclass);
	}
}
class SchoolMangement
{
	public static void main(String args[])
	{ 
		School teacherobj=new Teacher();
		teacherobj.addTeacher("vel","maths");
		Student studentobj=new Student();
		studentobj.addStudent("mani",12);
	}
}