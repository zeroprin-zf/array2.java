package array2.java;

public class array2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {20, 30, 40, 50, 80};//科目の数や点数変更したいときはここだけ修正する
		int sum = 0; //集計結果を入れるために初期化しておく
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; //一科目ずつ変数sumに合算する
			}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}
