/*
 * package za.co.assessment.swift;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import javax.jms.JMSException; import javax.jms.Message; import
 * javax.jms.Session; import javax.jms.TextMessage; import org.junit.Test;
 * import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jms.core.JmsTemplate; import
 * org.springframework.jms.core.MessageCreator; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; import
 * com.mockrunner.mock.jms.MockQueue; import
 * za.co.assessment.swift.application.PaymentRouterApplication;
 * 
 * 
 * //@RunWith(SpringRunner.class)
 * 
 * //@RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration("Beans.xml") //@SpringBootTest public class
 * PaymentRouterApplicationTests {
 * 
 * 
 * @Autowired private JmsTemplate jmsTemplate;
 * 
 * @Autowired private MockQueue mockQueue;
 * 
 * @Test public void consumeMessage() {
 * 
 * jmsTemplate.send(mockQueue, new MessageCreator() {
 * 
 * @Override public Message createMessage(Session session) throws JMSException {
 * TextMessage message = session.createTextMessage();
 * message.setText("Test message"); return message; } });
 * 
 * } }
 */