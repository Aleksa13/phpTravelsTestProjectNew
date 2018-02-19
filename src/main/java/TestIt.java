/**
 * Created by aleksandra on 2/19/18.
 */
class ChangeIt
{
    static void doIt( int[] z )
    {
        z = null;
//    {
//        int[] A = z ;
//        A[0] = 99;
    }
}

public class TestIt
{
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};

        ChangeIt.doIt( myArray );

        for (int j=0; j<myArray.length; j++ )
            System.out.print( myArray[j] + " " ) ;
    }
}