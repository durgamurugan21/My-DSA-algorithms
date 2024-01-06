public class Methodoverloading {
    public static void main(String[] args) 
    {
        Overloadingclass  over = new Overloadingclass ();
        over.display("Durga");
        over.display(20);    
        over.display('f');    
    }}
 class Overloadingclass
{
  void display(String name)
  {
System.out.println("Name : " +name);
  }
 void display(int age)         
  {
System.out.println("Age : " +age);
  }   
 void display(char gen)         
  {
System.out.println("Gender : " +gen);
  } 
}
