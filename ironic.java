import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String array[] = str.split(" ");
        for(int i = 0;i < array.length;i++){
                System.out.print(array[array.length-1-i]+" ");
        }
    }
}