public class NumberOfOccurances {

    public static void main(String args[]) {
        int a[] = {1, 1, 1, 1, 2, 4, 4, 5, 5};
        int ele = 2;
        int count=0;
        for (int i = 0; i <a.length;i++){
            if(a[i]==ele){
                count++;
            }
        }
        System.out.println(count);
    }
}