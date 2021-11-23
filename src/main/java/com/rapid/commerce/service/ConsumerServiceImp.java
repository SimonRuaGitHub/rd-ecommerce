package com.rapid.commerce.service;

import com.rapid.commerce.exception.ConsumerNotFoundException;
import com.rapid.commerce.exception.NotFoundException;
import com.rapid.commerce.model.Consumer;
import com.rapid.commerce.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsumerServiceImp implements ConsumerService{

        private ConsumerRepository consumerRepository;

        public ConsumerServiceImp(ConsumerRepository consumerRepository){
               this.consumerRepository = consumerRepository;
        }

        @Override
        public Consumer getConsumer(String id) {

            try {
                return consumerRepository.getConsumerById(id);
            } catch (NotFoundException e) {
                throw new ConsumerNotFoundException(e);
            }
        }

}
