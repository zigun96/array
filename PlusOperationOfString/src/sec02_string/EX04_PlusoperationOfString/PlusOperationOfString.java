package sec02_string.EX04_PlusoperationOfString;

public class PlusOperationOfString {
	public static void main (String[] args) {
		// ���ڿ� + ���ڿ�
		String str1 = "�ȳ�" + "�ϼ���" + "!";
		System.out.println(str1);
		
		String str2 = "�ݰ�";
		str2 += "���ϴ�";
		str2 += "!";
		System.out.println(str2);
		System.out.println();
		
		// ���ڿ� + �⺻ �ڷ��� �Ǵ� �⺻ �ڷ��� + ���ڿ�
		String str3 = "�ȳ�" + 1;
		String str4 = "�ȳ�" + String.valueOf(1);
		String str5 = "�ȳ�" + "1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		// ���ڿ��� �⺻ �ڷ��� ȥ��
		System.out.println(1 + "�ȳ�");
		System.out.println(1 + "�ȳ�" + 2);
		System.out.println("�ȳ�" + 1 + 2);
		System.out.println(1 + 2+ "�ȳ�");
		
	}
}
