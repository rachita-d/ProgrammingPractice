/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String args[]){
        int num[]={0,0,1,1,1,2,2,3,3,4};
        int pos=0;
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]!=num[i+1])
            {
                num[pos]=num[i];
                pos++;
            }
        }
        System.out.println(pos+1);
    }
}
