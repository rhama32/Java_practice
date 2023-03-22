package com.example.mynavi.basic;


class Main {
  public static void main(String[] args) {
    String[] names = {"Tom", "John", "Mike"};
    
    // for文を用いて、「名前は◯◯です」と出力
    for(int i = 0; i < names.length; i++) {
    System.out.println("名前は" + names[i] + "です");
    }
  }
}


// public class Variable {
//   public static void main(String[] args) {
//     double num = 3.14;
//     System.out.println(num);

//小数点学習
// class Main {
//   public static void main(String[] args) {
//     double number1 = 11.5;
//     double number2 = 11.2;
//     System.out.println(number1 + number2);
//     System.out.println(number1 - number2);
//   }
// }


//自己連結
// class Main {
//   public static void main(String[] args) {
//     int month = 2;
//     int date = 1;
    
//     // 「2月1日」
//     System.out.println( month + "月" + date + "日");
//     System.out.println(2/1);
//     System.out.println(2.0/1.0);
//     System.out.println(2.0/1);
//   }
// }


//演習問題
// class Main {
//   public static void main(String[] args) {
//     // 変数nameに、好きな名前を代入してください
//     String name = "翔平";
    
//     // 変数ageに、好きな年齢を代入してください
//     int age = 28;
    
//     // 変数heightに、好きな身長を代入してください（例: 1.2）
//     double height = 192.5;
    
//     // 変数weightに、好きな体重を代入してください（例: 20.0）
//     double weight = 92.5;
    
//     // 変数bmiに、BMIを計算して代入してください
//     double bmi = weight / height / height;
    
//     // 名前、年齢、身長、体重、BMIに関する情報を出力してください
//     System.out.println("名前は" + name + "です");
//     System.out.println("年齢は" + age + "歳です");
//     System.out.println("身長は" + height + "mです");
//     System.out.println("体重は" + weight + "kgです");
//     System.out.println("bmiは" + bmi + "です" );
//   }
// }


// class Main {
//   public static void main(String[] args) {
//     // trueと出力
//     System.out.println(true || false);
    
//     // falseと出力
//     System.out.println(false && true);
    
//     // 「8 < 5」かつ「3 >= 2」の結果
//     System.out.println(8<5 && 3>2);
//     //false
    
//     // 「8 < 5」または「3 >= 2」の結果
//     System.out.println(8<5 || 3>=2);
//     //true
    
//     // 「8 < 5」でない、の結果
//     System.out.println(!(8<5));
//     //true
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     int number = 12;
    
//     // numberが20より小さいとき、どちらでもないときの条件分岐
//     if (number < 10) {
//       System.out.println("10より小さい");
//     } else if(number < 20) {
//       System.out.println("10以上、20より小さい");
//     } else {
//     System.out.println("20以上");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     int n = 1;
    
//     // switch文を用いて、変数nの値に応じて条件分岐
//   switch(n) {
//     case 1:
//       System.out.println("吉です");
//       break;
//     case 2:
//     System.out.println("末吉です");
//     break;
//   }
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     for(int i = 1; i <= 15; i++) {
//       System.out.println( i+ "回目");
//     }
//   }
// }


// class Main {
//   public static void main(String[] args) {
//     System.out.println("=== while文 ===");
//     int i = 1;
//     while (i < 10) {
//       // iが5の倍数のとき、繰り返し処理を終了
//       if(i % 5 == 0) {
//       break;
//       }
      
//       System.out.println(i);
//       i++;
//     }
    
//     System.out.println("=== for文 ===");
//     for (int j = 1; j < 10; j++) {
//       // jが3の倍数のとき、処理をスキップ
//       if(j % 3 == 0) {
//         continue;
//       }
//       System.out.println(j);
//     }
//   }
// }


// class Main {
//   public static void main(String[] args) {
//     // 変数languagesを定義し、配列を代入
//     String [] languages = {"Ruby", "PHP", "Python"};
    
//     // インデックス番号が「1」の要素を出力
//     System.out.println(languages[1]);
    
//     // インデックス番号が「1」の要素を「Java」で上書き
//     languages [1] = "Java";
    
//     // インデックス番号が「1」の要素を出力
//     System.out.println(languages[1]);
//   }
// }