import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("dd.txt");
            outputStream = new FileWriter("output.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}




/*class CharReader

{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		System.out.println("Enter the source file to read:");
		Scanner sc=new Scanner(System.in);
		String read=sc.next();
		System.out.println("Enter the destination file to write:");
		String write=sc.next();
		
		FileReader  objref=new FileReader(read);
		FileWriter obref=new FileWriter(write);
		int data; 
		while((data=objref.read())!=-1)
		{
		obref.write(data); 
		System.out.print((char)data);
		}
		objref.close();
	
		
		obref.close(); 
	}

}*/