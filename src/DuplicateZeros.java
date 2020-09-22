/*
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *Note that elements beyond the length of the original array are not written.
 */
public class DuplicateZeros {
    public static void main(String args[])
    {
        int[] a={1,0,2,3,0,4,5,0};
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
            {
                for(int j=a.length-2;j>=i;j--)
                {
                    a[j+1]=a[j];
                }
                i++;
            }
        }
        for (int i:a)System.out.print(i+",");
    }
}
