import java.util.Scanner;
public class test{
		
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
   		String str=scanner.nextLine();
     
		String[] result = str.split(" ");
		        
        int result0=Integer.parseInt(result[0]);
        int result1=Integer.parseInt(result[1]);
        int result2=Integer.parseInt(result[2]);
        int result3=Integer.parseInt(result[3]);
        
        boolean flag = false;
        int a = (result0 + result2) / 2;
        int b = 0;
        int c = 0;
        if(a / 1==a) {
            b = a - result0;
            if(result1 + result3 == b*2)
            {
                c = result3 - b;
                flag = true;
            }
        }
      
        if(flag==false) {
            System.out.print("No");
        }
        else {
            System.out.println(a+" "+b+" "+c);
        }   
    }
}