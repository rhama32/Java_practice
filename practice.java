package com.example.mynavi.basic;
 
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

class Main {
  public static void main(String[] args) {
    int number = 12;
    
    // numberが20より小さいとき、どちらでもないときの条件分岐
    if (number < 10) {
      System.out.println("10より小さい");
    } else if(number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
    System.out.println("20以上");
    }
  }
}