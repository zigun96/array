package sec01_array.EX03_InitailValue;

import java.util.Arrays;

public class InitialValue {
	public static void main (String[] args) {
		// ���� �޸𸮰�(���� �ʱ�ȭ ���� ����)
		int value1;
		// System.out.println(value1); // ���� java���� �����Ⱚ�� �������� ����
		int[] value2;
		// System.out.println(value2); // ����
		int value3 = 0; // 0���� �ʱ�ȭ
		System.out.println(value3);
		int[] value4 = null; // null�� �ʱ�ȭ
		System.out.println(value4);
		System.out.println();
		
		// @�� �޸��� �ʱ갪(���� �ʱ�ȭ)
		// @�⺻ �ڷ��� �迭
		boolean[] array1 = new boolean[3]; // false�� �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		int[] array2 = new int[3]; // 0���� �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		double[] array3 = new double[3]; // 0.0���� �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();
		
		// @���� �ڷ��� �迭
		String[] array4 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// �迭�� �� ���� ���
		System.out.println(Arrays.toString(array1)); // �迭(array1)�� �ϳ��� ��Ʈ�����ν� �ѹ��� ����ϰڴ�.
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}
}
