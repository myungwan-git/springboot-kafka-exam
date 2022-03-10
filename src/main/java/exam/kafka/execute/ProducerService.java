package exam.kafka.execute;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProducerService {

  private KafkaTemplate<String, String> kafkaTemplate;

  public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String message) {
    log.info(">>> ProducerService sendMessage execute !");
    System.out.println("message = " + message);
    this.kafkaTemplate.send("kmw", message);
  }

}
