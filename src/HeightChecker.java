/*
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
 */

import java.util.Arrays;

public class HeightChecker {

    public static void main (String args[]){
        int heights[]={1,1,4,2,1,3};
        int targetArr[]=new int[heights.length];
        for(int k=0;k<heights.length;k++)
            targetArr[k]=heights[k];
        Arrays.sort(targetArr);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(targetArr[i]!=heights[i])
                count++;
        }
        System.out.println("");
        System.out.println(count);
    }
}
