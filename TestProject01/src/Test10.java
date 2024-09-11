
public class Test10 {

	public static void main(String[] args) {
		String[] name1 = new String[3];
		name1[0] = "田中";
		name1[1] = "高橋";
		name1[2] = "斉藤";
		System.out.println(name1[0]);
		
		String[] name2 = {"田中","高橋","斉藤"};
		System.out.println(name2[0]);
	
		char[] c1 = {'x','y','z'};
		System.out.println(c1[0]);
		
		char[] c2 = {'x','y','z'};
		System.out.println(c2[1]);
		
		char[] c3 = {'x','y','z'};
		System.out.println(c3[2]);
		
		int[] i1 = {1,5,10};
		System.out.println(i1[0]);
		
		int[] i2 = {1,5,10};
		System.out.println(i2[1]);
		
		String[] name3 = {"田中","高橋","斉藤"};
		name3[0] = "加藤";
		System.out.println(name3[0]);
	}
}
