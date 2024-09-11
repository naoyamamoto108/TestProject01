
public class Test13 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int a = 0; a < 3; a++) {
			for(int b = 1; b < 4; b++) {
				System.out.println(b);
			}
		}
		
		int a1 = 10;
		String b1 = a1 >= 0 ? "プラス" : "マイナス";
		System.out.println(b1);
		
		int a2 = 2;
		String b2 = a2 % 2 == 0 ? "偶数" : "奇数";
		System.out.println(b2);
		
		for(int i = 0; i <= 5; i++) {
			String b = i % 2 == 0 ? "☆" : "★";
			System.out.println(b);
		}

	}

}
