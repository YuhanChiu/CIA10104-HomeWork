package hw2;
//請建立一個TestNineNine.java程式,可輸出九九乘法表
// 一:使用for迴圈 + while迴圈
//二:使用for迴圈 + do while迴圈
//三:使用while迴圈 + do while迴圈

public class TestNineNine {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			
		}
		System.out.println("---------------------------------------------------------------");
	
		for (int i1 = 1; i1<= 9; i1++) {
			int j1 = 1;
			do {
				System.out.print(i1 +"*"+ j1 + "="+i1*j1 + "\t");
				j1++;
			} while (j1 <= 9);
			System.out.println();

		}
		System.out.println("---------------------------------------------------------------");
	
		int i2 = 1;
		while (i2 <= 9) {
			int j2 = 1;
			do {
				System.out.print(i2 + "*" + j2 + "=" + i2 * j2 + "\t");
				j2++;
			} while (j2 <= 9);
			System.out.println();
			i2++;
		}
	}
}

