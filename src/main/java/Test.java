/**
 * Created by aleksandra on 2/6/18.
// */
//public class Test {
//   public static void main(String [] args) {
//        int j=0;
//        int i;
//        for ( i = 0; i < 5; ++i ) {  i< 5 the question
//            i = ++j;
//            }
//            System.out.println("i = " + i);
//            }
//
//}
//
//public class Foo {
//    static boolean condition;
//    public static void main(String [] args) {
//        int i = 0;
//        if((++i >= 1) || (condition == false))
//         i++;
//        if((i++ > 1) && (condition == true))
//            i++;
//        System.out.println(i);
//        }
//}
//
//
//public class IfTest{
//public static void main(String [] args) {
//        boolean b1 = true;
//        boolean b2 = false;
//        int i = 10;
//        if((b1 == true) && (b2 = true)) i++;
//        if((b2 == false) && ( i++ == 12))
//        {
//             i++;
//            }
//        if((b2 == true) || ( i++ == 11))
//        {
//             i++;
//              }
//             System.out.println("i = " + i);
//         }
//}

//class IfTest2 {
//    public static void main(String[] args) {
//        boolean b1 = true;
//        boolean b2 = false;
//        int i = 10;
//        if((b1 == true) && (b2 == true)) { i++;  }
//
//
//         else
//             {i --;}
//
//         System.out.println("i = " + i);
//        }
//	}
//
//
//        int output = 10;
//        boolean b1 = false;
//        if ((b1 == true) && ((output += 10) == 20)) {
//            System.out.println("We are equal " + output);
//        } else {
//            System.out.println("Not equal! " + output);
//        }
//    }
//}

//
//public class MyOutput {
//public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        int z = 30;
//        System.out.println(x + y + z);
//        System.out.println(" " + x + y + z);
//        System.out.println(x + " " + y+z);
//       System.out.println(x+y + " " +z);
//    System.out.println(x + y+z + " ");
//        }
//}
//
//10 20 30 60
//"102030" -
//"10 2030"
//30 ""


//
//class Foozit{
//    public static void main(String[] args) {
//        int  x = 0;
//        int y = 0;
//
//        for ( int z = 0; z < 5; z++) {
//            if ((++x > 2) || (++y > 2))
//                x++;
//        }
//        System.out.println(x + " " + y);
//    }
//}
//z0 =1 1 false
//        z1  = 2 2 false
//        z2 = 3 true 2  x+1 = 4
//        z3 = 5 true 2 x= 6
//        z4 +1 = 7 true  2 x
//        z5 + 8 2
//
//false  || false

//
//class Titanic {
//    public static void main(String[] args) {
//        boolean b1 = true;
//        boolean b2 = false;
//        boolean b3 = true;
//        if((b1 & b2) | (b2 & b3) & b3)
//            System.out.print("alpha ");
//        if((b1 = false) | (b1 & b3) | (b1 | b2))
//            System.out.print("beta "); } }
//
//
//(true false) = false  | (false ) & true  = false //  false =>false
//

class Maybe {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.print(!false ^ false); //= true
        System.out.print(" " + (!b1 & (b2 = true)));// =    false
        System.out.println(" " + (b2 ^ b1)); //true|true = false
    }
}


