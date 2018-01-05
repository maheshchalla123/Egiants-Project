package com.egiants;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.util.Properties;
 
public class producer {
 
    public static void main(String args[]) {
 
        
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9091");
        props.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
 
        Producer<Integer, String> producer = new KafkaProducer<Integer, String>(props);
 
        for(int i = 0; i < 100; i++) {
            ProducerRecord producerRecord = new ProducerRecord<Integer, String>("my-topic", i, "Test Message #" + Integer.toString(i));
            producer.send(producerRecord);
        }
      producer.close();
    }
 
}


