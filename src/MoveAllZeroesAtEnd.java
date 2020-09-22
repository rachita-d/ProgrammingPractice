
/*
Given a number in an array form. Write a program to move all zeros to the end.
 */
public class MoveAllZeroesAtEnd {

    public static void main(String args[]){
        int a[]={7,0,0,3,0,4,0};
        int pos=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]!=0)
            {
                a[pos]=a[i];
                pos++;
            }
        }
        for(;pos<a.length;pos++)
            a[pos]=0;

        for (int i:a)System.out.print(i+",");
    }
}
