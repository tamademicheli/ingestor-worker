package sandbox.worker.temperature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import sandbox.repositories.TemperatureMeasure;
import sandbox.repositories.TemperatureMeasureRepository;

@Component
public class TemperatureReceiver {


    @Autowired
    TemperatureMeasureRepository temperatureMeasureRepository;


    @JmsListener(destination = "${temperature.topic}")
    public void receive(TemperatureMeasure temperatureMeasure) {
        System.err.println(temperatureMeasure);
        temperatureMeasureRepository.save(temperatureMeasure);
    }
}
