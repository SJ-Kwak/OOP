import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue=new LinkedList<Message>();
		//message클래스
		messageQueue.offer(new Message("sendMail","김이화"));
		messageQueue.offer(new Message("sendSMS","BTS"));
		messageQueue.offer(new Message("sendKakaotalk","펭수"));
		
		while(!messageQueue.isEmpty()) {//queue에 요소가 남아있을 때까지
			Message message=messageQueue.poll();//message객체에 queue앞에거부터 넣기
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to+"님에게 메일을 보냅니다!");
					break;
				case "sendSMS":
					System.out.println(message.to+"님에게 SMS를 보냅니다!");
					break;
				case "sendKakaotalk":
					System.out.println(message.to+"님에게 카카오톡을 보냅니다!");
					break;
			}
		}
	}

}
