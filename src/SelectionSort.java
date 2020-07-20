public class SelectionSort {

    public static void main (String args[]){

        int a[]={10,1,4,6,2,7};
        int temp,minIndex;
        for(int i=0;i<a.length-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<a.length;j++)
                if(a[j]<a[minIndex])
                    minIndex=j;

            temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
        for (int ar:a)
            System.out.println(ar);

    }
}
