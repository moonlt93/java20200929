package chap07.textbook.s070201;

public class DmbCellphone extends Cellphone {

	
		int channel;
		
		DmbCellphone(String model,String color,int chnnel){
			this.model =model;
			this.color =color;
			this.channel =channel;
		}
		void turnOnDmb() {
			System.out.println("ä�� "+ channel +"�� dmb��� ������ �����մϴ�.");
		} void changeChannelDmb(int chnnel) {
			this.channel =channel;
			System.out.println("ä�� " +channel+"������ �ٲߴϴ�.");
		}
		void turnOffDmb(){
			System.out.println("Dmb ��� ������ ����ϴ�.");
		}
		
}


