
public class Test11 {

	public static void main(String[] args) {
		String[][] country1 = {
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"},
		};
		System.out.println(country1[0][0]);
		
		String[][] country2 = {
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"},
		};
		System.out.println(country2[0][1]);
		
		String[][] country3 = {
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"},
		};
		System.out.println(country3[1][0]);
		
		String[][] country4 = {
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"},
		};
		System.out.println(country4[2][1]);
		
		String[][] country5 = new String[3][2];
		country5[0][0] = "日本";
		country5[0][1] = "タイ";
		country5[1][0] = "アメリカ";
		country5[1][1] = "ブラジル";
		country5[2][0] = "フランス";
		country5[2][1] = "ロシア";
		System.out.println(country5[0][0]);
		
		String[][] country6 = new String[3][2];
		country6[0][0] = "日本";
		country6[0][1] = "タイ";
		country6[1][0] = "アメリカ";
		country6[1][1] = "ブラジル";
		country6[2][0] = "フランス";
		country6[2][1] = "ロシア";
		System.out.println(country6[1][1]);

	}

}
