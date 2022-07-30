import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue=new LinkedList<Message>();
		//messageŬ����
		messageQueue.offer(new Message("sendMail","����ȭ"));
		messageQueue.offer(new Message("sendSMS","BTS"));
		messageQueue.offer(new Message("sendKakaotalk","���"));
		
		while(!messageQueue.isEmpty()) {//queue�� ��Ұ� �������� ������
			Message message=messageQueue.poll();//message��ü�� queue�տ��ź��� �ֱ�
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to+"�Կ��� ������ �����ϴ�!");
					break;
				case "sendSMS":
					System.out.println(message.to+"�Կ��� SMS�� �����ϴ�!");
					break;
				case "sendKakaotalk":
					System.out.println(message.to+"�Կ��� īī������ �����ϴ�!");
					break;
			}
		}
	}

}
