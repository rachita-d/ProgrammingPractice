public class BinarySearch {

    public static void main(String args[]){

        int a[]={3,7,20,32,45,60,75};
        int n=a.length-1;
        int key=32,med=0,i=0;
        while (n>0)
        {
            med=(i+n)/2;
            if(a[med]==key)
                break;
            else if(a[med]<key)
                i=med;
            else
                n=med;
        }

        System.out.println("Index of key is:"+med);
    }
}
