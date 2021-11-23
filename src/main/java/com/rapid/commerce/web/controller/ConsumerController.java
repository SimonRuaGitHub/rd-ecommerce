package com.rapid.commerce.web.controller;

import com.rapid.commerce.exception.ConsumerNotFoundException;
import com.rapid.commerce.model.Consumer;
import com.rapid.commerce.service.ConsumerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerController {

      private ConsumerService consumerService;

        public ConsumerController(ConsumerService consumerService) {
            this.consumerService = consumerService;
        }

      @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
      public ResponseEntity getConsumerById(@PathVariable String id){

          Consumer consumer = consumerService.getConsumer(id);

          return ResponseEntity.status(HttpStatus.OK).body(consumer);
      }
}
