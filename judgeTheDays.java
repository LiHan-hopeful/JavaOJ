import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//2.一年中的第几天哔哩哔哩2020校园招聘

public class Main {
     public static int stringToInt(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            count = count * 10 + (s.charAt(i) - '0');
        }
        return count;
    }
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        //用一个数组保存一年中当当前月累加的天数
        int[] days = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
        List<String> vec = new ArrayList<>();
        String s1 = "";
        //按照"-"分割年月日
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '-')
            {
                vec.add(s1);
            //清空，保存下一部分
                s1 = "";
            }
            else{
                s1 += s.charAt(i);
            }
        }
        //保存天
        vec.add(s1);
        //转整形
        int year = stringToInt(vec.get(0));
        int month = stringToInt(vec.get(1));
        int day = stringToInt(vec.get(2));
        int ret = days[month - 1] + day;
//如果是闰年，并且包含2月，需要补一天
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2)
            ret++;
        System.out.println(ret);
    }

}