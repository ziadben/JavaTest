package jms;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;


public class Producer {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	       System.out.print("für:");
	       String code= scanner.nextLine();
   try {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Connection connection;
		connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createTopic("myTopic.topic");
//		Destination destination = session.createQueue("myqueue.queue");
		MessageProducer producer=session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText("Hallo");
		textMessage.setStringProperty("code", code);
		producer.send(textMessage);
		System.out.println("Message gesendet");
		session.close();
		connection.close();
	} catch (JMSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
