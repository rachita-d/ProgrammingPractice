public class ReplaceElementWithGreatestElementOnRight {
    public static void main(String[] args) {

        int arr[]={17,18,5,4,6,1};
        int greatest = -1;
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = greatest;
            greatest = Math.max(temp,greatest);
        }
        for (int i:arr)System.out.print(i+",");
    }
}
