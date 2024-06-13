
public class FizzBuzz {

	public static void main(String[] args) {
		// 1から100までの数値をループで処理する
		// for文：初期化式：numberを1で初期化
		// 条件式：numberが100未満の場合、ブロックの処理を行う
		// 変化式：ブロックの処理後に、numberをインクリメント
		for (int number = 1; number <= 100; number++) {
			// ブロック
			// if文：3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
			if ((number % 3) == 0 && (number % 5) == 0) {
				System.out.println("FizzBizz");
			// elseif文：3で割り切れる数値の場合、「Fizz」と表示する
			}else if ((number % 3) == 0) {
				System.out.println("Fizz");
			// elseif文：5で割り切れる数値の場合、「Buzz」と表示する
			}else if ((number % 5) == 0) {
				System.out.println("Bizz");
			// それ以外の数値は、その数値をそのまま表示する
			}else {
				System.out.println(number);
				
			}
		}
	}
}
