package hw1;
//4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

public class Circle {
	public static void main(String[] args){
		final double PI=3.1415;
		int r=5, d=5*2;
		double Area= PI*Math.pow(r,2);
		double C=PI*d;
		System.out.printf("圓面積=%.2f", Area);
		System.out.printf("圓周長=%.2f", C);
	
	}
}
