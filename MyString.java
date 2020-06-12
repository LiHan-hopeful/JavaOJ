public class MyString {
    public static boolean isEqueals(String str1 , String str2){
        char[] arr1 = str1.toCharArray();//将字符串转为字符数组
        char[] arr2 = str2.toCharArray();
        //字符串长度相等时，进入循环，比较对应字符是否相等
        while(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length;i++){
                //在循环内的对应字符有不相等的直接返回false
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            //长度相等时，对应字符没有不同的，则说明字符串是相等的，返回true
            return true;
        }
        //字符串长度不相等时，跳出循环，并返回false
        return  false;
    }

    public static int myCompareTo(String str1 , String str2){
        if(str1 == null || str2 == null){//参数校验
            return -100; //有一个字符串为空时，则返回错误码-100
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for(int i = 0; i < arr1.length && i <arr2.length;i++){

            if(arr1[i] < arr2[i]){
                return -1;
            } else if(arr1[i] > arr2[i]){
                return 1;
            }
            else return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        //String str1 = "HelloWorld";
        //String str2 = "HelloWorlds";
        String str1 = "HelloWorlds";
        String str2 = "helloWorlds";
        System.out.println(isEqueals(str1, str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(myCompareTo(str1, str2));
    }
}
