package sec02_string.EX06_MethodOfString_2;

import java.util.Arrays;

public class MethodOfString_2 {
	public static void main (String[] args) {
		// ���ڿ� ����
		// @to:LowerCase(), toUpperCase()
		String str1 = "java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		// @replace()
		System.out.println(str1.replace("Study", "����"));
		
		// @substring()
		System.out.println(str1.substring(0, 5));
		
		// @split()
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		// @trim()
		System.out.println("  abc  ".trim());
		
		System.out.println();
		
		// ���ڿ��� ���� ��
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		// @stack �޸� ��(==): ��ġ(����) ��
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		// @equals(), equalsIgnoreCase(): ���� ��
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
				
	}
}
