package sec01_array.EX10_ArgumentOfMainMethod;

public class ArgumentOFMainMethod {
	public static void main (String[] args) {
		// args �迭�� ���� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		// �Է¸Ű����� ��� 1
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		}
		System.out.println();
		
		// �Է¸Ű����� ��� 2
		for(String s : args) {
			System.out.println(s);
			
		}
		System.out.println();
	}
}
