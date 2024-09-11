
public class Test09 {

	public static void main(String[] args) {
		int a1 = 1;
		switch(a1) {
		case 0:
			System.out.println("aは0に等しい");
			break;
		case 1:
			System.out.println("aは1に等しい");
			break;
		}
		
		int a2 = 5;
		switch(a2) {
		case 0:
			System.out.println("aは0に等しい");
			break;
		case 1:
			System.out.println("aは1に等しい");
			break;
		default:
			System.out.println("aは0でも1でもない");
		}
		
		String a3 = "赤";
		switch(a3) {
		case "赤":
			System.out.println("赤組です");
			break;
		case "白":
			System.out.println("白組です");
			break;
		}
		
		String a4 = "青";
		switch(a4) {
		case "赤":
			System.out.println("赤組です");
			break;
		case "白":
			System.out.println("白組です");
			break;
		default:
			System.out.println("エラーです");
		}

	}

}
