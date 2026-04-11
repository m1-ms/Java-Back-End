package com.java; /// JAVA BASICS

// here it's your maim                           to write comment /* */ || //

/// Cout
/* package com.java;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Hello in java course");   // sout + enter
    }
}     */

///  DATA TYPES
/*
package com.java;

public class Main {

    public static void main(String[] args) {

        byte num1 = 127;           // -128 : 127                                                               // Size 1 byte
        short num2 = 1206;          // -32,768 : 32,767                                                        // Size 2 byte
        int num3 = 30020023;             // -2,147,483,648 : 2,147,483,647                                     // Size 4 byte
        long num4 = 765946129444584L;             // -9,223,372,036,854,775,808 : 9,223,372,036,854,775,807        // Size 8 byte
        // must write (L)  > in long

        float num5 = 50.6F;                     // -2,147,483,648 : 2,147,483,647                      // Size 4 byte
        // must write (F)  > in float
        double num6 = 505000.6522;             // -9,223,372,036,854,775,808 : 9,223,372,036,854,775,807             // Size 8 byte

        // to out ( true / false ):
        boolean answer1 = true;                       // Size 1 byte
        boolean answer2 = false;                      // Size 1 byte

        // to write a character
        char myChar = 'E';                            // Size 2 byte

        // to write a sentence
        String start = "Hi Student";

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(myChar);
        System.out.println(start);

        // >>  casting ان انت محتاج داتا طايب معينه فا مش عايز تغيرها
        نكتبها كالتالي ://
       // byte num1 = (byte) 12663;  (casting بيكون بين القوسين)

    }
}
*/

/// CASTING

/*
package com.java;

public class Main {

    public static void main(String[] args) {
                               // long > int > short
        int num1 = 5000;
        short num2 = (short) num1;              // short < int
        long num3 = num1;                       // long > int

        // we must casting when change from big to small but don't do casting from small to big


        /// Widening Casting (automatic)     ((from small to big no casting manually ))
        //  byte > short > char > int > float > double

        /// Narrowing Casting (manually)     ((from big to small must make Casting manually ))
        // double > float > long > int > char > short > byte
    }

}
*/

/// VARIABLES NAME  اسماء المتغيرات

/*
// مينفعش تحط حاجات محجوزة او ثابته في اللغة في المتغيرات و اغلب العلامات كذلك مينفعش تكتبها

// int > you write number
// string > you write name or another sentence
package com.java;

public class Main {

    public static void main(String[] args) {
        int numMahmoud = 15;
        int numGoo = 229;
        int numAli = 5662;

        String name = "Mahmoud";
        int age = 21;
    }
}
*/

/// CONVERT STRING TO ANY DATA - TYPE

/*
package com.java;

public class Main {

    public static void main(String[] args) {
        // string >> int                       ( Integer.paresInt() )  String
        // "50" >>  50
        String num1 = "50";
        int myNum1 = Integer.parseInt(num1);
        int result1 = myNum1 + 10;
        System.out.println(result1);

        // String >> long                      ( Long.paresLong() )         String
        // "50" >> 50
        String num2 = "50";
        Long myNum2 = Long.parseLong(num2);
        Long result2 = myNum2 + 10;
        System.out.println(result2);

        // String >> double                      ( Double.parseDouble() )    String
        // "5.2" >> 5.2
        String num3 = "5.2";
        double myNum3 = Double.parseDouble(num3);
        double result3 = myNum3 + 10;
        System.out.println(result3);

    }
}
*/

/// SCANNER ROUND 1

/*
package com.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // تغيير المتغير علي حسب العميل عايز اي

        String name;             // name = scanner.next();
        int num;                 // num = scanner.nextInt();
        float prise;             // prise = scanner.nextFloat();
        double age;              // age = scanner.nextDouble();
        char c;                  // c = scanner.next().charAt(0);

        Scanner scanner = new Scanner(System.in);             // class

        name = scanner.next();
        num = scanner.nextInt();
        prise = scanner.nextFloat();
        age = scanner.nextDouble();
        c = scanner.next().charAt(0);

        System.out.println(num);
        System.out.println(name);
        System.out.println(prise);
        System.out.println(age);
        System.out.println(c);
    }
}
*/

/// SCANNER ROUND 2

/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        name = scanner.next();      // بتجيب كلمة واحده بس
        name = scanner.nextLine();      // بتجيب السطر كله

        System.out.println("Result : ");
        System.out.println(name);

        // لو حطيت ln هيطبع كل حاجة في سطر اما لو مش كانت موجوده هتبقي كلها في سطر واحد
        // System.out.print("Result : ");
        // System.out.println(name);
    }
}

 */

/// OPERATOR

/*
package com.java;

public class Main {

    public static void main(String[] args) {

        // Operator ( + * - / % )

        double num1 = 5;
        double num2 = 10;

        double res1 = num1 + num2;
        System.out.println(res1);   // 15

        double res2 = num2 - num1;
        System.out.println(res2);   // 5

        double res3 = num1 * num2;
        System.out.println(res3);   // 50

        double res4 = num2 / num1;
        System.out.println(res4);   // 2

        double res5 = num1/num2;
        System.out.println(res5);   // 0.5
        System.out.println("___________________________");

        // % دي بتدل علي باقي القسمه
        System.out.println(num1%num2);
        System.out.println(9%4);
        System.out.println(9%2);
        System.out.println(18%7);
    }
}
*/

/*
package com.java;

public class Main {

    public static void main(String[] args) {
        // Operator ( increment ) ( decrement )
        // ++    --

        // ++ بتدل علي تزويد رقم واحد
        // -- بتدل علي نقص رقم واحد

//        int num1 = 5;
//        num1 ++;  //6
//        num1 ++;  //7
//        num1 ++;  //8
//        System.out.println(num1); //8

        // num ++   >> line >> ++
        // ++ num   >> ++ >> line
        // num --   >> line >> --
        // -- num   >> -- >> line

//        int num2 = 5;
//        num2--;   //4
//        num2--;   //3
//        System.out.println(num2); //3

         int num1 = 5;
         int num2 = 5;
        int res1 = num1++ + --num2 - ++num1 - num1--;
               //   5     +    4   -    6   -   6     = -3
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println(res1);

        int res2 = num1-- + ++num2;
               //   6     +    5   = 11
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println(res2);
    }
}
*/
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        // +=
        // -=
        int num1 = 10;
        int num2 = 20;

        num1 += 50;                // num1 = num1 + 50;    // 10 + 50 = 60
        num2 -=5;                  // num2 = num2 - 5;     // 20 - 5 = 15

        // ينفع تعمل الاتنين بيساوي بعض في كل حاجة

        System.out.println(num1);
        System.out.println(num2);
    }
}
*/
/*
package com.java;

public class Main {

    public static void main(String[] args) {

//        your name is ahmed?                NO = false
//        your age is 21?                    yes = true

        String name = "Mahmoud";
        boolean answer1 = true;
        boolean answer2 = false;
       // boolean > ( true / false ).
        System.out.println(answer1);
        System.out.println(answer2);
    }
}
*/

/// CONCATENATION
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        String info1 = "your name : ";
        String name = "Mahmoud";

        String info2 = "your age : ";
        int age = 21;

        System.out.print(info1);
        System.out.println(name);
        // your name : Mahmoud

// اما تحذف (ln) مش هيكون السطر خلص انما لو موجوده كدا السطر خلص

        System.out.print(info2);
        System.out.println(age);
        // your age : 21

        // >> Concatenation
        System.out.println(info1 + name);     // your name : Mahmoud
        System.out.println(info2 + age);      // your age : 21
    }
}
*/

/// PROJECT

/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             // information app
        /*

        System.out.println("------ Hi Sir ------");
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name : ");
        name = scanner.nextLine();   // Mahmoud Soliman

        double age;
        System.out.print("Enter your age : ");
        age = scanner.nextDouble();

        String phone;
        System.out.print("Enter your phone number : ");
        phone = scanner.next();

        String email;
        System.out.print("Enter your E-Mail : ");
        email = scanner.next();

        System.out.println("1. Your name is : " + name );
        System.out.println("2. Your age is : " + age );
        System.out.println("3. Your phone number is : " + phone );
        System.out.println("4. Your E-Mail is : " + email );

         */

        // Area of the square app
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of the square");
        double width;
        System.out.print("Enter the width : ");
        width = scanner.nextDouble();

        System.out.print(" Resalt : " + (width * width) );

 */

        // 50 $/h
        // 100$   in 2h
/*
        Scanner scanner = new Scanner(System.in);
        double hour;
        System.out.print("Enter Hours : ");
        hour = scanner.nextDouble();
        System.out.println(" >> Information : 50 $/H <<");
        System.out.println( " Salary is : " + (hour * 50) + " $");

    }
}

*/

/// ARRAY
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        // [ 5,50,62,78,90 ]
        // Array   >>   datatype  name [] = new datatype [number of array]

//        int num1 = 5;
//        int num2 = 50;
//        int num3 = 62;
//        int num4 = 78;
//        int num5 = 90;

        int nums[] = new int[5];
        nums[0] = 5;
        nums[1] = 50;
        nums[2] = 62;
        nums[3] = 78;
        nums[4] = 90;
        System.out.println(nums[2]);

        String names[] = new String[3];
        names[0] = "Mahmoud";
        names[1] = "Mohamed";
        names[2] = "Mo3az";
        System.out.println(names[0]);

        char charac[] = new char[6];
        charac[0] = 'M';
        charac[1] = 'S';
        charac[2] = 'A';
        charac[3] = 'X';
        charac[4] = 'N';
        charac[5] = 'E';
        System.out.println(charac[0]);
        System.out.println(charac[3]);
    }
}
*/

/// 2D ARRAY
/*
package com.java;

public class Main {

    public static void main(String[] args) {

        // 3*3
        //مصفوفه
//                                  0   1   2
//                               0  5   6   7      (0,0) (0,1) (0,2)
//                               1  2   3   4      (1,0) (1,1) (1,2)
//                               2  8   2   9      (2,0) (2,1) (2,2)

      //  int nums[] = new int[5];         // [ , , , , ]

        // عشان تعمل مصفوفه اتبع الاتي :
        int nums[][] = new int [3][3];
        nums[0][0] = 5;
        nums[0][1] = 6;
        nums[0][2] = 7;
        nums[1][0] = 2;
        nums[1][1] = 3;
        nums[1][2] = 4;
        nums[2][0] = 8;
        nums[2][1] = 2;
        nums[2][2] = 9;

        System.out.println(nums[0][1]);
        System.out.println(nums[1][0]);
        System.out.println(nums[2][2]);

    }
}
*/

/// IF CONDITION
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        //  if    |   else if   |   else
    /*  int shop1 = 0;
        int shop2 = 1;
        int shop3 = 1;

        // == لو حاجة بتساوي حاجة او لا

        if (shop1 == 0){
            System.out.println("yes buy fromshop1 and return");
        } else if (shop2 == 0) {
            System.out.println("yes buy from shop2 and return");
        } else if (shop3 == 1) {
            System.out.println("yes buy from shop3 and return");
        }
        else {
            System.out.println("return home");
        }

        int num = 200;

        if (num == 20){
            if (num/2 == 1){
                System.out.println("yes");
            } else if (num/2 == 10) {
                System.out.println("true");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("NAN");
        }
    }
}
*/


/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //         == يساوي             && و           || او
/*
        int num1 = 10;
        int num2 = 20;
        int num3 = 50;

//        if (num1 == 10) {
//            if (num2 == 20) {
//                System.out.println("yes");
//            }
//        }

        if (num1 == 10 && num2 == 20){      // لازم في الشرط الاتنين يكونو موجودين مينفعش واحد مش متحقق
            System.out.println("yes,it is and");
        }

        if (num1 == 10 || num2 == 20 || num3 == 50){      // هنا لازم واحده من دي او دي تتحقق في الشرط
            System.out.println("yes,it is or");
        }
        if (num1 == 10 && num2 == 200 || num3 == 50){
            System.out.println("yes,it is or");
        }


        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.print("Enter any number : ");
        x = scanner.nextDouble();

        if (x == 100 || x == 200 || x == 300 || x == 400 ){
            System.out.println("yes, it's number " + x);
        } else {
            System.out.println("no number");
        }
    }
} */

/// ABOUT STRING
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        String value1 = "val1";
        String value2 = "val2";

        if (value1 == value2){
            System.out.println("Yes =");
        } else {
            System.out.println("No =");
        }

        if (value1.equals(value2)){
            System.out.println("Yes ");
        } else {
            System.out.println("No ");
        }
    }
}
*/

/// EXERCISE

/*
package com.java;

public class Main {

    public static void main(String[] args) {
        int num1 = 50;   //52   //53   //55   //56   //56
        int num2 = 50;   //51   //51   //52   //51   //51
        int num3 = 60;   //60   //60   //60   //60   //60

        //  51 > 50 false || 51 == 50 false
        if (num1++ > num2 || ++num1 == num2++){
            System.out.println("if 1");
        }
        System.out.println(num1 + " - " + num2 + " - " + num3);


        // 53 >  51 true  ||
        if (++num1 > num2 || ++num1 == num2--) {
            System.out.println("if 2");
        }
        System.out.println(num1 + " - " + num2 + " - " + num3);


        //  54 > 50  true &&  55 == 52 false
        if (++num1 > num2 && ++num1 == num2++) {
            System.out.println("if 3");
        }
        System.out.println(num1 + " - " + num2 + " - " + num3);


       //   60 > 52 true &&  56 == 51 false
        if (num3 > num2 && ++num1 == --num2) {
            System.out.println("if 4");
        }
        System.out.println(num1 + " - " + num2 + " - " + num3);


        //  60 < 51 false &&
        if (num3 < num2 && num1++ == num2--) {
            System.out.println("if 5");
        }
        System.out.println(num1 + " - " + num2 + " - " + num3);

    }
}
*/

/// VARIABLES NAME
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        String n = " Mahmoud ";           // not BAD
        String name = " Mahmoud ";        // better
        double age = 21;                  // better
        double g = 21;                    // not bad

        System.out.println(n);
        System.out.println(name);

        System.out.println(age);
        System.out.println(g);
    }
} */

///  EXERCISE IF
/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        String name;
        System.out.print("Enter name :");
        name = scanner.next();
        System.out.print("Enter num : ");
        num = scanner.nextInt();

        if (num == 21 && name.equals("Mahmoud") || name.equals("mahmoud")){
            System.out.println("If 1");
        } else if (num == 10 || name.equals("Mahmoud")){
            System.out.println("If 2");
        } else if (num - 5 == 25) {
            System.out.println("IF 3");
        } else {
            System.out.println("Finish");
        }

        System.out.println(" the main : Mahmoud / mahmoud || 21");
    }
}
*/

/// FOR LOOP
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        // Mahmoud    21          1 2 3 4 5 6

        for (int start = 1 ; start <= 21 ; start ++){
            System.out.println(start + ". Mahmoud");
        }
    }
}
*/

/// EXERCISE FOR LOOP
/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // For loop
        // array 1D          2D

        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0 ; i <=4 ; i++){
            nums[i] = scanner.nextInt();
        }

//        int nums[] = new int[5];
//        nums[0] = 5;
//        nums[1] = 2;
//        nums[2] = 6;
//        nums[3] = 7;
//        nums[4] = 30;
        for (int i = 0 ; i <=4 ; i++){
            System.out.println(nums[i]);
        }

//        System.out.println(nums[0]);
//
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
//        System.out.println(nums[4]);
    }
}
*/

/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums[][] = new int[3][3];

//         0  1  2
//     0   5  6  2
//     1   4  2  1
//     2   7  8  9

        for (int i=0 ; i<=2 ; i++){
            for (int z=0 ; z<=2 ; z++){
                nums[i][z] = scanner.nextInt();

//        nums [0][0]
//        nums [0][1]
//        nums [0][2]
//        nums [1][0]
//        nums [1][1]
//        nums [1][2]
//        nums [2][0]
//        nums [2][1]
//        nums [2][2]
            }
        }

//        nums [0][0] = 5;
//        nums [0][1] = 6;
//        nums [0][2] = 2;
//        nums [1][0] = 4;
//        nums [1][1] = 2;
//        nums [1][2] = 1;
//        nums [2][0] = 7;
//        nums [2][1] = 8;
//        nums [2][2] = 9;

        for (int i=0 ; i<=2 ; i++) {
            for (int z = 0; z <= 2; z++) {
                System.out.print (nums [i][z] + "  ");
            }
            System.out.println( " ");
        }

//        System.out.println(nums [0][0] + "   " + nums[0][1] + "   " + nums[0][2]);
//        System.out.println("  ");
//        System.out.println(nums [1][0] + "   " + nums[1][1] + "   " + nums[1][2]);
//        System.out.println("  ");
//        System.out.println(nums [2][0] + "   " + nums[2][1] + "   " + nums[2][2]);
    }
}
*/


/*
package com.java;

public class Main {

    public static void main(String[] args) {
        //   ==    =   !=
        int num = 5;          // = : عشان تساوي قيمه بمتغير
        String name = "Mahmoud";

        // == : تستخدم للمقارنه بالتساوي

        // != : هل القيمتين لا تساوي بعد
    }
}
*/

/// WHILE LOOP
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        // while loop
        // Mahmoud 5

//        for (int i=1 ; i<=5 ; i++){
//            System.out.println("Mahmoud");
//        }

        int num = 5;
        while (num > 0){
            System.out.println(num + ". iam Mahmoud");
            num --;
        }
    }
}
*/

///  DIFFERENT FOR & WHILE
/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        for (int i=1 ; i<=20 ; i++){
//            System.out.println(i+ ". Iam Mahmoud");
//        }

        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i=1 ; i<= counter ; i++){
            System.out.println(i + "..  Fake Name");
        }

        while ( counter > 0) {
            System.out.println(counter+ ". Fuck You");
            counter--;
        }
    }
}
*/

///  DO WHILE
/*
package com.java;

public class Main {

    public static void main(String[] args) {
        int counter1 = 5;
        int counter2 = 5;

        while (counter1 > 0){
            System.out.println(counter1 + " while1");
            counter1--;
        }

        System.out.println("==================================");

        do {
            System.out.println(counter2 + " do while2");
            counter2--;
        } while (counter2 > 0);

// ======================================================================================

        int counter3 = 0;
        int counter4 = 0;

        while (counter3 > 0){
            System.out.println(counter3 + " while3");
            counter3--;
        }

        System.out.println("==================================");

        do {
            System.out.println(counter4 + " do while4");
            counter4--;
        } while (counter4 > 0);
    }
}
*/

/// CREATE SIMPLE PROGRAM
/*
package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int result = 0;

        do {
            System.out.println("1. Print name 5 time.");
            System.out.println("2. Print name n time.");
            System.out.println("3. Exist.");

            Scanner scanner = new Scanner(System.in);
            result = scanner.nextInt();

            if (result == 1){
                for (int i=1 ; i<=5 ; i++){
                    System.out.println(i + "- Hi Mahmoud.");
                }
            } else if (result == 2) {
                int times = scanner.nextInt();
                while (times > 0){
                    System.out.println(times + ". Fake Name.");
                    times --;
                }
            }
        } while (result !=3);
    }
}
*/

/// BREAK AND CONTINUE
/*
package com.java;

public class Main {

    public static void main(String[] args) {

        // break;    >> Exit

        // continue;  >> Skip

        for (int i=1 ; i<=20 ; i++) {
            System.out.println(i + ". FAKE.");
//            if (i % 15 == 0 ){
//                break;
//                }

            if (i == 5) {
                continue;
            }
            System.out.println(i + "- Mano");
        }
    }
}*/


 // Java