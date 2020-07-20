public class MaxConsectiveOnes {

    public int maxOnes(int[] num){

        int count=0;int result=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==0)
                count=0;
            else
            {
                count++;
                result=Math.max(result,count);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] num={1,1,1,0,0,0,1,1};
        MaxConsectiveOnes Ones=new MaxConsectiveOnes();
        System.out.println(Ones.maxOnes(num));

    }

}
