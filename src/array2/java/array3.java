package array2.java;

public class array3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) { //条件に合致する要素があればカウントする
				count++ ;
			}
		}
		System.out.println("50点以上の科目の数は:" + count + "科目");
	}
}
