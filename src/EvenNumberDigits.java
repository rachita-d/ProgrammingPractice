public class EvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count=0,evenNum=0,digits=0;
    for(int i=0;i<nums.length;i++)
    {
        digits=nums[i];
        while(digits>0)
        {
            digits=digits/10;
            count++;
        }
        if(count%2==0)
            evenNum++;
        else
            count=0;
    }
    return evenNum;
    }

    public static void main(String[] args)
    {
        int[] nums = {437,315,322,431,686,264,442};
        EvenNumberDigits obj=new EvenNumberDigits();
        System.out.println("Output:"+obj.findNumbers(nums));
    }
}
