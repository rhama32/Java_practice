/*-< Sample1_04_1 >----------------------------------------
定価1000円の商品の税込価格を計算して表示。
消費税は10％で計算
---------------------------------------------------------*/

class practice3 {
	public static void main (String[] args) {
		int	teika   = 1000 ;             //定価の金額
		double zei = 1.10 ;             //消費税
		double gokei = teika * zei ;  //支払い額を計算
		System.out.println(gokei) ;       //支払い額を画面に表示
	}
}


class practice3 {
	public static void main (String[] args) {
		int	teika   = 1000 ;             //定価の金額
		double zei = 1.10 ;             //消費税
		double gokei = teika * zei ;  //支払い額を計算
		System.out.println(gokei) ;       //支払い額を画面に表示
	}
}

// intは整数専用の変数
//箱の中にはデータは一つのみ
//teikaの箱に1000（値）を代入
//変数を新しく作ること＝変数宣言
//_ スネークケース
//list_Gokei キャメルケース
