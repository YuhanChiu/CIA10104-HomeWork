package hw2;

//請設計一隻JAVA程式，輸出結果如下： ASII A的位置是65
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Alphabet {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 0; i <= 5; i++) {
			for (j = 0; j <= i; j++) {
				k = 65 + i;
				char result = (char) k;
				System.out.print(result);
			}
			System.out.println();
		}
	}
}
