package hw2;

//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

public class ProductWhile {

	public static void main(String[] args) {
		int n = 1, i = 1;
		while (i <= 10) {
			n *= i;
			i++;
		}
		System.out.println(n);
	}
}
