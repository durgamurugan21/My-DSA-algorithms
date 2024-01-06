public class Prime100to200 {
    public static void main(String args[])
    {
     int low = 100, high = 200;
        while (low < high) {
            boolean flag =true;
            for(int i = 2; i <= low/2; ++i) { 
                // condition for nonprime number
                if(low % i == 0) {
                    flag = false;
                    break;
                }}
            if (flag)
                System.out.print(low + " ");
            ++low;
        }}}
