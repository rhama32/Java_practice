
class practice7_1 {
	public static void main (String[] args) {
		
		byte  calc1_1 = 1 ;                              //(8行目)変更しないでください
		short calc1_2 = 2 ;                              //(9行目)変更しないでください
		long  calc1_3 = 300000000000L ;                   //(10行目)処理が正常に通るようにデバッグしてください
		long answer1 = calc1_1 + calc1_2 + calc1_3 ;    //(11行目)アンダーバーに適切な処理を埋めてください
		System.out.println( answer1 );                   //(12行目)「300000000003」が表示されているか確認してください
		
		byte   calc2_1 = 4 ;                             //(15行目)変更しないでください
		double calc2_2 = 5 ;                             //(16行目)変更しないでください
		int    calc2_3 = 6 ;                             //(17行目)変更しないでください
		double  answer2 = calc2_1 + calc2_2 + calc2_3 ;   //(18行目)アンダーバーに適切な処理を埋めてください
		System.out.println( answer2 );                   //(19行目)「15.0」が表示されているか確認してください
		
		
		short  calc3_1 = 7 ;                             //(22行目)変更しないでください
		String calc3_2 = "8" ;                           //(23行目)変更しないでください
		int    calc3_3 = 9 ;                             //(24行目)変更しないでください
		int    answer3 = calc3_1 + Integer.parseInt(calc3_2) + calc3_3 ;   //(25行目)処理が正常に通るようにデバッグしてください
		System.out.println( answer3 );                   //(26行目)「24」が表示されているか確認してください
		
		
		int    calc4_1 = 10 ;                            //(29行目)変更しないでください
		long   calc4_2 = 11 ;                            //(30行目)変更しないでください
		int    answer4 = calc4_1 + (int)calc4_2 ;             //(31行目)処理が正常に通るようにデバッグしてください（キャストを使用してください）
		System.out.println( answer4 );                   //(32行目)「21」が表示されているか確認してください
		
	}
}

//bite = 小さい箱
//short = 中箱
//long = 大きい箱
//→bite,short,longが続く場合にはlong型になる

//整数＋小数＝小数に変換される
//ex)15ではなく、15.0のようになる

//文字＋数字 = 文字になる
//これを数字に変換したい場合にはInteger.parseIntを使用して変換を行う。

//longをint型に変換したい時にはint()でキャストを行うとint型になる。
//これを行わないとオーバーフローとなりエラーが生じる。