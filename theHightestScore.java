import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		int M = 0;
		String s = "";
		int index = 0;
		int score = 0;
		
		while (scanner.hasNext()) {
			N = scanner.nextInt();
			M = scanner.nextInt();
			
			int[] stu = new int[N];
			
			for (int i = 0; i < N; i++) {
				stu[i] = scanner.nextInt();
			}
			
			for (int i = 0; scanner.hasNext() && i < M; i++) {
				s = scanner.next();
				index = scanner.nextInt();
				score = scanner.nextInt();
				
				if (s.equals("Q")) {
					int begin = Math.min(index, score);
					int end = Math.max(index, score);
					int max = stu[begin - 1];
					for (int j = begin; j < end; j++) {
						max = Math.max(max, stu[j]);
					}
					System.out.println(max);
				} else if (s.equals("U")){
					stu[index - 1] = score;
				}
			}
			
		}
		
	}
}
