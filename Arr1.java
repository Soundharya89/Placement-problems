public class Arr1 {
     public static int count(int[] a) {
        int cnt=0,max=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            { cnt++;
                if(cnt>max)
                    max=cnt;
            }
            else
             cnt=0;
        }
        return max;
    }
    public static void main(String[] args)
    {
        int a[]={1,0,1,1,0,1,0};
        System.out.println(count(a));
    }
}
