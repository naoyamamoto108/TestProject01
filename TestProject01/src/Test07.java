
public class Test07 {

	public static void main(String[] args) {
		int a1 = 10;
		if(a1 < 20) {
			System.out.println("A");
		}
		
		int a2 = 20;
		if(a2 <= 30) {
			System.out.println("B");
		}
		
		String b1 = "山田";
		if(b1.equals("山田")) {
			System.out.println(b1 + "さん");
		}
		
		int a3 = 5;
		if(a3 < 10 && 3 < a3) {
			System.out.println("A");
		}
		
		int b2 = 5;
		if(b2 >= 5 || b2 <= 0) {
			System.out.println("B");
		}
		
		int a4 = 7;
		if(a4 > 8) {
			System.out.println("A");
		} else if(a4 < 10) {
			System.out.println("B");
		}
		
		int a5 = 11;
		if(a5 > 8) {
			System.out.println("A");
		} else if(a5 < 10) {
			System.out.println("B");
		}
		
		int a6 = 3;
		if(a6 > 5) {
			System.out.println("A");
		} else {
			System.out.println("Z");
		}
		
		int a7 = 20;
		if(a7 < 8) {
			System.out.println("A");
		} else if(a7 == 8) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		int b3 = 18;
		if(b3 >= 20) {
			System.out.println("成人");
		} else {
			System.out.println("未成年");	
		}
		
		int age = 35;
		if(age < 20) {
			System.out.println("未成年");
		} else if(age > 80) {
			System.out.println("高齢者");
		} else {
			System.out.println("成人");
		}
	
		int age1 = 35;
		if(age1 < 20) {
			System.out.println("未成年");
		} else if(age1 >= 20 && age <= 80) {
			System.out.println("成人");
		} else {
			System.out.println("高齢者");	
		}
		
		int a8 = 5;
		if(a8 % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	
	}

}
