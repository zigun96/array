package sec02_string.EX03_SharingStringObject;

public class SharingStringObject {
	public static void main(String[] args) {
		String str1 = new String("�ȳ�");
		String str2 = "�ȳ�";
		String str3 = "�ȳ�";
		String str4 = new String("�ȳ�");
		
		// ���� �޸𸮰� ��(==)
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);
	}
}
