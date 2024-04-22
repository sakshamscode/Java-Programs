
import java.util.Scanner;
class Binary{
    public static void StringToASCII(String s)
    {
       for(int i=0;i<s.length();i++)
       {
           int pw = 1;
           int rem = 0;
           int binary = 0;
           char ch = s.charAt(i);
           int n = (int)ch;

           if(n==32){
               System.out.print("    ");
               continue;
           }
           else {
               for (int j = 0; n > 0; j++) {
                   rem = n % 2;
                   binary = (binary + rem * pw);
                   pw = pw * 10;
                   n = n / 2;
               }
           }
           System.out.print(binary+" ");
       }
    }
}

public class StringToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : " );
        String str = sc.nextLine();

        Binary.StringToASCII(str);
    }
}
