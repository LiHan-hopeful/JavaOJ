import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] res = new int[n][2];
            for (int i = 0; i < n; i++) {
                res[i][0] = scanner.nextInt();
                res[i][1] = scanner.nextInt();
            }
            helper(res);
        }
    }


    private static void helper(int[][] res) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            if (res[i][0] == 1) {
                list.add(res[i][1]);
            } else {
                list.remove(new Integer(res[i][1]));
            }
            if (helper2(list)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }



    public static boolean helper2(ArrayList<Integer> list) {
        int len = list.size();
        if (len < 3) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            int temp = list.remove(i);
            int sum = 0;
            for (int j = 0; j < len - 1; j++) {
                sum += list.get(j);
            }
            if (sum <= temp) {
                list.add(i, temp);
                return false;
            }
            list.add(i, temp);
        }
        return true;
    }
}