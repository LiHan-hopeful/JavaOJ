public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
   }
public static void selectSort(int[] arr){
        //i: 未排序数据的起始位置
        for(int i = 0; i < arr.length; ++i)
       {
            int minIdx = i;
            //从所有未排序的数据中找最小值的索引
            for(int j = i + 1; j < arr.length; ++j){
                if(arr[j] < arr[minIdx])
                    minIdx = j;
           }
            swap(arr, minIdx, i);
       }
   }

