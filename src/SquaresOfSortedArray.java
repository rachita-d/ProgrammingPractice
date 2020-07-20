

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
    int square,temp;
    int[] resultArray=A;

        for (int i=0;i<A.length;i++){
           square=A[i]*A[i];
           resultArray[i]=square;
        }
        for(int i=0;i<resultArray.length;i++)
        {
            for(int j=0;j<resultArray.length-1;j++)
            {
                if(resultArray[j]>resultArray[j+1])
                {
                    temp=resultArray[j];
                    resultArray[j]=resultArray[j+1];
                    resultArray[j+1]=temp;
                }
            }
        }
        return resultArray;
    }

    public static void main(String[] args)
    {
        SquaresOfSortedArray obj=new SquaresOfSortedArray();
        int[] nums={-7,-3,2,3,11};
        int[] sortedArray=obj.sortedSquares(nums);
        System.out.print("[");
        for (int a:sortedArray)
            System.out.print(a+",");
        System.out.print("]");
    }
}
