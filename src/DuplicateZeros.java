public class DuplicateZeros {
    public void noOfZeroes(int[] a) {

        for (int i=0;i<a.length;i++)
        {
            if (a[i]==0)
            {
                for (int j=a.length-2;j>=i;j--)
                {
                    a[j+1]=a[j];
                }
                i++;
            }
        }
        for (int ab:a)
            System.out.print(ab+",");
    }

    public static void main(String[] args)
    {
        int[] a={1,0,2,3,0,4,5,0};
        DuplicateZeros obj=new DuplicateZeros();
        obj.noOfZeroes(a);

    }
}
