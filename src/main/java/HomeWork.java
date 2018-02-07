/**
 * Created by Aleksandra on 07/02/2018.
 */
public class HomeWork {
  public static void main (String[] args) {

// 11.
//       int x = 5;
//        int y = 7;
//    System.out.print(((y * 2) % x)); //14/5 =4
//    System.out.print(""+(y % x));     //  7/5 = 2
//        //42?
//    }

//    12 ???
    //todo ASK
//  int r=1,x=11;
//  r+=x;
//  if((x>4)&&(x<10)){  // true&&false
//      r+=2*x;
//  }
//  else if (x<=4) { false ?
//    r+= 3*x;
//  }
//  else {
//    r+=4*x;
//  }
//  r+=5*x;
//  System.out.println(r);
//

//13.

//    int x=7,y=8;
//    if(x<y)  //true
//      if(x+2>y) //true
//        if(y<x);//true
//    else if (!false)
//      System.out.print("inner"); //stop here? because true already ? no need to go to the next?
//    else if(true)
//      System.out.print("middle");

//14.
//    boolean x =true;
//    boolean y=false;
//    int z=42;
//
//    if((z++==42)&&(y=true))   //f t = 43
//    z++;                       // 44
//    if((x=false)||(++z==45))  //t/t=t 45
//      z++; //46
//
//    System.out.println("z="+z); //46  ?
//
//  15.
//    int x =23%4; // 3 left
//
// 16.
//   int x = 32*(31-10*3);// 32* (31-30) = 32 ?
//
//  17.
    /* // - ok  */


//   18.
//    int a,b,c;
//    b=10;
//    a=b=c=20;
//    System.out.println(a); // run = 20 rewrite for all with ==

// 19.

    //(1/2+3/2+0.1); // found in internet :
    //  ((1/2) + (3/2) + 0.1) - uses as separate parts ?
    //((1/2) + (3/2) + 0.1) = ((0?) + (1?) + 0.1) = 1.1 ?
    // "/" - Деление нацело обрезает, а не округляет результат.

//20.????
    //todo ASK
//    (- -1-3*10 /5-1) ;
    // - (-1)-((3*10)/5)-1 = - (-1) - (30/5) -1 = -(-1) - 6 -1 =+1 -7 ? =-6 ?
 //21.

//    int k=1;
//    int i =++k +k++ + +k;  // ((++k) + (k++)) + (+k) =  ((2) + (2) + (+k)) = (4+3)= 7 ?
//    System.out.println(i);
    //(k+++k):   first evaluates k++                  //  sub-expression evaluates to 3,
    //  then post-increments k: k = 4
    //then evaluates (k++)+k               //  evaluates to 3+4 = 7

//
 //22.??? //todo ASK
//    int []array = {4,8,16};
//    int i = 1;
//    array[++i] = --i;
//    System.out.println(array [0] + array[1] + array[2]);
//

//23. ?
    //todo ASK

    //a. (1+2+"3") = 33 ok
    //b. "1"+2+3 =123 no
    //c.4+1.0f = ?
    //d.10/9 = 1 ok
    //e. 'a'+1  = ?


// //24. ?
//    int i =0;
//    for( ; i<10;i++);
//    for (i=0; ; i++) break;
//    for(i=0;i<10; )i++;
//    for(; ; );

//25. ??? when i==2 do it in both cases or just 1 ?  = continue replaced 4.3 ?
//    //todo ASK
//    int k=0;
//    int l=0;
//    for(int i=0;i<=3;i++) {
//      k++;
//
//      //i=0  t -> (i =1 -> k=1
//      // i=1  t  -> i=2 -> k=2 &l+1 =2
//      // i=2  t -> i=3 -> k= 3   & l+1=3
//      // i=3 t -> i=4 -> k=4
//
//      if (i == 2) continue;
//      l++;
//    }
//    System.out.println(k+ "," + l);

    //26. a += b	Краткая форма записи a = a + b i+=1 = i=0+1
//    //todo ASK
//    int i =0; int j=0;
//    boolean t = true; boolean r;
//    r=(t & 0 <(i+=1)); // true & 0 < (i=0+1=1?) = true
//    r=(t && 0 <(i+=2)); //t && 0 < (i=1+2=3? ) = true
//    r=(t | 0 <(j+=1)); // t | 0 < (j=0+1=1?) = true
//    r=(t || 0 <(j+=2)); // t || ->stop ??
//    System.out.println(i + "" +j); //i3j1? =3 1 ?

    //27.
    //todo ASK
//    if(true)
//      if(false)
//        System.out.println("a");
//    else
//      System.out.println("b"); // b? - if doesnt have any st??

    //28.??????
//    //TODO AKS
//    outer:
//    for (int i=0; i<3; i++) {
//      for(int j=0; j<2;j++) {
//        //i=0 i<3 true i=1
//        //i=1 i<3 true i=2
//        //i=2 i<3 true i=3
//        //i=3 i<3 f
//
//
//        //j=0 i<2 true j=1
//        //j=1 i<2 true j=2
//        //j=2 i<2 f
//
//        if (i == j) {
//          //i1 == j1
//          //i2==j2
//          continue outer;
//        }
//        System.out.println("i=" + i + ",j=" + j);
//      }
// }

//    //29.
//    int i=0;int j;
//    for (j=0;j<10;++j) {i++;}
//    System.out.println( i+ "" +j);
//
//    //j=0 j<10; j1 true i=1
//    //j=1 j=2 i=2
//    //j=2 j=3 i=3
//    //j=3 j=4 i=4
//    //j=4 j=5 i=5
//    //j=5 j=6 i=6
//    //j=6 j=7 i=7
//    //j=7 j=8 i=8
//    //j=8 j=9 i=9
//    //j=9 j=10 i=10
//    //j=10 f
//
//    //1010?

//30 ?
    //todo ASK
    // a??int j=10;
    //for(int i =0,j+=90;i<j;i++){j--;}


    //b?? for (int i=10; i=0;i--) {}???

    //c.
    //??for (int i =0,j=100;i<j;i++,--j){;}

    //d.int i,j;
    //for (j=100;i<j;j--) {i+=2;} no int i?


// /e.int i =100;
    //for ((i>0);i--){} ????
 }
}
