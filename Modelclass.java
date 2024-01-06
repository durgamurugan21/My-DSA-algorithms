import java.util.*;
class Containerclass //student data's
 {
	 public String studentname;
	 public int totalmark;
	 public int mark[];
	 Containerclass(String studentname,int mark[],int totalmark)
	 {
		this.studentname=studentname;
		this.mark=mark; 
		this.totalmark=totalmark;
	}
}
 class Managerclass //get input from user and pass the datas to container class
 {	
	public int noofstudents;
	public String subject[];
	public int totalmark;
	public String studentname;
	Containerclass[] obj;
	Scanner sc=new Scanner(System.in);
		public void getdetails()
		{
			// get no of student
			System.out.println("Enter the number of students");
			noofstudents=sc.nextInt();
			obj=new Containerclass[noofstudents];
			
			//get no of subjects
			System.out.println("Enter the number of subject");
			int size=sc.nextInt();
			subject=new String[size];
			
			//list of subjects
			System.out.println("Enter the Subjects");
			for(int i=0;i<size;i++)
			{
				subject[i]=sc.next();
			}
			
			//student datas like name,mark,etc
			for(int x=0;x<noofstudents;x++)
			{
			System.out.println("Student name : ");
			studentname=sc.next(); 
			int mark[]=new int[size];
			System.out.println("Enter Student mark list");
				for(int i=0;i<size;i++)
				{
					System.out.println(subject[i] +":");
					mark[i]=sc.nextInt();
				}
			//totalmark calculation
				totalmark=0;		
				for(int j=0;j<size;j++)
				{
					totalmark=totalmark+mark[j];
				}
				
			//passing parameter to constructor
				obj[x]=new Containerclass(studentname,mark,totalmark);
			}
					
		}
		public void display()
		{
			//1.Print out all Subject.
			System.out.println("***...Print out all Subject....***");
				for(int i = 0; i<subject.length; i++){
				System.out.print(subject[i] +" ");
				}
			System.out.println();
			
			//2. Print out all Student Names.
			System.out.println("***...Print out all Student Names....***");
				for(int i = 0; i<noofstudents; i++)
				{
					System.out.println(obj[i].studentname+" ");	
					//System.out.println(obj[i].mark+" ");	
				}
				
			//3. Top 5 Students- make array descending
				for(int i=0;i<obj.length-1;i++)
				{
					for(int j=i+1; j<obj.length;j++)
					{
						if(obj[i].totalmark < obj[j].totalmark)
						{
							int temp = obj[i].totalmark;
							obj[i].totalmark = obj[j].totalmark;
							obj[j].totalmark= temp;
							String tempp=obj[i].studentname;
							obj[i].studentname=obj[j].studentname;
							obj[j].studentname=tempp;
							int temparr[]=obj[i].mark;
							obj[i].mark=obj[j].mark;
							obj[j].mark=temparr; 
						}
						
					}
				}
		  System.out.println("Enter the number to print top student");
			int top=sc.nextInt();
			if( 0<top && top<=noofstudents )
			{
				System.out.println("***...Top 3 Students....***");
				for(int i=0;i<top;i++)
				{
					System.out.println(obj[i].studentname + "  "+ obj[i].totalmark);
				}
			}
			else{
				System.out.println("plz enter the valid number");}
				
		//4. Passed Students //5. Failed Students	
		
		String passarray[]=new String[noofstudents];
		String failarray[]=new String[noofstudents];
		int k=0,l=0;
			for(int i=0;i<noofstudents;i++)
			{	int count=0;
				for(int j=0;j<subject.length;j++)
				{   
					if(obj[i].mark[j] >34)
					{
						count++;
					}
				}
				
				if(count==subject.length)
				{
					passarray[k]=obj[i].studentname;
					k++;
				}
				else if(count!=subject.length){
					failarray[l]=obj[i].studentname;
					l++;
				}
			}
		System.out.println("***...Passed Students....***");
		for(int i=0;i<k;i++)
		{
			System.out.println(passarray[i]);
		}
		System.out.println("***...Failed Students....***");
		for(int i=0;i<l;i++)
		{
			System.out.println(failarray[i]);
		}

		
//6. List out all subjects with highest mark.
		System.out.println("***...List of all subjects with highest mark....***");
			int high;
			String name="";
				for(int i=0;i<subject.length;i++)
				{
					high=0;
					for(int j=0;j<noofstudents;j++)
					{
						if(obj[j].mark[i]>high)
						{
							high=obj[j].mark[i];
							name=obj[j].studentname;
						}
					}
					System.out.println(subject[i]+" "+high+" "+name);		
				}		
			}
		 }
 class Modelclass  //main class to call others
 {
	 public static void main(String args[])
		 {
			Managerclass obj1=new Managerclass();
			obj1.getdetails();
			obj1.display();
		 }
 }
	
	
	
	
	/*
	//System.out.println(count);
	System.out.println("datas");
		for(int i=0;i<noofstudents;i++)
		{
			System.out.println(obj[i].studentname+" ");
			for(int j=0;j<size;j++)
			{
			System.out.print(obj[i].mark[j]+" ");
			}
		}
/*System.out.println("After swap");
		for(int i=0;i<noofstudents;i++)
		{
			System.out.println(obj[i].studentname+" ");
			for(int j=0;j<subject.length;j++)
			{
			System.out.print(obj[i].mark[j]+" ");
			}
		}*/		
