public class EuclidsAlgorithm {

    public static void main(String[] args){

    int m=3972,n=52,r;

    while(n>0)
    {
        r=m%n;
        if (r > 0) {
            m = n;
            n = r;
        }
        else{
            System.out.println("GCD is "+n);
            break;
        }
    }
    }
}
