/**
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 */
public class ValidMountainArray {
    public static void main(String[] arr) {

        int a[]={0,1,2,3,4,5,6,7,8,9};
        ValidMountainArray v=new ValidMountainArray();

        System.out.println(v.isValid(a));
    }


    public boolean isValid(int A[]){
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;}
}
