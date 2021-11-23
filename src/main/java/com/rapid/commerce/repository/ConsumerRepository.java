package com.rapid.commerce.repository;

import com.rapid.commerce.exception.ConsumerNotFoundException;
import com.rapid.commerce.exception.NotFoundException;
import com.rapid.commerce.model.Consumer;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ConsumerRepository {
        private Map<String, Consumer> consumersMap;

        public ConsumerRepository(){
            consumersMap = Map.of("1",new Consumer(), "2", new Consumer(), "3", new Consumer());
        }

      public Consumer getConsumerById(String id) throws NotFoundException {

        Consumer consumer = consumersMap.get(id);

        if(consumer == null)
            throw new NotFoundException("No existe consumer con ID: "+id);

        return consumer;
      }
}
