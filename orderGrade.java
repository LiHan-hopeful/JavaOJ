import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 
public class Test {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner=new Scanner(System.in);
		//循环输入数据
                while(scanner.hasNext())
                {
                    int num=scanner.nextInt();//学生人数
                    int flag=scanner.nextInt();//0代表降序；1代表升序
            
                //用List存储学生姓名和分数
                List<Student> stuList=new ArrayList<Student>();
                for(int i=0;i<num;i++)
                {
                    stuList.add(new Student(scanner.next(), scanner.nextInt()));
                }
 
                //降序(通过Comparator接口中的compare方法实现自定义排序，默认排序方式为升序排序)
                //比较器
                if(flag==0)
                {
            	    //使用Collections.sort()的两参构造方法
            	    Collections.sort(stuList,new Comparator<Student>()
            	    {
            		public int compare(Student o1,Student o2)
            		{
            			return o2.score-o1.score;
            		}
		    });
                }
                //升序
                else if(flag==1)
                {
            	    //使用默认的排序方式：升序
            	    //Student要继承Comparable接口，并覆写compareTo方法
            	    //使用Collections.sort()的一个参数的方法
            	    Collections.sort(stuList);
                }
            
                //循环输出
                for(int i=0;i<stuList.size();i++)
                {
                    System.out.println(stuList.get(i).name+" "+stuList.get(i).score);
                }
            }
	}
    }
 
class Student implements Comparable<Student>
{
    public String name;
    public int score;
    public Student(String name,int score)
    {
        this.name=name;
        this.score=score;
    }
    
    //覆写compareTo方法
	@Override
	public int compareTo(Student o) {
	    //当前对象的分数减去传入对象的分数-->升序排序
	    return this.score-o.score;
	}
}