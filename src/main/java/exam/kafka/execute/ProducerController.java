package exam.kafka.execute;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Component
@RestController
public class ProducerController {

  private ProducerService producerService;

  public ProducerController(ProducerService producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/producer-send-message")
  public void sendMessage(String message) {
    log.info(">>> message = {} ", message);
    producerService.sendMessage(message);
  }
}
