package com.rapid.commerce.model;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CONSUMER_ADDRESS")
public class ConsumerAddress {

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private long id;

       @NotBlank(message = "Address is requiered")
       @Column(unique = true)
       private String address;

       @NotBlank(message = "City is required")
       private String city;

       @NotBlank(message = "Country is required")
       private String province;

       @NotBlank(message = "Consumer is required")
       @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "consumer_id", referencedColumnName = "id")
       private Consumer consumer;

       @NotBlank(message = "Active flag is required")
       private boolean active;

        public ConsumerAddress(int id, String address, String city, String province, Consumer consumer, boolean active) {
            this.id = id;
            this.address = address;
            this.city = city;
            this.province = province;
            this.consumer = consumer;
            this.active = active;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public Consumer getConsumer() {
            return consumer;
        }

        public void setConsumerId(Consumer consumerId) {
            this.consumer = consumer;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
}
