/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 */

public class CheckIfNandItsDoubleExists {
        public static void main(String[] arr) {
            boolean flag=false;
            int a[]={0,0};
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    if(a[i]==2*a[j] && i!=j){
                        flag=true;
                        break;
                    }
                }
            }
            System.out.println(flag);
        }
    }

