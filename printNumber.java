import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String[]strings=string.split(" ");
        for(int i=0;i<strings.length;i++){
            int sum=0;
            for(int j=0;j<strings.length;j++){
                if(strings[i].equals(strings[j])){
                    sum++;
                }
            }
            int s=strings.length/2;
            if(sum>=s){
                System.out.println(strings[i]);
                break;
            }
        }
    }
}
