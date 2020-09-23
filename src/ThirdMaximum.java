public class ThirdMaximum {
    public static void main(String args[]){
        int nums[]={1,1,2};

        ThirdMaximum maximum=new ThirdMaximum();
        System.out.println(maximum.thirdMax(nums));

    }
    public int thirdMax(int[] nums) {
        if(nums.length==1) return nums[0];
        int firstMax=Integer.MIN_VALUE,secondMax= Integer.MIN_VALUE,thirdMax= Integer.MIN_VALUE;
        boolean hasIntMin=false;
        for(int num:nums){
            if(num==Integer.MIN_VALUE) hasIntMin=true;
            if(num>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }else if(num!=firstMax && num>secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }else if(num!=firstMax && num!=secondMax && num>thirdMax){
                thirdMax = num;
            }
            //System.out.println(firstMax+" "+secondMax+" "+thirdMax);
        }
        //If the whole array contains Integer.MIN_VALUE we have to return MIN
        if(firstMax==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        //If the second max wasn't updated, that means the array is of the form [num,num,...num,INTMIN] in which case we have to return the firstMax.
        if(secondMax==Integer.MIN_VALUE) return firstMax;
        //If thirdMax==MIN, it becomes tricky as the array can be either of the form [num1,num2,INTMIN] or [num1,num2]. So we use a boolean variable to track if MIN is actually an element in the array.
        if(thirdMax==Integer.MIN_VALUE) return hasIntMin?Integer.MIN_VALUE:firstMax;
        return thirdMax;
    }
}
