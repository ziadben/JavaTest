package jms;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer {
	public static void main(String[] args) {

		try {
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
			Connection connection = connectionFactory.createConnection();
			connection.start();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);// false: wie brauchen kein
																						// commit zu setzen,
			Destination destination = session.createTopic("myTopic.topic");																			// Transaction
//			Destination destination = session.createQueue("myqueue.queue");
			MessageConsumer consumer = session.createConsumer(destination);
			consumer.setMessageListener(new MessageListener() {

				public void onMessage(Message message) {
					if (message instanceof TextMessage) {
						try {
							TextMessage textMessage = (TextMessage) message;
							System.out.println("Message empfangen:"+textMessage.getText());
						} catch (JMSException e) {

							e.printStackTrace();
						}
					}

				}

			});

		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
