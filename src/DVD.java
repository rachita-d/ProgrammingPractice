public class DVD {

    public String name;
    public int year;
    public String director;

    public DVD(String name, String director, int year)
    {
        this.name=name;
        this.director=director;
        this.year=year;
    }


    public static void main(String args[])
    {
        DVD avengers=new DVD("The Avengers","Russo Brothers",2019);
        DVD[] dvdcollection=new DVD[15];
        dvdcollection[7]=avengers;
    }
}
