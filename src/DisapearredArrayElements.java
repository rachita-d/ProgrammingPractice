import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisapearredArrayElements {
    public static void main(String args[]){
        int nums[] ={4,3,2,7,8,2,3,1};
        DisapearredArrayElements obj=new DisapearredArrayElements();
        System.out.println(obj.findDisappearedNumbers(nums));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int val= Math.abs(nums[i])-1;
            if(nums[val]>0)
                nums[val]=-nums[val];
        }
        List<Integer> result=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0)
                result.add(j+1);
        }
        return result;
    }
}
