package one;

public class FamilyAccount {
	public static void main(String[] arguments) {
		
		String data = "��     ֧\t�˻����\t��֧���\t˵     ��\n";
		int amount = 1000;
		
		boolean isType = true ;
		
		do {
			System.out.println("---------------------------- x��ͥ��֧�������w ----------------------------");
			System.out.println("                                             1.  ��֧��ϸ");
			System.out.println("                                             2.  �Ǽ�����");
			System.out.println("                                             3.  �Ǽ�֧��");
			System.out.println("                                             4.  ��       ��");
			System.out.println("");
			System.out.println("                                             ��ѡ��<1-4>: ");
			System.out.println("");

			// ���÷�װ�� ���  ����ѡ��˵�������
			char menuVal = Utility.readMenuSelection();
			
			switch(menuVal) {
				case '1':
					System.out.println("---------------------------- x ��֧��ϸ w ----------------------------");
					System.out.println(data);
					System.out.println("------------------------------------------------- ---------------------");
					break;
					
				case '2':
					System.out.println("---------------------------- x �Ǽ����� w ----------------------------");
					System.out.print("����������� ");
					int momeny = Utility.readNumber();
					System.out.print("������˵���� ");
					String str = Utility.readString();
					data +="��     ��\t"+(amount+momeny)+"\t�˻����\t"+momeny+"\t"+str+"\n";
					System.out.println("---------------------------- x �Ǽ�����ɹ� w ------------------------");
					break;
					
				case '3':
					System.out.println("---------------------------- x �Ǽ�֧�� w ----------------------------");
					System.out.print("������֧���� ");
					int momenyO = Utility.readNumber();
					System.out.print("������˵���� ");
					String strO = Utility.readString();
					data +="֧     ��\t"+(amount-momenyO)+"\t�˻����\t"+momenyO+"\t"+strO+"\n";
					System.out.println("---------------------------- x �Ǽ�֧���ɹ� w -------------------------");
					break;
					
				case '4':
					System.out.println("ȷ�������˳���(Y.�˳�  N.ȡ��) ");
					System.out.println("��ѡ��");
					char exit =  Utility.readExit();
					if(exit == 'Y')
					{
						isType = false ;
						System.out.println("---------------------------- x �˳��ɹ� w ----------------------------");
					}
					break;
					
			}
		} while(isType);
	}
}
