package ����;
//�������α׷�
public class Program {
	 public static void main(String[] args) {
		 try{ // ������ ���� ��� �װ� �������� try ���� �ۼ�
			 Thread.sleep(1000);
			 int sum = Calculator.add(10040, 3); 
			 System.out.println("sum : "+sum);
		 }catch(��ȯ�Ұ����� aa) { //�ش��ϴ� ������ ó�����ִ� Ŭ������ü��  ��� �Ұ��� �Ʒ� ������ �����ش�.
			 //Exception �̰��� ���� ���ܻ�Ȳ�� ����ִ� Ŭ���� 
			 System.out.println(aa.getMessage());
			 // e.getMessage()
			 
		 }
		 catch(Exception aa) { //�ش��ϴ� ������ ó�����ִ� Ŭ������ü��  ��� �Ұ��� �Ʒ� ������ �����ش�.
			 //Exception �̰��� ���� ���ܻ�Ȳ�� ����ִ� Ŭ���� 
			 System.out.println("�˼��մϴ�. �ȵǳ׿�");
			 // e.getMessage()
			 
		 }
		 finally {
			 // ������� ������ �������� ������ �߻��Ѱ�� ����ó���� �ݾ������
			 //�̷� �������ϴ� �۾�
			  System.out.println("finally..");
		 }
		 System.out.println("����");
//		 catch (InterruptedException e) {
//			 System.out.println("�ФФ�");
//		 } 
	}
}
