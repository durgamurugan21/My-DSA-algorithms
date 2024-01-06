
import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class AddStringArray {

    public static void main (String args[])
    {
    
    String input="123 45";
    int sum=Arrays.Stream(input.trim().split("\\st")).mapToInt(Integer::parseInt).sum();
    System.out.println(sum);
    }
}
