package chap07.textbook.s070201;

public class DmbCellphone extends Cellphone {

	
		int channel;
		
		DmbCellphone(String model,String color,int chnnel){
			this.model =model;
			this.color =color;
			this.channel =channel;
		}
		void turnOnDmb() {
			System.out.println("채널 "+ channel +"번 dmb방송 수신을 시작합니다.");
		} void changeChannelDmb(int chnnel) {
			this.channel =channel;
			System.out.println("채널 " +channel+"번으로 바꿉니다.");
		}
		void turnOffDmb(){
			System.out.println("Dmb 방송 수신을 멈춥니다.");
		}
		
}


