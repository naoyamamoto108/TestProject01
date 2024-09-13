
public class Test16 {

	public static void main(String[] args) {
		
		System.out.println(totalPrice(300) + "<br>");
		System.out.println(totalPrice(450) + "<br>");
		System.out.println(totalPrice(400) + "<br>");
		System.out.println(totalPrice(350) + "<br>");
		
		System.out.println("山田さん。" + hello());
		System.out.println("<br>");
		System.out.println("鈴木さん。" + hello());
		System.out.println("<br>");
		System.out.println("佐藤さん。" + hello());

		}
	
	public static int totalPrice(int fruitprice, double tax, int haiso) {
		return (int)(fruitprice * tax) + haiso;
	}
	public static int totalPrice(int fruitprice) {
		return totalPrice(fruitprice, 1.08, 350);
	}
	
	public static String hello() {
		return "こんにちは。";
	}
	
}
