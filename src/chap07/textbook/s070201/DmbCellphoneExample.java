package chap07.textbook.s070201;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���","����",10);
		
		
		System.out.println("��: "+dmbCellphone.model);
		System.out.println("����: "+dmbCellphone.color);
		
	
	System.out.println("ä��"+ dmbCellphone.channel);
	
	dmbCellphone.powerOn();
	dmbCellphone.bell();
	dmbCellphone.sendVoice("��������");
	dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
	dmbCellphone.sendVoice("�ƿ� �ݰ����ϴ�.");
	dmbCellphone.hangUp();
	
	dmbCellphone.turnOnDmb();
	dmbCellphone.changeChannelDmb(12);
	dmbCellphone.turnOffDmb();
	
	}

}
