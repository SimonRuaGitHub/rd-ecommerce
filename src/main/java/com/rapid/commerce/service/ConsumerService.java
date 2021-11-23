package com.rapid.commerce.service;

import com.rapid.commerce.exception.ConsumerNotFoundException;
import com.rapid.commerce.model.Consumer;

public interface ConsumerService {

     Consumer getConsumer(String id) ;
}
