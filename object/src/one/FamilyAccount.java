package one;

public class FamilyAccount {
	public static void main(String[] arguments) {
		
		String data = "收     支\t账户金额\t收支金额\t说     明\n";
		int amount = 1000;
		
		boolean isType = true ;
		
		do {
			System.out.println("---------------------------- x家庭收支记账软件w ----------------------------");
			System.out.println("                                             1.  收支明细");
			System.out.println("                                             2.  登记收入");
			System.out.println("                                             3.  登记支出");
			System.out.println("                                             4.  退       出");
			System.out.println("");
			System.out.println("                                             请选择<1-4>: ");
			System.out.println("");

			// 调用封装的 类库  输入选择菜单的数字
			char menuVal = Utility.readMenuSelection();
			
			switch(menuVal) {
				case '1':
					System.out.println("---------------------------- x 收支明细 w ----------------------------");
					System.out.println(data);
					System.out.println("------------------------------------------------- ---------------------");
					break;
					
				case '2':
					System.out.println("---------------------------- x 登记收入 w ----------------------------");
					System.out.print("请输入收入金额： ");
					int momeny = Utility.readNumber();
					System.out.print("请输入说明： ");
					String str = Utility.readString();
					data +="收     入\t"+(amount+momeny)+"\t账户金额\t"+momeny+"\t"+str+"\n";
					System.out.println("---------------------------- x 登记收入成功 w ------------------------");
					break;
					
				case '3':
					System.out.println("---------------------------- x 登记支出 w ----------------------------");
					System.out.print("请输入支出金额： ");
					int momenyO = Utility.readNumber();
					System.out.print("请输入说明： ");
					String strO = Utility.readString();
					data +="支     出\t"+(amount-momenyO)+"\t账户金额\t"+momenyO+"\t"+strO+"\n";
					System.out.println("---------------------------- x 登记支出成功 w -------------------------");
					break;
					
				case '4':
					System.out.println("确定现在退出？(Y.退出  N.取消) ");
					System.out.println("请选择：");
					char exit =  Utility.readExit();
					if(exit == 'Y')
					{
						isType = false ;
						System.out.println("---------------------------- x 退出成功 w ----------------------------");
					}
					break;
					
			}
		} while(isType);
	}
}
