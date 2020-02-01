class pop{
    //冒泡排序
    public static void laobiao1pop(int[] a){

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if (a[j]>a[j+1])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static  void laobiao2(int [] a){

    }
    public static  void laobiao3(int [] a){

    }
}