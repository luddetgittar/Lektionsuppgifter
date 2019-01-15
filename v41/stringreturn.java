
import java.util.Scanner;
 
public class stringreturn
{
    public static void main(String[] args)
    {

        Scanner read = new Scanner(System.in);
        
        System.out.println("Vad vill du köra?");
        String input = read.nextLine();
        if (input.equals("lol")) {
        	lol();
        } else if (input.equals("reverse")){
            System.out.println("Enter string to reverse:");
        	 String str = read.nextLine();
             String backwards = reverse(str);
             System.out.println("Din text baklänges är: " + backwards);
            
        }
        
        
        lol();
    }
    
    public static void lol() {
    	System.out.println("hahahahaha");
    }
    
    public static String reverse(String text) {
    	StringBuilder sb = new StringBuilder();
        
        for(int i = text.length() - 1; i >= 0; i--)
        {
            sb.append(text.charAt(i));
        }
        
        return sb.toString();
    }
}

