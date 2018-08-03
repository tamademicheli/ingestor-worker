package sandbox.ingestorworker.sensor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TemperatureReceiver {




    @KafkaListener(topics = "${temperature.topic}")
    public void receive(String temperatureMeasure) {




    }
}
