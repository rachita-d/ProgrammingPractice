
/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

    public static void main(String args[]){
        int num[]={0,1,2,2,3,0,4,2};
        int val=3;
        int pos=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]!=val)
            {
                num[pos]=num[i];
                pos++;
            }
        }
        System.out.println(pos);
    }
}
