/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 You may return any answer array that satisfies this condition.
 **/
public class SortArrayByParity {
    public static void main (String args[]){

        int a[]={3,1,2,4};
        int i=0,j=a.length-1;

        while (i<j){

            if(a[i] % 2 > a[j] % 2)
            {
                int tem=a[i];
                a[i]=a[j];
                a[j]=tem;
            }
            if(a[i] % 2 == 0)i++;
            if(a[j] % 2 == 1)j--;

        }
        for (int arr:a)System.out.print(arr+",");
    }
}
