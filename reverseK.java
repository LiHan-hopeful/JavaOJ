import java.util.Scanner;

//3.k个一组翻转链表哔哩哔哩2020校园招聘
public class Main {
public static void reverse(String[] vec, int start, int end) {
        while (start < end) {
            String tmp = vec[start];
            vec[start] = vec[end];
            vec[end] = tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String[] strArr = str.split(" ");
        int k;
        k = scanner.nextInt();
        int start;
        start = 0;
        //如果不够一组，就不进行翻转
        // 每k个元素进行翻转
        while (start + k - 1 < strArr.length - 1) {
            reverse(strArr, start, start + k - 1);
            //下一组的起始位置
            start = start + k;
        }
        for (int i = 0; i < strArr.length - 2; i++) {
            System.out.print(strArr[i] + "->");
        }
        System.out.println(strArr[strArr.length - 2]);
    }

}

