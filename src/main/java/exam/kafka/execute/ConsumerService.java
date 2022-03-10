package exam.kafka.execute;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerService {

  @KafkaListener(topics = "kmw", groupId = "kmw-group")
  public void consume(String message) throws IOException {
    System.out.println("message = " + message);

  }
}
